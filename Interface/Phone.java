package Interface;

public class Phone {
	void call() {
		System.out.println("Call method of Phone class ");
      
	}
	
	void sms(){
		System.out.println("SMS method of Phone class ");

	}
	

	public  interface Camera{
		 
		 void click();
		 void record();
		 
	 };
	 
	 
	 
	 public interface MusicPlayer{
		 void play();
		 void stop();
	 }
}
