package chapter6.cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		//2명의 학생개체를 생성
		Student stuJames = new Student("James", 5000);
		Student stuTomas = new Student("Tomas", 10000);
		
		Bus bus = new Bus(100); //버스 차량 100번
		stuJames.takeBus(bus);
		stuJames.showInfo(); //버스정보 출력
		
		Subway subwayGreen = new Subway("4호선");
		stuTomas.takeSubway(subwayGreen);
		stuTomas.showInfo(); //지하철 정보 출력
				
	}

}
