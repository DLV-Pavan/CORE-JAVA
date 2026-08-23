package Abstract;

abstract class Subscription1 {
	
	int subscriberid;
	String customername;
	String emailaddress;
	String subscriptionstartdate;
	
	Subscription1(int subscriberid, String customername, String emailaddress, String subscriptionstartdate)
	{
		this.subscriberid = subscriberid;
		this.customername = customername;
		this.emailaddress = emailaddress;
		this.subscriptionstartdate = subscriptionstartdate;
	}
	
	public void login()
	{
		System.out.println("enter subscriber id: " + subscriberid);
		System.out.println("enter customer name: " + customername);
		System.out.println("enter emailaddress: " + emailaddress);
		System.out.println("enter subscriptionstartdate: " + subscriptionstartdate);

	}
	
	public void viewprofile()
	{
		System.out.println("enter subscriber id: " + subscriberid);
		System.out.println("enter customer name: " + customername);
		System.out.println("enter emailaddress: " + emailaddress);
		System.out.println("enter subscriptionstartdate: " + subscriptionstartdate);
	}
	
	public void watchcontent()
	{
		System.out.println("enter subscriber id: " + subscriberid);
		System.out.println("enter customer name: " + customername);
		System.out.println("enter emailaddress: " + emailaddress);
		System.out.println("enter subscriptionstartdate: " + subscriptionstartdate);
	}
	
	abstract void displayVideoQuality();
	
	abstract void displaySupportedDevices();
	
	abstract void displayOfflineDownloadLimit();
	
	abstract void displayMonthlySubscriptionCost();
	
}

class Basicplan extends Subscription1
{

	Basicplan(int subscriberid, String customername, String emailaddress, String subscriptionstartdate) {
		super(subscriberid, customername, emailaddress, subscriptionstartdate);
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayVideoQuality() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void displaySupportedDevices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void displayOfflineDownloadLimit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void displayMonthlySubscriptionCost() {
		// TODO Auto-generated method stub
		
	}
	
}

class Standardplan extends Subscription1
{

	Standardplan(int subscriberid, String customername, String emailaddress, String subscriptionstartdate) {
		super(subscriberid, customername, emailaddress, subscriptionstartdate);
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayVideoQuality() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void displaySupportedDevices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void displayOfflineDownloadLimit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void displayMonthlySubscriptionCost() {
		// TODO Auto-generated method stub
		
	}
	
}

class Premiumplan extends Subscription1
{

	Premiumplan(int subscriberid, String customername, String emailaddress, String subscriptionstartdate) {
		super(subscriberid, customername, emailaddress, subscriptionstartdate);
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayVideoQuality() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void displaySupportedDevices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void displayOfflineDownloadLimit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void displayMonthlySubscriptionCost() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Subscription{
	public static void main(String args[]) {
		Subscription1 s1 = new Basicplan(100,"Pavan","pavan@gmail.com","01-08-2026");
		Subscription1 s2 = new Standardplan(101,"sunil","sunil@gmail.com","02-08-2026");
		Subscription1 s3 = new Premiumplan(102,"venkat","venkat@gmail.com","03-08-2026");
		
		s1.login();
		s1.viewprofile();
		s1.watchcontent();
		s1.displayVideoQuality();
		s1.displaySupportedDevices();
		s1.displayOfflineDownloadLimit();
		s1.displayMonthlySubscriptionCost();
		
		System.out.println();
		
		s2.login();
		s2.viewprofile();
		s2.watchcontent();
		s2.displayVideoQuality();
		s2.displaySupportedDevices();
		s2.displayOfflineDownloadLimit();
		s2.displayMonthlySubscriptionCost();
		
		System.out.println();
		
		s3.login();
		s3.viewprofile();
		s3.watchcontent();
		s3.displayVideoQuality();
		s3.displaySupportedDevices();
		s3.displayOfflineDownloadLimit();
		s3.displayMonthlySubscriptionCost();

	}
}
