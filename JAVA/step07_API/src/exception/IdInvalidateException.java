package exception;

public class IdInvalidateException extends Exception{
	
	public IdInvalidateException() {}
	
	//특정 메세지로 상황에 적합한 예외 구성함을 의미
	public IdInvalidateException(String m) {  
		super(m);
	}
}
