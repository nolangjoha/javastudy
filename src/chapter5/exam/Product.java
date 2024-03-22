package chapter5.exam;

public class Product {

	String name;
	int price;
	
	
	//생성자를 여러개 정의를 가능하게 하는 문법? 매서드 오버로딩(method overroading)
	// 동일한 생성자를 중복정의하는 문법. 단, 매개변수으 개수와 데이터 타입을 다르게 해야 한다.
	// 원래 프로그램 쪽은 동일한 이름을 생성 할 수 없다.
	
	//기본생성자.
	Product() { }
	
	
	//아래 이거 만들면 class 에 Product(); 생성자가 생성되지 않는다. 
	//위에 Product(){}를 수동으로 같이 작성해줘야 매개변수랑 함께 쓸 수 있음.
	Product(String name, int price) {
		this.name = name;   // 매개변수의 name하고 헷갈리니까 this.를 함께 작성해준다
		this.price = price;  // 왼쪽은 위의 거, 오른쪽은 매개변수값(색으로 구분되어 있다)
		}
	
	
	
	
}