package WeekAssignments;

//program to find highest of three number 

class Find{
	
	public int high(int a,int b,int c) {
		if(a>b) {
			if(a>c) 
				return a;

			else 
				return c;
			
		}
		else {
			if(b>c) 
				return b;
			
			else 
				return c;
			
		}
	}
}
public class HighestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Find f = new Find();
		int result= f.high(10, 30, 20);
		
		System.out.println(result);
		
		

	}

}
