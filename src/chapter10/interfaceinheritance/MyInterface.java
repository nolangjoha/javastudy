package chapter10.interfaceinheritance;

//  <인터페이스끼리 상속하기>
//클래스들끼리 상속은 extends
//클래스가 부모인터페이스를 상속한 경우 implements
//인터페이스끼리는 extends 를 사용해야 한다. 즉, 같은 종류끼리 extends를 사용한다. 
public interface MyInterface extends X, Y{

	// 상속받은 X,Y 2개, 그리고 본인것 1개까지 총 3개의 추상메서드를 가지고 있는 상태.
	// X만 필요한 상황, Y만 필요한 상황 등이 있을 수 있기에 3개의 추상메서드를 모두 넣어서 만들지 않았다.
	// 모든 작업은 최소화(최소단위로) 하여 효율적으로 할 수 있도록 작업하는 것이 좋다.
	void myMethod(); 
}