package chapter4.ifexample;

// 다중 if 문 : 조건식이 여러개 일 경우
public class IfExample4 {

	public static void main(String[] args) { 
		// 메소드 안에 변수는 죽이되든 밥이 되든 무조건 값을 가져야 한다.
		//하위 수식들이 진행되는데 변수가 값을 가질 수 없는 수식이라면 문법적으로 맞아도 에러가 발생한다(예: 나이 -9세)
		//<해결방법> 택 1
		// 1) 처음에 변수에게 값을 줘라 - 현장에선 이걸 많이 씀.
		// 2) else문을 통해 변수가 값을 갖게 해라
		
		
		
		// 변수 선언시 초기값을 주거나 아니면 코드 내에서 변수가 조건에 의하여 값을 가지도록 코딩을 해야한다.
		int age = -9; // 나이
		int charge; // 입장료
			
		
		if(age >= 0 && age < 8) {   // 0세 이상이고, 8세 미만
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}else if (age >= 8 && age < 14) {  //8세 이상, 14세 미만
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if (age >= 14 && age < 20) { // 14세 이상, 20세 미만
			charge = 2500;
			System.out.println("중·고등학생입니다.");
		}else if (age >= 20) {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}else {  // 이 수식을 작성해주지 않으면 charge값은 값을 가질 수 없어 에러가 발생한다. 
			charge = - 999;
			System.out.println("나이를 확인해주세요.");
		}
		System.out.println("입장료는 " + charge + "원입니다.");
	}
	
}
