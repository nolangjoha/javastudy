package chapter5.exam;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		
		System.out.println("p1의 name은? "+ p1.name);
		System.out.println("p1의 price? "+ p1.price);
		
		
		
		System.out.println("=============================");
		
		
		Product p2 = new Product();
		p2.name = "tv";
		p2.price = 500000;
		//Product p2 = new Product("tv",500000); 로 한번에 작성 할 수 있다.
		

		
		System.out.println("p2의 name은? "+ p2.name);
		System.out.println("p2의 price? "+ p2.price);
		
		
	}

}