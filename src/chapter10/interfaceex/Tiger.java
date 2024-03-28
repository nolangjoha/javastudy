package chapter10.interfaceex;

public class Tiger implements Animal {

	@Override
	public void run() {
		System.out.println("호랑이가 질주합니다..");

	}

	@Override
	public void cry() {
		System.out.println("호랑이가 어흥하고 웁니다.");
	}

}
