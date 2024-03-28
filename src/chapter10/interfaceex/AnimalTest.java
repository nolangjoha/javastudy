package chapter10.interfaceex;

public class AnimalTest {
	
	public static void main(String[] args) {
	
		//Animal animal = new Animal();  //에러발생
		//Animal 추상클래스는 객체생성을 할 수 없도록 설계되어 있다.
		
		AnimalTest aTest = new AnimalTest();
		aTest.callMethodAnimal(new Cat());
		aTest.callMethodAnimal(new Dog());
		aTest.callMethodAnimal(new Lion());
		}
	
	public void callMethodAnimal(Animal animal) {
		animal.cry();
		animal.run();
	}
}
