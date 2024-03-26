package chapter8.inheritance;

					   //extends Customer 로 Customer 의 값을 가져다 사용할 수 있다. 
public class VIPCustomer extends Customer {
						// 상속받고자 하는 값의 앞쪽에 private 가 있으면 해당 성질로 인해 상속 받을 수 없다.
	
	//상속은 완료
	//extent 의 의미는 '연장하다', '확장하다' 등의 뜻이 있으나 상속과 함께 더 많은 내용을 담을수 있게 하므로 extend가 쓰였다고 한다.

	//추가 
	private int agentID;// 담당 상담원ID
	double saleRatio; //할인율
	
	//생성자
	public VIPCustomer() {
		
		//부모상속
		customerGrade = "VIP";
		bonusRatio = 0.05;
	
		//자신
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출" );
		
	}
	
	//매개변수가 있는 생성자
	//super : 상속관계에서 부모(상위)클래스를 가리키는 의미.
	public VIPCustomer(int customerID,String customerName, int agentID) {
		//부모의 매개변수가 있는 생성자 호출
		super(customerID,customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int,String, int)생성자 호출");
	}
	
	
	//부모클래스 이름만 사용하고 내용은 변경해서 작업하고자 할때: 메서드 재정의 (overriding)
	@Override // <-재정의 할때 이걸 넣어준다.
	public int calcPrice(int price) {
		System.out.println("VIPCustomer.calcPrice");
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	//private int agentID;
	
	public int getAgentID() {
		return agentID;
	}
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	
	
	
	
	
	
	
}
