package chapter13.innerclass;

//익명(클래스명이 없다) 내부 클래스 - 1회성 특징으로 사용하는 클래스


class Outer2{
	
	//Runnable runner = new 클래스 생성자();
	// 익명구현객체 : 클래스명없이 객체를 생성하는 형태. 그리고 일회성 목적으로 작업
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub	
		}
	};
	//클래스로 작업
	/*
	class Runnable{
		public void run() {}
	}
	*/
	
}


public class AnonymousInnerTest {

	public static void main(String[] args) {
		
	}
}
