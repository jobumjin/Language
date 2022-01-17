/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  EndView.java
 * DESC  : 재능 기부 정보 출력 클래스
 * 
 * @author  
 * @version 1.0
*/

package step01.probono.view;

import step01.probono.model.dto.TalentDonationProject;

public class EndView {
	
	//진행중인 특정 프로젝트 출력 
	public static void projectView(TalentDonationProject project){
		if(project != null) {
			System.out.println(project);		
		}else {
			System.out.println("해당 프로젝트는 존재하지 않습니다.");
		}
	}
	
	//TO DO
	//진행중인 모든 프로젝트 출력
		public static void projectListView(TalentDonationProject [] allProbonoProject){
			int projectSize = allProbonoProject.length;  //배열의 메모리 크기 : 10을 의미
			
			
			for(int index = 0; index < projectSize; index++){	//0~9까지의 기준으로 10번 반복시도
				
				//데이터 현 개수는 10개의 메모리 상에 3개의 데이터만 존재
				//데이터가 없는 경우엔 배열에 null 값 보유 따라서 null 이 아닌 경우에만 결과값 출력 
				if(allProbonoProject[index] != null){
					System.out.println("[진행 중인 project : " + (index+1) + "] " + allProbonoProject[index]);
				}
			}
		}

}
