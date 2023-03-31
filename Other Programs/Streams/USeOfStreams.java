package Streams;

/*
 * Stream API is used to process collections of objects.
 *  A stream is a sequence of objects that supports various methods 
 *  which can be pipelined to produce the desired result.
 *  using stream aPI original object do not get affected
 */

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class USeOfStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Integer> nums= Arrays.asList(6,4,5,3,7,8);
		 System.out.println(nums);
		 
		 nums.forEach(n-> System.out.println(n));  //accessing elements using for each loop
		 
		 System.out.println("Using Stream:- ");
		 Stream<Integer> data=nums.stream();
		 
		 //data.forEach(n-> System.out.println(n));
		 
		 //stream can be used only for one time , can't reuse it
		// data.forEach(n-> System.out.println(n));   //this will give exception
		 
		 /*   it will also throw exception as data has been used once above
		 long count= data.count();
		 System.out.println(count);
		 */
		 
		 //Stream <Integer> sortedData= data.sorted();   //it will sort numbers
		 //sortedData.forEach(n-> System.out.println(n));  
		 
		 //map method allows to change the values (Perform operations on it)
		 //here we are doubling the value()
		 
		 Stream<Integer> mapData= data.map(n-> n*2);
		 mapData.forEach(n-> System.out.println(n));
		 
		 System.out.println("In one line");
		 nums.stream().sorted().map(n-> n*2)  //in total 3 streams
		 .forEach(n-> System.out.println(n)); 
		 
		 //filter method filters and perform operation only on that whose result will be true
		 System.out.println("filter()  - doubling value of only odd numbers");
		 nums.stream().filter(n-> n%2==1).sorted()
		 .map(n-> n*2).forEach(n-> System.out.println(n));
		 
		 //how functions are working
		 
		 System.out.println("Filtering only odd numbers by creating anonymous class of type Predicate - Exploring filter() method");
		 
		 //exploring the filter()
		 Predicate<Integer> pred = new Predicate<Integer>(){

			@Override
			public boolean test(Integer n) {
				// TODO Auto-generated method stub
				return n%2==1;
			}
			 
		 };
		 
		 //filter(n-> n%2==1) writing this with the help of lambda function
		 nums.stream().filter(pred).sorted()    //passing the object pred in filter()
		 .map(n-> n*2).forEach(n-> System.out.println(n));
		 
		 //what if we want to display the sum of numbers we got after stream
		 
		 System.out.println("Sum of numbers obtained after stream");
		 int result= nums.stream().filter(n-> n%2==1).sorted()
				 .map(n-> n*2)
				 .reduce(0,(c,e)->c+e);   //starting with 0 , passing two num and will add
		 System.out.println(result);
			
		 
		 //exploring map() method
		 Function<Integer,Integer> fun =  new Function<Integer,Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				t=t*2;
				return t;
			}
			 
		 };
		 System.out.println("Doubling numbers by creating anonymous class of type Function - Exploring map() method");
		 nums.stream().map(fun).forEach(n-> System.out.println(n));
	}

}
