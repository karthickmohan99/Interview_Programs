package com.concepts;

public class TypeCasting {

	public static void main(String[] args) {
	double d= 11.34;
	int t = (int)d;
	
	System.out.println(t);
	System.out.println(d+t);//implicit type conversion(int variable automatically gets converted into double and then both the double variables add up. because Double is larger data type than Int)
  /*Order of size of data types:
    double > float > long > int > char > short*/
	
	System.out.println((int)d+t);//explicit type conversion
	}

}
