package chapter10.multiinterfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		//부모인터페이스 변수
		//다형성 : 자식객체가 부모인터페이스로...
		Buy buyer = customer;
		buyer.buy(); // 구현된 메서드 호출
		buyer.order(); // 재정의된 메서드 호출
		
		//부모인터페이스2 변수
		Sell seller = customer;
		seller.sell(); // 구현된 메서드 호출
		seller.order(); //재정의된 메서드 호출
		
		if(seller instanceof Customer) {
	//다운캐스팅. 자식클래스 변수 = (자식클래스 타입)부모클래스 객체
		//	Customer customer2 = seller; // 자식 = 부모 이다. 부모쪽 타입일치 필요
			Customer customer2 = (Customer) seller; 
				
			customer2.buy();
			customer2.sell();
		}
		
		customer.order(); //재정의된 메서드 호출
		
		
	}
}
