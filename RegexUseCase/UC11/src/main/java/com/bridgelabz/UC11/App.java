package com.bridgelabz.UC11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class App 
{
	static Scanner sc= new Scanner(System.in);
	static boolean exit=false;

		public static boolean CheckFirstName()
		{

			System.out.println("enter your First name");
			String firstName=sc.next(); 

			String regex="[A-Z]{1}[a-z]{2,10}$";
			Pattern p = Pattern.compile(regex);

			 Matcher m = p.matcher(firstName);
			 boolean m1=m.matches();
			 System.out.println(m1);

			 if (m1==false)
			 {

				 System.out.println("invalid inputs in name please renter in the correct format");

			 }

			 else
			 {
				 System.out.println("your name "+firstName);
			 }
			 return m1;
		}


		public static boolean CheckLastName()
		{

				System.out.println("enter your name");
				String lastName=sc.next(); 

				String regex="[A-Z]{1}[a-z]{2,10}$";
				Pattern p = Pattern.compile(regex);

				 Matcher m = p.matcher(lastName);
				 boolean m1=m.matches();
				 System.out.println(m1);

				 if (m1==false)
				 {

					 System.out.println("invalid inputs in name");

				 }

				 else
				 {
					 System.out.println("your name "+lastName);
				 }
				 return m1;
			}
		 public static void main( String[] args )
		    {

		    	new App();
				boolean result=App.CheckFirstName();
		    	if(result==true)
		    	{
		    		System.out.println("valid");
		    	}
		    	else
		    	{

		    		System.out.println("invalid");
		    	}

		    	new App();
				App.CheckLastName();
		    }
}