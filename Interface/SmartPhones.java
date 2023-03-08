package Interface;
import Interface.Phone.*;



class SmartPhones extends Phone implements MusicPlayer,Camera{
	 public void click() {
		 System.out.println("Click method of camera interface");
	 }
	 public void record() {
		 System.out.println("Record method of camera interface");
	 }
	 
	 public void play() {
		 System.out.println("Play method of MusicPlayer interface");
	 }
	 public void stop() {
		 System.out.println("Stop method of MusicPlayer interface");
	 }
	 
}
