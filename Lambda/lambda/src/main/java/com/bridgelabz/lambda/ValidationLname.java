package com.bridgelabz.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ValidationLname {
	
	Scanner sc=new Scanner(System.in);
	void CheckName(){
		
		System.out.println("enter your last name");
		System.out.println("enter your name");
		System.out.println("please enter the[1] first letter in captical[2]input of min 5 letter and maximum 10 is accepted");
		System.out.println();
		String lastName=sc.next(); 
		
		String regex="[A-Z]{1}[a-z]{2,10}$";
		Pattern p = Pattern.compile(regex);
		
		 Matcher m = p.matcher(lastName);
		 boolean m1=m.matches();
		 System.out.println(m1);
		
		 if (m1==false)
		 {
			 
			 System.out.println("invalid inputs in name please renter in the correct format");
			 
		 }
		 
		 else
		 {
			 System.out.println("your name "+lastName);
			 
		 }

}
	void LastLambda()
	{
		 String regex="[A-Z]{1}[a-z]{2,10}$";
	 	 ArrayList <String> Last_Name=new ArrayList<String>();
		//String mail1=sc.next();
		 System.out.println("enter number of input you wanna to give");
		 int n1=sc.nextInt();
		 for(int i=0; i<n1 ; i++) {
			Last_Name.add(sc.next());
		}
		System.out.println(Last_Name.toString());
		Pattern pt = Pattern.compile(regex);
		
		//Predicate <String> mailcheck =Pattern.compile(regex).asPredicate();
	    List<String> a1= Last_Name. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
		//List<String> emails1= mail.stream().filter(mailcheck).collect(Collectors.<String>toList());
		System.out.println(a1);
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ValidationLname().CheckName();
		new ValidationLname().CheckName();
		new ValidationLname().LastLambda();
}
}