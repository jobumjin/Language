/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  TalentDonationProjectService.java
 * DESC  :  재능 기부 프로젝트를 저장, 수정, 삭제, 검색하는 서비스 로직
 * 
 * @author  
 * @version 1.0
*/

package step02.probono.service;

import java.util.ArrayList;

import step02.probono.exception.ProjectNameDuplicationException;
import step02.probono.exception.ProjectNotFoundException;
import step02.probono.model.dto.Beneficiary;
import step02.probono.model.dto.Donator;
import step02.probono.model.dto.TalentDonationProject;

public class TalentDonationProjectService {

	private static TalentDonationProjectService instance = new TalentDonationProjectService();

	/** 진행중인 Project를 저장하는 배열 */
	private ArrayList<TalentDonationProject> donationProjectList = new ArrayList<TalentDonationProject>();

	private TalentDonationProjectService() {}

	public static TalentDonationProjectService getInstance() {
		return instance;
	}
	

	/**
	 * 모든 Project 검색
	 * 
	 * @return 모든 Project
	 */
	public ArrayList<TalentDonationProject> getDonationProjectsList() {
		
		return donationProjectList;

	}
	
	
	// TO DO
	/** 
	 * Project 이름으로 검색 - 객체된 Project 반환하기
	 * 
	 * @param projectName 프로젝트 이름
	 * @return TalentDonationProject 검색된 프로젝트 
	 */

	/* 1차 개선
	 * 없을경우 ProjectNotFoundException 생성 및 반환
	 * 존재 할 경우 해당 project 반환
	 * 없을 경우 ProjectNotFoundException 발생
	 * 
	 * 2차 개선
	 * 	- EndView 직접 호출
	 * 	- 단, 예외 처리가 고려되지 않음
	 * 
	 * 3차 개선
	 * 	- controller 와 model 로 구분
	 * 	- controller 에서 예외 발생? 정상응답? 처리
	 */
	public TalentDonationProject getDonationProject(String projectName) throws ProjectNotFoundException {
		
		for(TalentDonationProject e : donationProjectList) {
			if(e.getTalentDonationProjectName().equals(projectName)) {
//				EndView.projectView(e);
//				break;
				return e;
			}
		}
		throw new ProjectNotFoundException("요청하신 project는 존재하지 않습니다.");
	}
	

	// TO DO
	/**
	 * 새로운 Project 추가 
	 * 
	 * @param project 저장하고자 하는 새로운 프로젝트
	 */
	/* 동일한 이름의 프로젝트로 새로 저장시도시에는 거부해야하는 로직
	 * 개발 방식
	 * 1. 동일하지 않다 - 정상 저장
	 * 2. 동일하다 - 거부
	 * 		예외 발생?
	 * 			DB사용시 중복 불허 기능이 예외 발생
	 * 		문자열 반환?
	 * 		boolean 반환?
	 * 		...
	 * 
	 */
	public void donationProjectInsert(TalentDonationProject project) throws ProjectNameDuplicationException {

		for(TalentDonationProject e : donationProjectList) {
			if(e.getTalentDonationProjectName().equals(project.getTalentDonationProjectName())) {
				throw new ProjectNameDuplicationException("이미 존재하는 Project입니다");
			}
		}
		
		donationProjectList.add(project);
	}

	
	/**
	 * Project의 기부자 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 기부자 수정
	 * 
	 * @param projectName 프로젝트 이름
	 * @param people 기부자 
	 */
	/* 존재하는 project에 한해서 기부자 수정
	 * 고려사항 
	 * 경우의 수 1 - 프로젝트 존재할 경우 수정
	 * 경우의 수 2 - 미 존재할 경우
	 * 		예외발생 또는 boolean 반환 ...
	 * 
	 * 이번 경우 - boolean 반환
	 * 	- boolean 값 획득하는 곳은 controller
	 * 		false : update 실패
	 *  	true : update 성공
	 * 
	 */
	public boolean donationProjectUpdate(String projectName, Donator people) {
		for(TalentDonationProject project : donationProjectList) {
			if(project.getTalentDonationProjectName().equals(projectName)) {
				project.setProjectDonator(people);
				return true;
			}
		}
		return false;
	}
	
	//TO DO
	/**
	 * Project의 수혜자 수정 - 프로젝트 명으로 검색해서 해당 프로젝트의 수혜자 수정
	 * 
	 * @param projectName 프로젝트 이름
	 * @param people 수혜자 
	 */
	
	//? 갱신하고자 하는 프로젝트가 미 존재시 ProjectNotFoundException 발생하기 추가
	/* 존재하는 프로젝트인 경우 - 수정성공
	 * 미존재하는 프로젝트인 경우 - 예외 발생
	 * 
	 * 이 메소드 호출하는 곳에선 어떻게 성공여부 확인?
	 * - 미 존재할 경우 예외처리
	 * - 예외 발생이 안 될경우 수정으로 처리
	 * 
	 */
	public void beneficiaryProjectUpdate(String projectName, Beneficiary people) throws ProjectNotFoundException{
		for(TalentDonationProject e : donationProjectList) {
			if(e != null && e.getTalentDonationProjectName().equals(projectName)) {
				e.setProjectBeneficiary(people);
				return ; //return뒤에 반환값이 없음 즉 void인 메소드 자체 종료시 return;으로 처리하기도 함
//				break;
			}
		}	
		
		throw new ProjectNotFoundException("수혜자 정보를 수정하고자 하는 프로젝트가 미 존재합니다.");
		
	}
	
	
	//TO DO
	/**
	 * Project 삭제 - 프로젝트 명으로 해당 프로젝트 삭제
	 * 
	 * @param projectName 삭제하고자 하는 프로젝트 이름
	 */
	public boolean donationProjectDelete(String projectName) {
		TalentDonationProject project = null;
		int count = donationProjectList.size();
		
		for(int i=0; i<count; i++) {
			project = donationProjectList.get(i);
			if(project.getTalentDonationProjectName().equals(projectName)) {
				donationProjectList.remove(i);
				return true;
			}
		}		
		return false;
	}

	
	/**
	 * 진행중인 Project 총 개수 반환
	 * @return 개수
	 */
	public int projectListSize() {
		return donationProjectList.size();
		//return index;
	}
}
