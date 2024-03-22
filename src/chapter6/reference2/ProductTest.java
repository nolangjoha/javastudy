package chapter6.reference2;

public class ProductTest {

	public static void main(String[] args) {

		Product p1 = new Product("TV", 500000);
		
		Product p2 = p1; // 힙영역의 주소가 p1에 의하여 p2에 복사가 되서, 힙영역에 생성된 하나의 기억장소를 공유하게 된다. 
		
		//스택영역 생성된거 p1, p2
		//힙영역 생성된것 string name;, int price;
		
		p2.price = 100000;
		
		System.out.println("p1.price필드 값은?" + p1.price);
		
	}

}
