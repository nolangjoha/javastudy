package chapter11.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class personClass = Class.forName("chapter11.classex.Person");
		
		//Person클래스 생성자 정보 출력
		Constructor[] cons = personClass.getConstructors();
		for(Constructor c : cons ) {
			System.out.println(c);
		}
		
		//Person클래스의 필드 출력
		Field[] fields = personClass.getFields();
		for(Field f: fields) {
			System.out.println(f);
		}
		
		//Person클래스의 메소드 출력
		Method[]  methods = personClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}

}
