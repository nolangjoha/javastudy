package chapter13.stream2;

//스트림API를 학습하기 위한 클래스
public class TravelCustomer {

	//필드
	private String name;
	private int age;
	private int price;
	
	//3개 필드의 값을 사용하기 위한 생성자  / 생성자 메서드는 리턴타입이 없다.
	public TravelCustomer(String name, int age, int paice) {
		this.name = name;
		this.age =age;
		this.price = price;
	}
	
	//3개 필드를 이용한 getter메서드
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getPrice() {
		return price;
	}
	
	//툴을 이용해서, toString을 재정의
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	
	
}
