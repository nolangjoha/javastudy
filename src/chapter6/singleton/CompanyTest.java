package chapter6.singleton;

public class CompanyTest {
	
	public static void main(String[] args) {
	
		//Company com1 = new Company();
		//company class의 company앞에 private성질로 인해 여기서 객체 생성이 불가하다.
		
		// com1 객체 생성
		//더하여 company앞에 static 성질로 static영역에 메모리가 미리 생성된 상태다.
		Company com1 =  Company.getInstance();
		//이름을 달리하여 com2, com3 늘려봤자 동일한 주소를 가지고 있는 것만 생성되므로 의미가 없다.
		Company com2 =  Company.getInstance();

		System.out.println(com1 == com2); //true : com1과 com2가 갖고있는 주소값이 같다.
		
		
	}
	
}
