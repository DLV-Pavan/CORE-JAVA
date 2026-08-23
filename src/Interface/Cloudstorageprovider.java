package Interface;

interface Cloudstorage{
	void uploadFile(String filename);
	void downloadFile(String fileName);
}

class AWSS3Storage implements Cloudstorage{

	public void uploadFile(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Uploading " + fileName + " to AWS S3 Storage.");
		
	}

	@Override
	public void downloadFile(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Downloading " + fileName + " from AWS S3 Storage.");

		
	}

}

class GoogleCloudStorage implements Cloudstorage{

	public void uploadFile(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Uploading " + fileName + " to Google Cloud Storage.");

		
	}

	@Override
	public void downloadFile(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Downloading " + fileName + " from Google Cloud Storage.");

		
		
	}

	
}

class AzureBlobStorage implements Cloudstorage{

	public void uploadFile(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Uploading " + fileName + " to Azure Blob Storage.");

		
	}

	@Override
	public void downloadFile(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Downloading " + fileName + " from Azure Blob Storage.");
		
	}

	
}


public class Cloudstorageprovider {
	public static void main(String args[]) {
		Cloudstorage aws = new AWSS3Storage();
        aws.uploadFile("report.pdf");
        aws.downloadFile("report.pdf");

        Cloudstorage gc = new GoogleCloudStorage();
        gc.uploadFile("report.pdf");
        gc.downloadFile("image.png");

        Cloudstorage az = new AzureBlobStorage();
        az.uploadFile("report.pdf");
        az.downloadFile("document.docx");
	}
}

