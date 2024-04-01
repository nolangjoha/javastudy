package chapter12.generics2;

// 제너릭 기능이 있는 클래스
//<T>: 타입파라미터
// 이 클래스 객체 생성시 타입파라미터에는 참조타입반 가능하다.
// 타임파라미터에 사용할 수 있는 자료형을 제한
public class GenericPrinter<T extends Material> {
							// Material 클래스나 Material 클래스를 상속받은 것만 T자리에 올 수 있다.
	
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