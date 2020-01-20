package src.model;

public class TSmartphone extends THandset {

	App[] apps;

	public TSmartphone(String myNumber, int noOfKeys, boolean isWired, boolean hasDisplay, App[] apps) {
		super(myNumber, noOfKeys, isWired, hasDisplay);
		this.apps = apps;
	}
	
	public void makeCall(){}
	
	public void recieveCall() {}
	
	public void sendSMS(){}
	
	public void recieveSMS(){}
	
	public void launchApp(int appID) {}
}
