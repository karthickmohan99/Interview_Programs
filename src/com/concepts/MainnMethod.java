package com.concepts;

public class MainnMethod {

	public static void main(String[] args) {
		//System.out.println(args);//args stores command line arguments that are supplied when executing java program
		
		 if (args.length > 0) {
		        System.out.println("Command-line arguments:");

		        // Iterate through the args array and print each element
		        for (int i = 0; i < args.length; i++) {
		            System.out.println("args[" + i + "] = " + args[i]);
		        }
		    } else {
		        System.out.println("No command-line arguments provided.");
		    }

	}

}
