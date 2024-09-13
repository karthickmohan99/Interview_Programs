package com.concepts;

//default access specifier for classs is package -private
class Student {
	String name;
	int rollNo;
	final int immutableValue =0;
	public  Student() {
		System.out.println("this is default constructor");
	}
	
	public Student(String sname,int srollNo,int finalv) {
		//System.out.println("Student name is: "+name+" roll Number"+rollNo);
		name=sname;
		rollNo=srollNo;
		//immutableValue = finalv;
	}
	
	public Student(Student s) {
		name=s.name;
		rollNo=s.rollNo;
	}
	
}
public class ConstructorInJava {

	public static void main(String[] args) {
		//copy constructor is used to create an object from existing object 
		//alternative - using clone method  that needs to implement the cloneable interface  and handle clone not supported exception
           Student st = new Student();
           Student st1 = new Student("Karthick",22,29);
           //System.out.println(st1.name+" and "+st1.rollNo);
           Student st2 = new Student(st1);
           System.out.println(st2.name+" and "+st2.rollNo);
	}

}
