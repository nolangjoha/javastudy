package chapter11.object;

// 객체 복사 : 힙영역에 생성된 메모리가 또 하나의 메모리로 복사.
// 객체(인스턴스): 힙영역에 생성된 메모리 그 자체.(이름부여)
// 객체복사 : Object 클래스의 clone() 메서드를 사용.
// (규칙)객체복사를 하기위한 클래스는 Cloneable 인터페이스를 상속받아야한다.
public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {	
		Circle circle = new Circle(10, 20, 30);
		// clone() : 메모리 복사기능 
		// copyCircle 와 circle 의 메모리가 똑같다.
		Circle copyCircle = (Circle) circle.clone();

		// toString() 메서드가 값을 확인하는 용도로 재정의가 되어있어
		// circle 객체의 원본메모리 내용과 copyCircle 객체 사본 메모리 내용을 확인.
		System.out.println(circle); // circle.toString()		
		System.out.println(copyCircle);  // copyCircle.toString()
	}
}

class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Object 클래스의 toString()
	// toStrint() 메서드의 재정의 할 때는 클래스의 필드정보를 확인한느 용도로 한다. 
	@Override 
	public String toString() {
		return " x = " + x + ", "+"y = "+ y;
	}
}

// Circle 클래스를 객체로 생성하고, 객체복사로 사용
// (규칙) main()에서 복사를 가능케 하려면 클래스는 implements Cloneable 를 가지고 있어야 한다.
// (기억) Cloneable는 자바에서 만든 인터페이스 인데 이것만 추상메서드가 없다.
class Circle implements Cloneable {
	
	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x,y);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		// point -> point.String()
		return "원점은" + point + "이고, " + "반지름은" + radius + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}
	
	
	
}