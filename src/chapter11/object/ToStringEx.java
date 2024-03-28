package chapter11.object;

//스프링으로 넘어가면 매우 많이 사용할 작업

class Book /*extends Object*/{
	
	//필드
	int bookNumber;
	String bookTitle;
	
	//매개변수가 있는 생성자
	public Book(int bookNumber, String bookTitle) {
		super(); // 부모클래스의 기본생성자 호출// Object의 기본생성자 호출
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	//재정의(Object에 있는 것들을) 필드의 정보를 확인하는 목적으로 ★★★★★
	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}


public class ToStringEx {

	public static void main(String[] args) {
		
		Book book1 = new Book(200, "개미");
		
		//toString() 메서드를 재정의 하지 않으면 Object 클래스는 toString()메서드는 다음과 같이 출력된다.
		// chapter11.object.Book@75a1cd57
		//@75a1cd57 : 주소값 정도
		// 재정의 한 경우에는 Book [bookNumber=200, bookTitle=개마]가 출력된다.
		System.out.println(book1); // System.out.println(book1.toString());
		

	}

}
