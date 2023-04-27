package assingment;

public class Customer extends user {
	
	public int customerId;
	
	
	 public Customer (String username, String password) {
	        super(username, password);
	    }

	 	
	public void cancelReservation() {
    	System.out.println("Order has been placed successfuly.");
    }


	public void makebooking() {
		
		System.out.println("");
	}


	public void confirmPackage() {
		
		System.out.println("");
	}

}

