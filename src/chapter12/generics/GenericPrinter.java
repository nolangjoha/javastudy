package chapter12.generics;

// 제너릭 기능이 있는 클래스
//<T>: 타입파라미터
// 이 클래스 객체 생성시 타입파라미터에는 참조타입반 가능하다.
public class GenericPrinter<T> {

	private T material;
	
	//getter, setter 메소드 작업
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
}