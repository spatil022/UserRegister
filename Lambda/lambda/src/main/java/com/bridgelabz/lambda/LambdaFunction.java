package com.bridgelabz.lambda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaFunction {
	 static ArrayList<Integer> list = new ArrayList<Integer>();



	public static void main(String[] args) 
	{

		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter the length of the list");
		  int n = sc.nextInt();


          for(int i=0 ;i<n;i++)
          {
        	  list.add(i);
          }
          System.out.println("your list is " +list.toString());
          System.out.println();
          //fetching the value through explicit lambda function
              Consumer <Integer> actionplay= x->{
        	  System.out.println("fectching the value"+x);
          };

          list.forEach(actionplay);
          System.out.println();

          //fetching the value in implicit lambda function
          list.forEach(x->{
        	  System.out.println("fectching the value implicitly"+x);
          });

          System.out.println();
          //lambda function to display the double values
          Function <Integer,Double> doubling = Integer :: doubleValue;
          list.forEach(x->{
        	  System.out.println("fectching the value implicitly"+doubling.apply(x));
          });


          System.out.println();

          //for checking even from list in lambda function
          Predicate<Integer> iseven = x-> x%2 == 0;
          list.forEach(x-> {
        	  System.out.println("the even number " +x+ "from list is " +iseven.test(x));
          });

          System.out.println();
        class MyConsumer implements Consumer<Integer>
      	{

      		@Override
      		public void accept(Integer t) {
      			// TODO Auto-generated method stub
      			System.out.println("consumer value is" +t);

      		}


      	}


          MyConsumer action=new MyConsumer();
          list.forEach(action);
         /** List number = Arrays.asList(2,3,4,5);
          int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);**/




	}

}