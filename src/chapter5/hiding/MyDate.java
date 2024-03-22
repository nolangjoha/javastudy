package chapter5.hiding;

//접근자의 4가지 유형
/*
 private : 안보임. 접근 불가
 아무것도 사용 x : 디폴트
 public 
 protected : 상속접근자
   	private < default < public
   	default 필드는 동일한 패키지 일경우 접근이 되고, 다른패키지에서는 접근이 안된다.
   
*/
public class MyDate {
	public int day;  
	int month;     // 필드 앞에 접근자를 안쓴 상태를 디폴트라 한다.
	private int year;
		
	
	
}
