package workflows;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import widgets.LivingRoom;


public class CheckLastCallEntry {
	
	//Autowiring required class objects
	
	@Autowired
	LivingRoom livingroom;
	
	//verifying last call entry with dialing number 
	public void lastEntryCheck(String callingNumber) {
		Assert.assertEquals(livingroom.getLastCalledNumber().getText(), callingNumber,
				"last called number is matched ");
	}
}
