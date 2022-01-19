package step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import model.domain.People;

public class StreamAPI1 {
	//step01 -double colon ������ ::
	public static void m1() {
		People p1 = new People("���缮",30);
		People p2 = new People("������",40);
		People p3 = new People("�迬��",20);
		
		//List<People> ��ȯ
		Arrays.asList(p1, p2, p3).forEach(System.out::println);
		
		System.out.println("---");
		List<People> datas = Arrays.asList(p1, p2, p3);
		for(People p : datas) {
			System.out.println(p);
		}
	}
	
	//step02 - stream api Ȱ��( -> ó���ϴ� ���ٽ� Ȱ��)
	public static void m2() {
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(3); //new Integer(3) ����ڽ�
		all.add(5); //new Integer(5) ����ڽ�
		all.add(2); //new Integer(2) ����ڽ�
		all.add(8); //new Integer(8) ����ڽ�

		//stream ��ü�� ��ȯ -> 6������ �����͸� ���� <= 6 -> int��ȯ
		//filter �޼ҵ� ��ȯ���� String Ÿ�� ���� ������ ���ؼ� mapToInt() ȣ���ؼ� int�� ��ȯ
		int r = all.stream().filter(v -> v <= 6).mapToInt(i -> i).sum();
		System.out.println(r);
		
		System.out.println("-----");
		//�ټ��� ������ �߿� 70�� �Ѵ� ������ ���
		List<Integer> datas = Arrays.asList(10, 40, 50, 70, 20, 80, 50);
		datas.stream().filter(v -> v >= 70).forEach(System.out::println);
		
		Arrays.asList(10, 40, 50, 70, 20, 80, 50).stream().filter(v -> v >= 70).forEach(System.out::println);
		
		System.out.println("****");
		System.out.println(all.stream().filter(v -> v <= 6 ).mapToInt(i -> i).count());
		System.out.println(all.stream().filter(v -> v <= 6 ).mapToInt(i -> i).max()); //5���� ������ Optionalrorcp
		System.out.println(all.stream().filter(v -> v <= 6 ).mapToInt(i -> i).max().getAsInt()); // Optional��ü�� ���빰 ��ȯ
		
		System.out.println("****");//�ε��� �������� skip(2)
		Arrays.asList(10, 40, 50, 70, 20, 80, 50).stream().skip(2).forEach(System.out::println);
	}
	
	public static void m3() {
		System.out.println("--- forEach : �ݺ� ---");
		Arrays.asList(1, 2, 3).stream().forEach(System.out::println);
		
		System.out.println("--- map : ����Ʈ�� �ִ� ����� ���� ���� �� ��� ---");
		Arrays.asList(1, 2, 3).stream().map(i -> i*i).forEach(System.out::println);
		
		System.out.println("--- skip : �ε��� ���������� ��Ҹ� �����ϰ� ���ο� Stream ���� �� ��� ---");
		Arrays.asList(1, 2, 3).stream().skip(2).forEach(System.out::println);
		
		System.out.println("--- limit : ������ �ε��� ���������� ��� ���� �� ��� ---");
		Arrays.asList(1, 2, 3).stream().limit(2).forEach(System.out::println);
		
		System.out.println("--- filter : Stream�� ��Ҹ��� ���ǽ��� �����ϴ� ��ҷθ� ������ Stream ��ȯ �� ��� ---");
		Arrays.asList(1, 2, 3).stream().filter(i -> i <=2).forEach(System.out::println);
		
		System.out.println("--- flatMap : Stream ���ο� �ִ� ��ü���� �����Ͽ� Stream ��ȯ ---");
		Arrays.asList(Arrays.asList(1, 2), Arrays.asList(10, 20), Arrays.asList(100, 200)).stream().flatMap(i -> i.stream()).forEach(System.out::println);
		
		System.out.println("--- reduce : Stream�� ���� ��ҷ� ��ȯ ---");
		System.out.println(Arrays.asList(1, 2, 3).stream().reduce((v1, v2) -> v1 + v2).get());
		System.out.println(Arrays.asList(1, 2, 3).stream().reduce((v1, v2) -> v1 - v2).get());
		
		System.out.println("--- collect() or iterator() : �ݷ��� ��ü�� ����� ��ȯ ---");
		System.out.println(Arrays.asList(1, 2, 3).stream().collect(Collectors.toList()));
		Arrays.asList(1,2,3).stream().iterator().forEachRemaining(System.out::println);
	}

	
	public static void main(String[] args) {
		m3();
	}
}
