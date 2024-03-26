package chapter7.array;

//생성자를 하나도 만들지 않으면, 컴파일 과정에서 자동생성.
//클래스배열(객체배열)을 만들기 위한 클래스)
public class Book {
	
	//필드 
	private String bookName; //책제목
	private String author;//저자
	
//	book() {} // default의미, 얘는 패키지가 같아야 public성격을 가진다.
	          // 만약 패키지가 다르면 private성격을 가진다.

	
	//기본 생성자의 형태.기본생성자는 리턴타입을 사용하지 않는다.
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	//getter, setter메서드 생성 : 이건 필드 접근자가 private일때만 만든다.
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//일반메서드
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
	
	
	
	
	
}
