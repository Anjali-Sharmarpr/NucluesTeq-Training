package WeekAssignments;

//printing sum of all even numbers

public class SumEvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int arr[]= {1,2,3,4,5,6};
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			 if(arr[i]%2==0) {
				 
				 System.out.print(arr[i]+" ");
				 
				 sum+=arr[i];
			 }
		}
		System.out.println();
		System.out.println(sum);
	}

}
