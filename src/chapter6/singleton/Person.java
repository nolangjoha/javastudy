package chapter6.singleton;

public class Person {

	private static Person instance = new Person();
	
	private Person() {}
	
	public static Person getInstance() {
		if(instance == null) {
			instance = new Person();
		}
		return instance;
	}  
	
}
