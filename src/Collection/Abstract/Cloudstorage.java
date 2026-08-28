package Collection.Abstract;

abstract class Cloudstorage1 {
	
	String accountname;
	String storagecapacity;
	String username;
	
	Cloudstorage1(String accountname, String storagecapacity, String username)
	{
		this.accountname = accountname;
		this.storagecapacity = storagecapacity;
		this.username = username;
	}
	
	public void uploadfile()
	{
		System.out.println("enter accountname: "+ accountname);
		System.out.println("enter storagecapacity: "+ storagecapacity);
		System.out.println("enter username: "+ username);
	}
	
	public void downloadfile()
	{
		System.out.println("enter accountname: "+ accountname);
		System.out.println("enter storagecapacity: "+ storagecapacity);
		System.out.println("enter username: "+ username);
	}
	
	public void displayStorageInfo()
	{
		System.out.println("enter accountname: "+ accountname);
		System.out.println("enter storagecapacity: "+ storagecapacity);
		System.out.println("enter username: "+ username);
	}
	
	abstract void synchronizeFiles();

    abstract void calculateAvailableStorage();

    abstract void handleBackup();
}

class Googledrive extends Cloudstorage1
{

	Googledrive(String accountname, String storagecapacity, String username) {
		super(accountname, storagecapacity, username);
		// TODO Auto-generated constructor stub
	}

	@Override
	void synchronizeFiles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calculateAvailableStorage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void handleBackup() {
		// TODO Auto-generated method stub
		
	}
	
}

class Dropbox extends Cloudstorage1
{

	Dropbox(String accountname, String storagecapacity, String username) {
		super(accountname, storagecapacity, username);
		// TODO Auto-generated constructor stub
	}

	@Override
	void synchronizeFiles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calculateAvailableStorage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void handleBackup() {
		// TODO Auto-generated method stub
		
	}
	
}

class Onedrive extends Cloudstorage1
{

	Onedrive(String accountname, String storagecapacity, String username) {
		super(accountname, storagecapacity, username);
		// TODO Auto-generated constructor stub
	}

	@Override
	void synchronizeFiles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calculateAvailableStorage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void handleBackup() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Cloudstorage{
	public static void main(String args[]) {
		Cloudstorage1 cs1 = new Googledrive("Current Account", "KB", "Pavan");
		Cloudstorage1 cs2 = new Dropbox("Rahul", "MB", "rahul456");
		Cloudstorage1 cs3 = new Onedrive("Kiran", "HD", "kiran789");

		cs1.displayStorageInfo();
		cs1.downloadfile();
		cs1.uploadfile();
		cs1.synchronizeFiles();
		cs1.calculateAvailableStorage();
		cs1.handleBackup();

		System.out.println();

		cs2.displayStorageInfo();
		cs2.downloadfile();
		cs2.uploadfile();
		cs2.synchronizeFiles();
		cs2.calculateAvailableStorage();
		cs2.handleBackup();

		System.out.println();

		cs3.displayStorageInfo();
		cs3.downloadfile();
		cs3.uploadfile();
		cs3.synchronizeFiles();
		cs3.calculateAvailableStorage();
		cs3.handleBackup();
	}
}