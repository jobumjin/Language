package step01.log4jtest;

import org.apache.log4j.Logger;

public class Log4jTest {
	//Logger 객체가 singleton으로 개발되어 있음
	//Log4jTest 실행시 기록 등록
	static Logger logger = Logger.getLogger("step01.log4jtest.Log4jTest");
	
	public static void Login(String id) {
		if(id.equals("playdata")) {
			logger.trace("trace");
			logger.debug("debug");
			logger.info("info");
			logger.error("error");
		}else {
			logger.warn("warn - " + id);
			System.out.println("id 무효 ------------");
		}
	}
	
	public static void Logout(String id) {
		//..언제 시간 체크로 작동도 구현
		
	}
	
	public static void main(String[] args) {
		Login("playdata");
	}

}
