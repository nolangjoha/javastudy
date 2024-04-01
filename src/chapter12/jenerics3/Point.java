package chapter12.jenerics3;

// 멀티타입파라미터
public class Point <T, V> {

	// 데이터 타입 대신에 T, V넣기
	
	// 필드
	T x;
	V y;
	

	//생성자
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	//제너릭 메서드
	public T getX() {
		return x;
	}
	
	
	public V getY() {
		return y;
	}
	
	// 제네릭클래스 객체생성
	/*
	 point<Integer,Double> p1 = new Point<Integer, Double> (0, 0.0);
	 point<Integer,Double> p1 = new Point<> (10, 10.0);     
	 */
	//저 <>사이는 <Integer, Double>을 넣거나 비워놔도 된다.
	
	
}
