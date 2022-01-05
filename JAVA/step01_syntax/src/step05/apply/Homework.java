package step05.apply;

public class Homework {
	int i;
	static int i2;
	
	Homework(){
		i++;
		i2++;
	}
	
	public static void main(String[] args) {
		Homework h = new Homework();
		Homework h1 = new Homework();
		Homework h2 = new Homework();
		System.out.println(h2.i2 + " " + h1.i + " " + i2);
		int a = 3;
		System.out.println(Float.toString((float) a));
		
	}
	
	static {
		System.out.println("어디에 출력될까?");
	}

}

/* 1번 문제 : 몇번째 줄에 "어디에 출력될까"가 출력될까요?
 * 답 : 첫번째 줄
 * 2번 문제 : 출력 값은?
 *	public static void main(String[] args) {
 *		Homework h = new Homework();
 *		Homework h1 = new Homework();
 *		Homework h2 = new Homework();
 *		System.out.println(h.i2 + " " + h1.i + " " + i2);
 *	}
 * 답 : 3 1 3
 * 3번 문제 : 마지막 줄에 3이 주어졌을때 "3.0"의 문자열로 출력하는 방법
 */



