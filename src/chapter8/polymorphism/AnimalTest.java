package chapter8.polymorphism;
// 다형성 학습 예제
// 부모클래스 :super  //당연히 부모클래스를 만들고 자식클래스를 만든느 것이다.
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	// 재정의
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	//추가
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	// 재정의
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	//추가
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 쭉펴고 멀리 날아갑니다.");
	}
}

//Animal 클래스를 상속받는 Lion 클래스
class Lion extends Animal{
	@Override
	public void move() {
		System.out.println("사자가 열심히 달린다.");
	}
	public void hunting() {
		System.out.println("사자가 사냥을 합니다.");
	}
	
}



// 파일 1개로 클래스를 여러개 만들때 class 앞에 public 을 붙일수 있는 클래스는 파일명과 동일한 클래스 뿐이다.(규칙)
public class AnimalTest {

	public static void main(String[] args) {
		//다형성 작업
		AnimalTest aTest = new AnimalTest();
		aTest.moveAnimal(new Tiger());   //1)
		aTest.moveAnimal(new Human());	 //2)
		aTest.moveAnimal(new Eagle());   //3)
		aTest.moveAnimal(new Lion());   //4)
		
		//코드가 중복되고, 유지보수 작업에는 적합하지 않다.
		//지금은 하단 영역이 작성줄이 더 적지만 작업량이 많아지면 굉장히 힘들어진다.
		/* 
		Human human = new Human();
		human.move();
		
		Tiger tiger = new Tiger();
		tiger.move();
	
		Eagle eagle = new Eagle();
		tiger.move();
		*/
		
	}
	
	//다형성 기능의 메서드 정의
	//Animal animal 부모 클래스 변수가 여러 자식체계를 갖게되는 의미 또는 성질을 다형성.
	public void moveAnimal(Animal animal) {
		//재정의된 move()메서드가 호출된다.
		animal.move(); // animal = new Human() or new Tiger() or new Eagle() 
	}

}
