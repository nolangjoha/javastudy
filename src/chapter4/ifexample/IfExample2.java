package chapter4.ifexample;

// 다중 if 문 : 조건식이 여러개 일 경우
public class IfExample2 {

	public static void main(String[] args) {
		
		int age = 7; // 나이
		int charge; // 입장료
		
		if(age < 8) {   
			// 혹여나 8을 80으로 작성해버리면 전체를 포함하는 조건이므로 동작이 이상해진다. 
			// 가장 앞에는 작은 단위의 조건문이 와야 한다. 
			// 부등호도 잘 보기
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if (age < 20) {
			charge = 2500;
			System.out.println("중·고등학생입니다.");
		}else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		System.out.println("입장료는 " + charge + "원입니다.");
	}
	
}
