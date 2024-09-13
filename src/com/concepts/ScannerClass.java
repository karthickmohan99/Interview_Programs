package com.concepts;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerClass {

	public static void main(String[] args) throws NumberFormatException,  IOException {
		 Scanner sc = new Scanner(System.in);
         //object of a scanner class 
		 /* new Scanner(System.in); this is constructor of a scanner class in takes argument as System.in
		 (System.in)tells Java that this will be System Input i.e. input from a user will be given to the system.*/
		 
		 //System.in points to keyBoard(input Stream)
		 //System.out points to screen
		 
		 //object sc reads data from System.in(keyboard)
		 
		 //(System.in) -->This is a static fied of System class 
		 //type of "in" field is inputStream so 'in' is an object of inputSttream class  
		 
		 //PARSING METHODS TO PARSING DIFFERENT DATA TYPES
		 
		 //sc.next();//to read single word from keyBoard
		 //sc.nextLine() input a sentence
		 //sc.nextInt();//reads integer from keyboard
		 //sc.nextDouble();//reads the double
		 // when one of the above method is called ,the program will pause execution and wait for the user to enter the value
		 //System.out.println(sc.next());//read single word
		 System.out.println(sc.nextLine());
		 //println is  belongs to printStream Class
		// inside System Class theres a  object of printSteam as static variable called out
		 //so we called println method of printStream class through out object in system class.
		 
		 
		 
		 //#BUFFEREDREADER //Class from java.io package //useed before java 1.5
		 InputStreamReader in = new InputStreamReader(System.in);
		 BufferedReader bf = new BufferedReader(in);
		 
		 int num =Integer.parseInt(bf.readLine());
		 System.out.println(num);
		 bf.close();
	}

}
