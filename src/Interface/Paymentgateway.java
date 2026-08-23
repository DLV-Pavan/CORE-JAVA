package Interface;

interface Payment{
	void pay(double amount);
}

class Creditcardpayment implements Payment{

	@Override
	public void pay(double amount) {
	}
	
}

class UPIpayment implements Payment{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		
	}
	
}

class Netbankingpayment implements Payment{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		
	}
	
}

class Paypalpayment implements Payment{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Paymentgateway {
	
	public static void main(String[] args) {

	    Payment credit = new Creditcardpayment();
	    credit.pay(1000);

	    Payment upi = new UPIpayment();
	    upi.pay(1500);

	    Payment net = new Netbankingpayment();
	    net.pay(2000);

	    Payment paypal = new Paypalpayment();
	    paypal.pay(2500);
	}
}