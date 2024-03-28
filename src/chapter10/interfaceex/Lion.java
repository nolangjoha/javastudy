package chapter10.interfaceex;

public class Lion implements Animal {

	@Override
	public void run() {
		System.out.println("사자가 달려갑니다.");
	}

	@Override
	public void cry() {
		System.out.println("사자가 포효합니다.");
	}
}
