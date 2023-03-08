package Student;

//import WeekAssignments.Student;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Student arr[]= new Student[5];
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("Enter roll number");
			int rn= sc.nextInt();
			
			System.out.println("Enter Name");
			String nm= sc.next();
			
			System.out.println("Enter course");
			String crs= sc.next();
			
			System.out.println("Enter marks");
			int m1= sc.nextInt();
			int m2= sc.nextInt();
			int m3= sc.nextInt();
			
			
			
			arr[i]= new Student(rn,nm,crs,m1,m2,m3);
		}
	
            for(int i=0;i<arr.length;i++) {
            	System.out.println(arr[i].toString());
            }
		
	}

}
