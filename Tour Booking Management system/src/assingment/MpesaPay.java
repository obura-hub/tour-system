package assingment;

public class MpesaPay implements payment{

	String payerName ="Payment has been validate Number = 0709653436";
	@Override

	public void makepayment() {//method implementing datasource.
		System.out.print("MPESA Payment has been made");
}
	public void validatepayment() {
		System.out.print(paymentNumber);
	}
}
