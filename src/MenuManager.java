import java.util.Scanner;
public class MenuManager {

	public static void main(String[] args) {
		int selection;
		Scanner scan = new Scanner(System.in);
		selection = 5;
		while(selection !=6 ) {
			
		System.out.println(" ������������������������ MENU  ����������������������");
		System.out.println("��  1.  Add User's information  ��");
		System.out.println("��  2.        Calories          ��");   
		System.out.println("��  3.        Exercise          ��");    
		System.out.println("��  4.  View User's variation   ��");
		System.out.println("��  5.       Show a menu        ��");
		System.out.println("��  6.          Exit            ��");
		System.out.println(" ������������������������������������������������������������ ");
		System.out.println("Select the number \"1~5\"");
		System.out.println("\n");
		selection = scan.nextInt();
		if(selection == 1) {
			addUser();
		}
		if(selection ==2) {
			addcals();
	
	  }
		if(selection ==3) {
			addexercise();
		}
		if(selection ==4) {
			viewall();
		}
		else
			continue;
		}
	}
	public static void addUser() {
		Scanner nscan = new Scanner(System.in);
		System.out.println("Add User's Name : ");
		String name;
		int age;
		double goal ,weight;
		System.out.println("Add User's Age");
		age = nscan.nextInt();
		name = nscan.nextLine();
		System.out.println("Add User's weight");
		weight = nscan.nextDouble();
		System.out.println("Enter your goal");
		goal = nscan.nextDouble();
		System.out.println("Hello!,"+ name + " Your weight is "+ weight +" kg");
		System.out.println("You are" + age +"year's old.");
		System.out.println("Your goal is"+ goal +" kg");
		System.out.println("\n");
			
		}
	public static void addcals() {
			double cal,sum;
			String food,total;
			sum = 0;
			int check = 1;
			total = "";		
			Scanner cscan = new Scanner(System.in);
			Scanner dscan = new Scanner(System.in);
			
			
			while(check == 1) {
			System.out.println("Add what you consumed");
			food = dscan.nextLine();
			System.out.println("Calories?");
			cal = cscan.nextDouble();
			sum = sum+cal;
			total = food + " " + total;
			System.out.println("You consumed :"+ total);
			System.out.println("Total calories are "+sum+"kcal");
			System.out.println("Add another food?, Enter '1(yes)' or '2(no)'");
			check = cscan.nextInt();
			}
	}
		public static void addexercise() {	
		}
		public static void viewall() {
		}
				
	}
	
