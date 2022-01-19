package step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import model.domain.People;

public class StreamAPI1 {
	//step01 -double colon 연산자 ::
	public static void m1() {
		People p1 = new People("유재석",30);
		People p2 = new People("백종원",40);
		People p3 = new People("김연아",20);
		
		//List<People> 반환
		Arrays.asList(p1, p2, p3).forEach(System.out::println);
		
		System.out.println("---");
		List<People> datas = Arrays.asList(p1, p2, p3);
		for(People p : datas) {
			System.out.println(p);
		}
	}
	
	//step02 - stream api 활용( -> 처리하는 람다식 활용)
	public static void m2() {
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(3); //new Integer(3) 오토박싱
		all.add(5); //new Integer(5) 오토박싱
		all.add(2); //new Integer(2) 오토박싱
		all.add(8); //new Integer(8) 오토박싱

		//stream 객체로 변환 -> 6이하인 데이터만 정제 <= 6 -> int변환
		//filter 메소드 반환값은 String 타입 따라서 연산을 위해서 mapToInt() 호출해서 int로 변환
		int r = all.stream().filter(v -> v <= 6).mapToInt(i -> i).sum();
		System.out.println(r);
		
		System.out.println("-----");
		//다수의 점수들 중에 70점 넘는 점수만 출력
		List<Integer> datas = Arrays.asList(10, 40, 50, 70, 20, 80, 50);
		datas.stream().filter(v -> v >= 70).forEach(System.out::println);
		
		Arrays.asList(10, 40, 50, 70, 20, 80, 50).stream().filter(v -> v >= 70).forEach(System.out::println);
		
		System.out.println("****");
		System.out.println(all.stream().filter(v -> v <= 6 ).mapToInt(i -> i).count());
		System.out.println(all.stream().filter(v -> v <= 6 ).mapToInt(i -> i).max()); //5값을 보유한 Optionalrorcp
		System.out.println(all.stream().filter(v -> v <= 6 ).mapToInt(i -> i).max().getAsInt()); // Optional객체의 내용물 반환
		
		System.out.println("****");//인덱스 이전까지 skip(2)
		Arrays.asList(10, 40, 50, 70, 20, 80, 50).stream().skip(2).forEach(System.out::println);
	}
	
	public static void m3() {
		System.out.println("--- forEach : 반복 ---");
		Arrays.asList(1, 2, 3).stream().forEach(System.out::println);
		
		System.out.println("--- map : 리스트에 있는 요소의 제곱 연산 및 출력 ---");
		Arrays.asList(1, 2, 3).stream().map(i -> i*i).forEach(System.out::println);
		
		System.out.println("--- skip : 인덱스 이전까지의 요소를 제외하고 새로운 Stream 생성 및 출력 ---");
		Arrays.asList(1, 2, 3).stream().skip(2).forEach(System.out::println);
		
		System.out.println("--- limit : 선언한 인덱스 이전까지의 요소 추출 및 출력 ---");
		Arrays.asList(1, 2, 3).stream().limit(2).forEach(System.out::println);
		
		System.out.println("--- filter : Stream의 요소마다 조건식을 만족하는 요소로만 구성된 Stream 반환 및 출력 ---");
		Arrays.asList(1, 2, 3).stream().filter(i -> i <=2).forEach(System.out::println);
		
		System.out.println("--- flatMap : Stream 내부에 있는 객체들을 연결하여 Stream 반환 ---");
		Arrays.asList(Arrays.asList(1, 2), Arrays.asList(10, 20), Arrays.asList(100, 200)).stream().flatMap(i -> i.stream()).forEach(System.out::println);
		
		System.out.println("--- reduce : Stream의 단일 요소로 반환 ---");
		System.out.println(Arrays.asList(1, 2, 3).stream().reduce((v1, v2) -> v1 + v2).get());
		System.out.println(Arrays.asList(1, 2, 3).stream().reduce((v1, v2) -> v1 - v2).get());
		
		System.out.println("--- collect() or iterator() : 콜렉션 객체를 만들어 반환 ---");
		System.out.println(Arrays.asList(1, 2, 3).stream().collect(Collectors.toList()));
		Arrays.asList(1,2,3).stream().iterator().forEachRemaining(System.out::println);
	}

	
	public static void main(String[] args) {
		m3();
	}
}
