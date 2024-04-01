package chapter12.jenerics3;

public class GenericMethod {

	//제네릭 메서드 문법형식
	// <T, V> : 메서드 타입파라미터
	// 제너릭 메서드 호출 GenericMethod.<Ingeger, Double>makeRectangle(null,null);
	// <T, V> double makeRectangle(Point<T,V> p1, Point<T, V> p2)
						//double는 return의 결과가 double 타입인거고 <T,V>와는 관계 없다.
	public static <T, V> double makeRectangle(Point<T,V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		//제너릭 메서드 호출
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		// 제네릭 메서드 호출
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect +" 입니다.");
		
//		GenericMethod.<Long, Double>makeRectangle(null, null);
		
	}
	
}
//자료형 타입을 적지 않아서 필요할때 관련 자료형을 넣으면서 여러방면으로 클래스처럼 사용이 가능하다.
//일반 응용프로그램에서는 제네릭을 많이 사용하는데 스프링에서는 그리 많이 쓰이지 않음.