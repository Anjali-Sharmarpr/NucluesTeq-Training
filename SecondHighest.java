package WeekAssignments;

//second highest number from an array

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[]= new int[5];
		
		int arr[]= {1,7,2,4,3};
		
		int mx=arr[0];
		
		for(int i=1;i<5;i++) { //finding highest
			if(arr[i]>mx) {
				mx=arr[i];
			}
		}
		
		System.out.println(mx);
		
		int smx=arr[0];
		
		for(int i=0;i<5;i++) { //finding second highest
			if(arr[i]!= mx) {
				if(arr[i]>smx && arr[i]<mx) {
					smx=arr[i];
				}
			}
		}
		
		System.out.println(smx);
		

	}

}
