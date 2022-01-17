/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  EndView.java
 * DESC  : 재능 기부 정보 출력 클래스
 * 
 * @author  
 * @version 1.0
*/

package step02.probono.view;

import java.util.ArrayList;

import step02.probono.model.dto.TalentDonationProject;

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
	public static void projectListView(ArrayList<TalentDonationProject> allProbonoProject){
		/*for(TalentDonationProject t : allProbonoProject) {
			if(t != null)
				System.out.println(t);
		}
		*/
		if(allProbonoProject != null) {
			int projectSize = allProbonoProject.size();  
			
			for(int index = 0; index < projectSize; index++){	
				if(allProbonoProject.get(index) != null){
					System.out.println("[진행 중인 project : " + (index+1) + "] " + allProbonoProject.get(index));
				}
			}
		}else {
			System.out.println("현 진행중인 project는 미존재합니다");
		}
	}
	
	//서비스 로직 성공시에 단순 메세지 출력
	public static void successView(String message) {
		System.out.println(message);
	}
	
}
