package chapter7.array;

public class ArrayCopy {

	public static void main(String[] args) {
		
		//스택영역에 array1이란 기억장소가 형성, 힙영역에 10~50의 데이터가 저장되며 그 위치 주소가 스택영역 array1에 참조 된다. 힙영역의 데이터는 각각 [1],[2]~[5]의 이름을 가진다.
		int[] array1 = {10, 20, 30, 40, 50}; //원본배열
		int[] array2 = {1, 2, 3, 4, 5}; // 사본배열
		
		//배열복사기능
		//array1 배열의 인덱스 [0]위치에서 array2배열의 인덱스[1]위치에 4개를 복사한다.
		System.arraycopy(array1, 0, array2, 1, 4);
		
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
