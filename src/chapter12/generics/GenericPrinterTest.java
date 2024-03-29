package chapter12.generics;

//스프링에서는 사용빈도가 적다.
public class GenericPrinterTest {

	public static void main(String[] args) {

		//<T>에 <Power>을 쓰게 되면 GenericPrinter파일의 <T>자리는 모두 Power가 된다.
		GenericPrinter<Power> powerPrinter = new GenericPrinter<Power>();
		powerPrinter.setMaterial(new Power());
		Power power = powerPrinter.getMaterial();
		System.out.println(powerPrinter);
		
		//<T>에 <Power>을 쓰게 되면 GenericPrinter파일의 <T>자리는 모두 Plastic가 된다.
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		
		
	}

}
