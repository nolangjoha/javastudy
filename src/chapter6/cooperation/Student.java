package chapter6.cooperation;

public class Student {

	public String studentName;
	public int grade;
	public int money;
	
	//매개변수가 있는 생성자.
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	//학생이 이용한느 교통수단, 요 아래 bus 등으로 인해 학생 클래스보다 교통수단 클래스를 먼저 만들어놔야 한다. 
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
			}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}
	
	
	
	
}
