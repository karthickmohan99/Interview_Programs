package com.concepts;


interface Practice {
	String concept = "oops";
	void test();
	
}

class Revision implements Practice{

	@Override
	public void test() {
		System.out.println("Test is completed");
		
	}
	
}
public class InterfaceInJava {

	public static void main(String[] args) {
		Revision re = new Revision();
		System.out.println(Practice.concept);
		re.test();

	}

}
