package assingment;

public class Admin extends user {
	    public Admin(String username, String password) {
	        super(username, password);
	    }

//	    public Admin(int id){ // Constructor
//	    	int administartorId = id;
//	    }

	    public void removeProduct() {
	    	System.out.println("Order has been deleted.");
	    }

		public void addOrder() {
			System.out.println("Order has been added.");
		}



		public void deleteOrder() {
			System.out.println("Order has been deleted.");
			
		}



		public void modifyOrder() {
			System.out.println("Order has Modeified.");
			
		}
	}
