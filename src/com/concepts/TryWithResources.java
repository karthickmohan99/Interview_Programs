package com.concepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {

	public static void main(String[] args) throws IOException {
		//BufferedReader bf=null;
		//class or interface which is autocloseable that will autoclosed with  the help of try
		try (BufferedReader bf=new BufferedReader(new InputStreamReader(System.in))){
//			 InputStreamReader in = new InputStreamReader(System.in);
//			   bf=new BufferedReader(in);
			  int  num =Integer.parseInt(bf.readLine());
			  System.out.println(num);
			
		}
		
		
		//finally block is majorly used for closed the resources but try with resources syntax close the resources automatically

	}

}
