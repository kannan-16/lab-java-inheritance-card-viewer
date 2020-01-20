package src.model;

public class THandset extends TCordless {

	public void makeCall(){}
	
	public void recieveCall() {}
	
	public void sendSMS(){}
	
	public void recieveSMS(){}

	public THandset(String myNumber, int noOfKeys, boolean isWired, boolean hasDisplay) {
		super(myNumber, noOfKeys, isWired, hasDisplay);
	}

}
