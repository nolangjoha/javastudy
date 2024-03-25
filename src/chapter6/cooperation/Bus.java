package chapter6.cooperation;

//학생이 통학운송수단으로 사용한 버스
public class Bus {

		public int busNumber; //버스번호
		public int passengerCount; //승객수
		public int money; // 버스 수입액
		
		//매개변수가 있는 생성자.(값을 먼저 주고 시작하고 싶다)

		// 접근자 생성자메서드는 클래스 이름사용(규칙)
		public Bus(int busNumber){
			this.busNumber = busNumber;
		}
		
		//버스에 승객을 태우는 기능
		public void take(int money) {
			this.money += money;
			passengerCount++;
		}
		
		//버스의 수입과 승객인원수 확인
		public void showInfo() {
			System.out.println("버스" + busNumber + "번 승객은" + passengerCount + "명이고, 수입은" + money + "입니다.");
		}
		
		
}


