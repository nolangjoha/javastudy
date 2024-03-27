package chapter8.casting;

//참조타입의 클래스를 잉요한 형변환(casting) -> 다양성학습을 하기위한 전단계 예제
//참조타입: 클래스가 상속관계에 따른 형변환
public class ShapeTest {

	public static void main(String[] args) {
		
		// 부모클래스 변수 = 자식객체;
		// 부모클래스 = 자식클래스 대입시는 형변환 생략 가능, 반대로 자식클래스 = 부모클래스 구문은 형변환 생략 불가능. 에러 자식클래스 = (자싴크래스명) 부모클래스 명시적 형변환
		// 업캐스팅 : 자식객체로 부모클래스로 형변환(묵시적 형변환) 
		//Shape shape1 = (Shape) new Circle(); 와 같다. (shape)이 생략되어 있었음.
		// 부모클래스 = 자식객체
		Shape shape1 = new Circle(); //shape클래스와 Circle클래스 안에 draw();와 재정의된 draw()가 있다. 그런데 여기서 shape1.draw();를 사용한다면 어떤 draw가 온것인가?
		
		//★☆★☆★☆★☆★☆[매우중요]숙지★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		// draw()메서드가 부모, 자식클래스에 같이 존재하면 부모클래스의 변수는 자식의 재정의한 draw()메서드를 호출하도록 설계되어 있다.// draw Circle 가 출력된다. 
		// 그리고, 부모클래스 변수로 멤버들을 호출하게 되면 자신의 클래스(Shape)구성요소만 호출이 되도록 설계되어 있다.
		//★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆
		
		shape1.draw();  //Circle클래스의 재정의된 draw()메서드가 호출
//		shape1.method1();  //부모가 자식예제를 받았으면 안에서 자식 요소를 가져올수 있지 않나 생각할 수 있지만 그렇게 설계 안해놨다. 호출x //자식거 호출하려면 형변환 필요 22번재 줄처럼
	
		Shape shape2 = new Rectangle();  //Shape shape2 = (Shape) new Rectangle();
		shape2.draw();// draw Rectangle 가 출력된다.
		
		Shape shape3 = new Triangle(); //Shape shape3 = (Shape) new Triangle();
		shape3.draw();// draw Triangle 가 출력된다.
		
		if(shape1 instanceof Circle) {  // instanceof : shape1가 Circle 클래스의 성격을가진 객체입니까? 라는 뜻 
										// Shape shape1 = new Circle();로 만들여져 있음 -> true임.
			// 다운캐스팅.명시적 형변환
			// 자식클래스 변수 = (자식클래스)부모객체
			// 자식클래스의 구성요소를 호출하도록 설계되어 있다.
			Circle c1 = (Circle) shape1;  //(Circle)은 타입 일치를 위해 기입. shape는 cicle의 부모로 크기가 더크다 그래서 타입일치를 해줘야 함. 
			c1.method1();  // Circle의 super.draw();를 호출하고 있다. super은 부모클래스를 뜻한다.  // draw Shape가 출력된다.
		}
			//Shape shape2 = new Rectangle();
//			Circle c1 = (Circle) shape2; //형변환 에러 : shape2는 Rectangle과 관계되어 있다. Circle과 아무 관계 없음.
			Rectangle r1 = (Rectangle)shape2;
	}
}
