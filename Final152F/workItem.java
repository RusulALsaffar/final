public class workItem {
	private double callStart;
	double callEnd;
	//---------------
	//Creates a new customer with 
	public workItem (int arrives){
		callStart = arrives;
		callEnd = 0;
	}

	//---------------
	// Returns the start time of call for this customer. 
	public double getcallStart(){
		return callStart;
		
	}
	public void setcallStart(double d){
		 callStart=d;
		
	}
	//--------------Sets the call end time for this customer.
	public void setcallEnd (double departs){
		callEnd = departs;
	}
	///------------return the call end time of this customer. 
	public double getcallEnd(){
		return callEnd;
	}
	//-------------------computes and returns the total waiting time spent by this customer. 
	public double totalTime(){
		return callEnd - callStart;
	}
}