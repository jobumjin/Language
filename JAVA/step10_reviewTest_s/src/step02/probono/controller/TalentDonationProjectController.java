package step02.probono.controller;

import step02.probono.exception.ProjectNameDuplicationException;
import step02.probono.exception.ProjectNotFoundException;
import step02.probono.model.dto.Beneficiary;
import step02.probono.model.dto.Donator;
import step02.probono.model.dto.TalentDonationProject;
import step02.probono.service.TalentDonationProjectService;
import step02.probono.view.EndFailView;
import step02.probono.view.EndView;

public class TalentDonationProjectController {
	
	private static TalentDonationProjectController instance = new TalentDonationProjectController();
	
	private TalentDonationProjectService service = TalentDonationProjectService.getInstance();
	
	private TalentDonationProjectController() {}
	
	public static TalentDonationProjectController getInstance() {
		return instance;
	}
	
	public void getDonationProject(String projectName) {
		
		try{
			
			EndView.projectView(service.getDonationProject(projectName));
		
		}catch (ProjectNotFoundException e) {
			e.printStackTrace();	//개발 및 관리자만 보는 콘솔창 메세지
			EndFailView.failView(e.getMessage());	//end user에게 출력하는 서비스 메세지
		}
		
	}
	/* Service로 부터 메소드 호출한 결고값을 받아서
	 * 혹여 데이터가 존재하나 검증
	 * 	- 미존재시	- 진행되는 프로젝트가 없습니다.
	 * 	- 존재시 - 출력
	 * 
	 * 개발 방법
	 * 경우의 수 1 : 요청 방식의 에러
	 * 		에러 처리 화면 출력
	 * 경우의 수 2 : 요청
	 * 	데이터 없다
	 * 		1. 예외처리로 개발
	 * 		2. 단순 메세지 출력으로 개발
	 * 	데이터가 있다. 
	 */
	public void getDonationProjectsList() {
		EndView.projectListView(service.getDonationProjectsList());
	}
	
	/* 고려사항
	 * 1. service로 부터 정상 저장 or 예외 발생
	 * 2. client로 부터 입력된 데이터 존재 여부 검증
	 * 
	 */
	public void donationProjectInsert(TalentDonationProject project) {
		if(project != null) {
			try {
				service.donationProjectInsert(project);
			} catch (ProjectNameDuplicationException e) {
				e.printStackTrace();
				EndFailView.failView(e.getMessage());
			}			
		}else {
			EndFailView.failView("저장하고자 하는 데이터 자체가 없습니다.");
		}
	}
	
	/* db에 있는 데이터 실제 갱신 및 검색
	 * 갱신 성공, db접속 문제등 다양한 경우의 수 발생
	 * 
	 */
	public void donationProjectUpdate(String projectName, Donator people) {
		
		if(projectName != null && people != null) {
					
			boolean result = service.donationProjectUpdate(projectName, people);//update
			
			if(result) {	//true인 경우 수정 성공
				try {
					EndView.projectView(service.getDonationProject(projectName));//select
				} catch (ProjectNotFoundException e) {
					e.printStackTrace();
					EndFailView.failView("기부자 갱신 후 검색 실패");
				}
			}else {
				EndFailView.failView("미 존재하는 프로젝트 수정 시도");
			}
		
		}else {
			EndFailView.failView("기부자 갱신 정보 제대로 입력하세요!!!");
		}
	
	}
	
	public void beneficiaryProjectUpdate(String projectName, Beneficiary people) {
	
		if(projectName != null && people != null) {
		
			try{
				service.beneficiaryProjectUpdate(projectName, people);
				EndView.successView("수혜자 정보 갱신 성공");
			} catch(ProjectNotFoundException e) {
				e.printStackTrace();
				EndFailView.failView(e.getMessage());
			}
			
		}else{
			EndFailView.failView("수혜자 갱신 정보 제대로 입력하세요!!!");
		}
	}
	
	// 참조 타입의 데이터 존재 여부 검증값 = null(참조하는 객체가 없다는 참조 타입의 기본값)
	
	public void donationProjectDelete(String projectName) {
	
		if(projectName != null) {
		
			boolean result = service.donationProjectDelete(projectName);
		
			if(result) {
				EndView.successView(projectName + "프로젝트 삭제 성공");
			}else {
				EndFailView.failView("삭제하려는 프로젝트가 미 존재합니다.");
			}
			
		}else {
			EndFailView.failView("삭제하려는 프로젝트명 입력하세요.");
		}
	}

}
