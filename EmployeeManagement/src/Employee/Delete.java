package Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

import java.util.Scanner;


public class Delete {
     
	public static void main(String args[]) throws Exception {
		
		Scanner s = new Scanner(System.in);
		
		BufferedReader reader= new BufferedReader(new FileReader("employee.txt"));
		System.out.println("Enter the name to delete the record");
		
		String searchkey = s.next();
		String line;
		
		BufferedWriter writer= new BufferedWriter(new FileWriter("employee.txt"));
		
		
		while((line=reader.readLine())!=null) {
			if(line.contains(searchkey)) {
                line.replaceAll(searchkey, " ");
				//continue;
			}
		}
		
		
	}
}
