package chapter7.array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
	
	
	//double 형 배열(배열은 찹조타입에 해당되며 참조타입은 스택영역과 힙영역을 같이 사용한다.), 초기값은 0.0
	double[] data = new double[5];
	// 1)스택영역 data란 이름의 영역 생성, 데이터터는 null상태		
	// 2) 힙영역에 5개 영역 생성, 각각 칸안에 디이터가 들어있고 이 기억장소의 주소가 스택에 형성된 영역으로 들어간다.
	
	//값을 변경
	data[0] = 10.0;
	data[1] = 20.0;
	data[2] = 30.0;
	
	for(int i=0; i < data.length; i++) {
		System.out.println(data[i]);

		}
	}
}