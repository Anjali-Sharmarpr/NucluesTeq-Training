package Student;

public class Student {
       
	int rollNumber;
	String name;
	String course;
	int marks1;
	int marks2;
	int marks3;
	
	
	
	public Student(int rn,String nm,String crs,int m1,int m2,int m3){
		
		rollNumber= rn;
		name=nm;
		course= crs;
		marks1= m1;
		marks2= m2;
		marks3= m3;
		
	}
	    
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public int getMarks1() {
		return marks1;
	}
	
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	
	public int getMarks2() {
		return marks2;
	}
	
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	
	public int getMarks3() {
		return marks3;
	}
	
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	
	
	public int calculateTotal() {
		return marks1+marks2+marks3;
		
	}
	 public int calculateAverage() {
		return (marks1+marks2+marks3)/3;
	}
	 public char calculateGrade() {
		char g;
		
		if(calculateTotal()>80) {
			g='A';
		}
		else if (calculateTotal()>50) {
			g='B';
		}
		else {
			g='C';
		}
		return g;
	}
	 
	 public String toString() {
		 return rollNumber + " " +  name + " " + course + " " + marks1+ " "+ marks2 +" " + " "+  marks3
				 + " " + calculateTotal()+ " " + calculateAverage() + " " + calculateGrade() ;
	 }
	
}
