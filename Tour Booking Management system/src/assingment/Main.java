package assingment;

public class Main {
	public static void main(String[] args) {
        Admin admin = new Admin("admin", "password");
       Customer customer = new Customer("customer", "password");

        admin.addOrder();//// Association
        admin.deleteOrder();
        admin.modifyOrder();
        customer.cancelReservation();
        customer.makebooking();
        customer.confirmPackage();
    }
}
