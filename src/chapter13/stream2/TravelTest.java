package chapter13.stream2;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {

		//객체 생성
		//CustomerLee "이순신", 40, 100
		//CustomerKim  "김유신", 20, 100 
 		//CustomerHong "홍길동", 13,50
		TravelCustomer CustomerLee = new TravelCustomer("이순신",40,100);
		TravelCustomer CustomerKim = new TravelCustomer("김유신",20,80);
		TravelCustomer CustomerHong = new TravelCustomer("홍길동",13,50);
		
		//List 컬렉션 구현클래서 ArrayList사용 customerList 이름으로 위의 객체를 3개 추가 작성
		//객체의 저장과정과 비슷하지만 배열은 힙영역의 기억장소에 [0]customerlee~[2]customerhonh가 들어가 있다.
		// 이 기억장소의 번지수가 스택영역으로 드러감.
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(CustomerLee);
		customerList.add(CustomerKim);
		customerList.add(CustomerHong);
		
		System.out.println("---고객명단 추가된 순서대로 출력---");
		//map():일부를 참조 할 때 사용(객체의 이름, 나이, 가격 중 일부)
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
							//여기 c는 내가 정함.

		System.out.println("---고객나이를  순서대로 출력---");
		customerList.stream().map(c -> c.getAge()).forEach(age -> System.out.println(age));
	
		System.out.println("---고객여행비용을  순서대로 출력---");
		customerList.stream().map(c -> c.getPrice()).forEach(price -> System.out.println(price));
	
		System.out.println("---고객 총여행비용을  순서대로 출력---");
		//총 여행비용 (100,80,50) = 230
		int toial_price = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행비용: " + toial_price);
		
		
		System.out.println("---고객명단 중 나이가 20세 이상인 고객명단을 정렬하여 출력---");
		//조건을 이용할 때 Stream API작업.
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s-> System.out.println(s));
		
		
	}

}
