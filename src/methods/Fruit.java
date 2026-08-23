package methods;
import java.util.Scanner;

public class Fruit {
		String name;
		double prize;
		String color;
		
		static Fruit[] fru=new Fruit[10];
		static int index=0;
		
		public Fruit(String name,double prize,String color) {
			this.name=name;
			this.prize=prize;
			this.color=color;
		}
	 static void addFruit() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the fruit name");
			String name=sc.nextLine();
			        sc.nextLine();
			System.out.println("prize:");
			double prize=sc.nextDouble();
			System.out.println("enter color");
			String color=sc.next();
			Fruit f=new Fruit(name,prize,color);
			fru[index++]=f;
			System.out.println("add fruit successfully");
		}
	 
	 static void checkfruit() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter fruit name search");
		 String search = sc.nextLine();
		 for(int i=0;i<index;i++) {
		 if (fru[i].name.equals(search)) {
			    System.out.println("Fruit is available");
			    return;
			}
	 }
		 System.out.println("Fruit is not available");
	 }
		  static void displayFruits() {
			  System.out.println("Enter fruit details:");
			  for(int i=0;i<index;i++) {
				  System.out.println(i+" :index fruit");
				  System.out.println(fru[i].name);
				  System.out.println(fru[i].prize);
				  System.out.println(fru[i].color);
				  

				 
			  } 
		  }
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			boolean start=true;
			
			
			
			do {
				System.out.println("1.addfruit \n2.displayfruit \n3.checkfruit \n4.exit");
				System.out.println("enter the choice");
				int choice=sc.nextInt();
				
			switch(choice) {
			case 1:addFruit();
			       break;
			case 2:displayFruits();
			       break;
			case 3:checkfruit();
				   break;
			
			case 4:System.out.println("exit successfully");
			       start=false;
			       break;
			default:System.out.println("invalid choice try again");
			}
		}while(start);
		}
	}




