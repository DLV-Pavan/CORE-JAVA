package Inheritance;
import java.util.Scanner;
class chatbot{
	private int botid;
	private String botname;
	private String version;
	private String developername;
	private String apikey;
	
	public chatbot(int botid,String botname,String version,String developername,String apikey)
	{
		this.botid = botid;
		this.botname = botname;
		this.version = version;
		this.developername = developername;
		this.apikey = apikey;
	}
	
	//getter
	
	public int getbotid()
	{
		return botid;
	}
	
	public String getbotname()
	{
		return botname;
	}
	
	public String version()
	{
		return version;
	}
	
	public String developername()
	{
		return developername;
	}
	
	public String apikey()
	{
		return apikey;
	}
	
	//setter
	public void setbotid(int botid)
	{
		this.botid = botid;
	}
	public void setbotname(String botname)
	{
		this.botname = botname;
	}
	public void setversion(String version)
	{
		this.version = version;
	}
	public void setdevelopername(String developername)
	{
		this.developername = developername;
	}
	public void setapikey(String apikey)
	{
		this.apikey = apikey;
	}
	//display details
	
	public void displaybotdetails()
	{
		System.out.println("botid: " + botid);
		System.out.println("botname: " + botname);
		System.out.println("version: " + version);
		System.out.println("developername: " + developername);
		System.out.println("apikey: " + apikey);

	}
	public void generateResponse(String prompt) {
		 System.out.println("Generic chatbot response.");
    
	}
}

class CustomerSupportBot extends chatbot {

    private String supportedDepartment;

    public CustomerSupportBot(int botId, String botName,String version,
                              String developerName, String apiKey,
                              String supportedDepartment) {

        super(botId, botName, version, developerName, apiKey);
        this.supportedDepartment = supportedDepartment;
    }

    @Override
    public void generateResponse(String prompt) {
        System.out.println("\nCustomer Support Bot Response:");
        System.out.println("Thank you for contacting " + supportedDepartment + ".");
        System.out.println("Your Query: " + prompt);
    }
}

//CodeAssistantBot.java
class CodeAssistantBot extends chatbot {

 private String programmingLanguage;

 public CodeAssistantBot(int botId, String botName, String version,
                         String developerName, String apiKey,
                         String programmingLanguage) {

     super(botId, botName, version, developerName, apiKey);
     this.programmingLanguage = programmingLanguage;
 }

 @Override
 public void generateResponse(String prompt) {
     System.out.println("\nCode Assistant Bot Response:");
     System.out.println("Generating " + programmingLanguage + " solution...");
     System.out.println("Prompt: " + prompt);
 }
}

//HealthcareBot.java
class HealthcareBot extends chatbot {

 private String medicalDomain;

 public HealthcareBot(int botId, String botName, String version,
                      String developerName, String apiKey,
                      String medicalDomain) {

     super(botId, botName, version, developerName, apiKey);
     this.medicalDomain = medicalDomain;
 }

 @Override
 public void generateResponse(String prompt) {
     System.out.println("\nHealthcare Bot Response:");
     System.out.println("Medical Domain: " + medicalDomain);
     System.out.println("User Query: " + prompt);
     System.out.println("Please consult a qualified doctor.");
 }
}


public class Chatbotapplication {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose ChatBot Type");
        System.out.println("1. Customer Support Bot");
        System.out.println("2. Code Assistant Bot");
        System.out.println("3. Healthcare Bot");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Bot ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Bot Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Version: ");
        String version = sc.nextLine();

        System.out.print("Enter Developer Name: ");
        String developer = sc.nextLine();

        System.out.print("Enter API Key: ");
        String apiKey = sc.nextLine();

        chatbot bot = null;

        switch (choice) {

            case 1:
                System.out.print("Enter Supported Department: ");
                String dept = sc.nextLine();

                System.out.print("Enter User Prompt: ");
                String prompt1 = sc.nextLine();

                bot = new CustomerSupportBot(id, name, version,
                        developer, apiKey, dept);

                bot.displaybotdetails();
                bot.generateResponse(prompt1);
                break;

            case 2:
                System.out.print("Enter Programming Language: ");
                String lang = sc.nextLine();

                System.out.print("Enter User Prompt: ");
                String prompt2 = sc.nextLine();

                bot = new CodeAssistantBot(id, name, version,
                        developer, apiKey, lang);

                bot.displaybotdetails();
                bot.generateResponse(prompt2);
                break;

            case 3:
                System.out.print("Enter Medical Domain: ");
                String domain = sc.nextLine();

                System.out.print("Enter User Prompt: ");
                String prompt3 = sc.nextLine();

                bot = new HealthcareBot(id, name, version,
                        developer, apiKey, domain);

                bot.displaybotdetails();
                bot.generateResponse(prompt3);
                break;

            default:
                System.out.println("Invalid Choice");
        }
	}
}
