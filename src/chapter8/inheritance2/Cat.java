package chapter8.inheritance2;

public class Cat extends Animal {

	/*
	//메서드
	void run() {
		System.out.println("고양이가 달린다.");
	}
	
	void shout() {
		System.out.println("고양이가 짖다.");
	}
	*/
	
	@Override
	void run() {
		System.out.println("고양이가 달린다.");
		
	}
	
	@Override
	void cry() {
		System.out.println("고양이가 야옹야옹 운다");
	}
	void method1() {
		super.run();
	}
}
