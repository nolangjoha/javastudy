package chapter10.interfaceex2;

// 추상클래스: 상속목적으로 설계. 객체생성 불가능
public abstract class Calculator implements Calc {
//추상메서드를 모두 override해줘야 하는데 
// 그 중 2개만 하고 싶다. 이떄 abstract를 작성해주면 된다.
// 구현되지 않은 추성메서드 2개 상속받은 상태	
	
	@Override
	public int add(int num1, int num2) {
		
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	
	
}
