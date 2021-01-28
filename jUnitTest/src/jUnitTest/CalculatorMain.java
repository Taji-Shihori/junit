package jUnitTest;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		float d = cal.division(10, 6);
		System.out.println(d);
		
		int e = cal.maltiplication(10, 6);
		System.out.println(e);

	}

}
