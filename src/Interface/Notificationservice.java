package Interface;

interface Notification{
	void sendNotification(String message);
}

class Emailnotification implements Notification{

	@Override
	public void sendNotification(String message) {
		// TODO Auto-generated method stub
		System.out.println("Notification sent through Email:" + message);
		
	}
	
}

class SMSnotification implements Notification{

	@Override
	public void sendNotification(String message) {
		// TODO Auto-generated method stub
		System.out.println("Notification send through SMS:" + message);
		
	}
	
}

class Whatsappnotification implements Notification{

	@Override
	public void sendNotification(String message) {
		// TODO Auto-generated method stub
		System.out.println("Notification send through Whatsapp:" + message);
		
	}
	
}


public class Notificationservice {
	public static void main(String args[]) {
		Notification email = new Emailnotification();
		email.sendNotification("Your order has been shipped");
		
		Notification SMS = new SMSnotification();
		SMS.sendNotification("Your OTP is 123456");
		
		Notification Whatsapp = new Whatsappnotification();
		Whatsapp.sendNotification("Your package will be delivered today.");
	}

}
