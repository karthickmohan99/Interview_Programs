package com.concepts;

class A{
	public  void Show() {
		System.out.println("Inside class A ");

	}
	
	
	}

class B extends A{
	@Override
	public void Show() {
	
		System.out.println("Inside Class B");
		
	}
}

class C extends B{
	@Override
	public void Show() {
		 System.out.println("INside class C");
	}
}




public class PolymorphismOverriding {

	public static void main(String[] args) {
		
          A ob = new A();
             ob.Show();
          A ob1=new B();
           ob1.Show();
          A ob2 = new C();
           ob2.Show();
	}

}
