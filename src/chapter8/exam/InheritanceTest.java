package chapter8.exam;

public class InheritanceTest {
	public static void main(String[] args) {
	
		//상속 받은 클래스가 객체생성이 되면
		// 내부적으로 어떤 일들이 일어나는지?
		//힙영역에 new PArent(), new Child() 순서로 진행.
		//힙영역에 부모클래스의 기억장소가 생성되고, 부모생성자 호출
		//힙영역에 자식클래스의 기억장소가 생성되고, 자식생성자 호출
		Child child = new Child();
		
		Child child2 = new Child(10, 20); // 힙영역에 값을 미리 주고 시작하고 싶어서 이걸 만든다.
		
		Parent parent = new Parent(); //이건 child 랑 관계 없고 그냥 parent 클래스로 가져온것이다.
}
}
