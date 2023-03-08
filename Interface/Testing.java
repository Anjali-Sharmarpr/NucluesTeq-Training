package Interface;

import Interface.Phone;
import Interface.SmartPhones; 

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		SmartPhones sp= new SmartPhones();
		sp.call();
		sp.click();
		sp.play();
		sp.record();
		sp.sms();
		sp.stop();
	}

}
