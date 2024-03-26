package chapter8.inheritance;

//부모클래스(상위클래스): 상속을 주는 클래스
public class Customer {

	//필드
	int customerID; //고객아이디
	String customerName; // 고객이름
	String customerGrade; // 고객 등급
	int bonusPoint; //고객 보너스 포인트
	double bonusRatio; // 보너스 포인트 적립비율.
	
	//생성자 메서드는 데이터 타입 사용하지 않는다.
	// 생성자의 이름은 파일의 이름을 사용하는 규칙이 있다.
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	
	//매개변수가 있는 생성자
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;  //얘네는 바로 전줄에 있는 값과 혼동할 수 있기에 this.를 넣어준다.
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int,String) 생성자 호출");
	}
	
	//일반메서드
	public int calcPrice(int price) {
		System.out.println("Customer.calPrice");
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는 " + "입니다.";
	}
	
	
	
	
	//필드가 private접근자일 경우 힙영역의 메모리를 다른 외부에서 접근을 할수가 없어서
	//getter메서드 : 힙영역의 필드명으로 생성된 기억장소의 값을 읽어오는 목적으로 접근자 public
	//setter메서드 : 힙영역의 필드명으로 생성된 기억장소의 값을 변경하는 목적으로 접근자 public
	
	// int CustomerID getter, setter 만들기
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	//String customerName getter, setter 만들기
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
		
	//String customerGrade getter, setter 만들기
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
	
}
