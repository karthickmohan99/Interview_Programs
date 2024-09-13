package com.inheritance;

class Father{
	 void show(){
		System.out.println("Im the father");
	}
}
class son extends Father{
	char gender='M';
	
}
class Daughter extends Father{
	char gender ='F';
	
}

class GrandFather extends Daughter{
	void show () {
		System.out.println("Im the grandFather");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		son s = new son();
		s.show();
		System.out.println(s.gender);
		
		Daughter d = new Daughter();
		d.show();
		System.out.println(d.gender);
		
		GrandFather gd = new GrandFather();
		gd.show();

	}

}
