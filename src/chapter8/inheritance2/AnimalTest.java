package chapter8.inheritance2;

public class AnimalTest {

	public static void main(String[] args) {

		//Animal 클래스를 이용하여 객체를 생성.
		//자식클래스와는 전혀 상관 없다.
		Animal ani = new Animal();
		ani.cry();   //동물이 짖다.   (Animal 클래스)
		ani.run();   //동물이 달린다.  (Animal 클래스)
		
		//자식클래스 Cat 으로 객체를 생성하면
		// new 메모리 연산자가 부모클래스 Animal 을 이용하여, 힙영역에 메모리 생성
		//돌아와서 자식 클래스 Cat을 이용하여, 힙 영역에 메모리 생성
		//이 와중에서 생성자는 부모생성자 호출 -> 자식생성자 호출로 이뤄진다.(설계)
		Cat cat = new Cat(); // 
		cat.cry();   // 고양이가 야옹양오 운다. (Cat 클래스)
		cat.run();   // 고양이가 달린다. (Cat 클래스)
		
		cat.method1(); // Cat 클래스에서 method1의 내부코드가 super.run() 갖고있으므로 부모 메서드 호출
		
		Animal animal = new Cat();
		animal.cry(); //Cat 클래스의 재정의된 cry()호출
		animal.run(); //Cat 클래스의 재정의된 ()호출
		
		
		//animal.method1(); 호출이 불가하므로 호출하고 싶을때는 
		if(animal instanceof Cat) {
			Cat c1 = (Cat) animal;
			c1.method1();
			
			System.out.println("======================");
			
		//Lion 클래스 실습
		/*
		  Animal.java 파일 내	
		  부모클래스 변수 = 자식객체;//new Lion()
		  run(),cry()호출작업.
		  Lion 클래스 plqy()메서드 호출		 
		 */
		Animal animal1 = new Lion();
		animal1.cry();
		animal1.run();
			
		
		if(animal1 instanceof Lion) {
			Lion l1 = (Lion) animal1;
			l1.play();
		
		}
		
			
			
			
			
			
			
		}
	}
}