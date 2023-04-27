package assingment;

public abstract class Order extends Customer{
private int orderId=2385;

	public Order(String username, String password) {
		super(username, password);
		//  constructor stub
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
 public abstract void processOder();
 public void confirmOrder() {
	 
}
}
