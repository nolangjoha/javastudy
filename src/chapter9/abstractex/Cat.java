package chapter9.abstractex;

//추상클래스를 부모로 상속받으면 자식클래스는 추상메서드를 반드시 재정의(구현:implement)해야 한다.(규칙!!)
// + 재정의 한거 중괄호까지 추가해놔야 한다. 
//+ 문법적으로는 중괄호 안에 내용이 없어도 에러가 발생하지 않는다.
public class Cat extends Animal {

	@Override
	void run() {
		System.out.println("고양이가 달린다.");
	}
	@Override
	void cry() {
		System.out.println("고양이가 야옹야옹 운다.");
	}
	 
}
