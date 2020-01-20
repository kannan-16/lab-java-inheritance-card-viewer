package src.model;

public class TCordless extends TBasic {
	boolean isWired = false;
	boolean hasDisplay = true;
	public TCordless(String myNumber, int noOfKeys, boolean isWired, boolean hasDisplay) {
		super(myNumber, noOfKeys);
		this.isWired = isWired;
		this.hasDisplay = hasDisplay;
	}
	
	public void makeCall(){}
	
	public void recieveCall() {}
}
