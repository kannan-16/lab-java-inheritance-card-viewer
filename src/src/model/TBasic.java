package src.model;

public class TBasic extends Telephone {
	int noOfKeys = 10;

	public TBasic(String myNumber, int noOfKeys) {
		super(myNumber);
		this.noOfKeys = noOfKeys;
	}
	
	public void makeCall(){}
	
	public void recieveCall() {}
}
