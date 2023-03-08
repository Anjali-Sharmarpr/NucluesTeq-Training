package WeekAssignments;

//take one array as input separate numbers into two different arrays

import java.util.Scanner;

public class TwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc =  new Scanner(System.in);
		
		int one[]= new int[5];
		int even[]=new int[5];
		int odd[]= new int[5];
		
		for (int i=0;i<one.length;i++) {
			one[i]=sc.nextInt();
		}
		int j=0,k=0;
		
		for(int i=0;i<one.length;i++) {
			if(one[i]%2==0) {
				even[j]=one[i];
				j++;
			}
			else {
				odd[k]=one[i];
				k++;
			}
		}
		
		System.out.println("Even Array - ");
		for(int i=0;i<j;i++){
			System.out.print(even[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Odd Array - ");
		for(int i=0;i<k;i++) {
			System.out.print(odd[i] + " ");
		}
		
	}

}
