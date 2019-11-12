import java.util.Scanner;
public class UserInput {
	//Task 1 
	
	public String sayHello() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name");
        String name = input.nextLine();
		return "Hello " + name;
		
	}
	
	//Task 2 
	
	
	public int[] readTenNumbers() {
		Scanner input = new Scanner(System.in);
		int[] tenNum = {0,0,0,0,0,0,0,0,0,0};
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter number " + (i+1));
	        int tempNum = input.nextInt();
	        tenNum[i] = tempNum;
		}
		return tenNum;
	}
	
	//Task 3 
	
	public String[] readTenNames() {
		Scanner input = new Scanner(System.in);
		String[] tenNames = {"","","","","","","","","",""};
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter name " + (i+1));
			String tempName = input.nextLine();
			tenNames[i] = tempName;
		}
		return tenNames;
	}
	
	/* Task 4 
	public ?? cinemaViewing() {
		??
	}
	 */
	public String cinemaViewing() {
		Scanner input = new Scanner(System.in);
		int age = 0;
		System.out.println("Enter your age");
		age = input.nextInt();
		if(age < 0 || age > 120) {
			return "Invalid age";
		} else if (age < 4) {
			return "Too young for a film";
		} else if (age < 8) {
			return "U - suitable for four years and over";
		} else if(age < 12) {
			return "U - suitable for four years and over" + 
					"\nPG - suitable for eight years and over";
		} else if(age < 15) {
			return "U - suitable for four years and over" +
					"\nPG - suitable for eight years and over" +
					"\n12 - suitable for twelve years and over";
		} else if(age < 18) {
			return "U - suitable for four years and over" +
					"\nPG - suitable for eight years and over" +
					"\n12 - suitable for twelve years and over" +
					"\n15 - suitable for fifteen years and over";
		} else {
			return "U - suitable for four years and over" +
					"\nPG - suitable for eight years and over" +
					"\n12 - suitable for twelve years and over" +
					"\n15 - suitable for fifteen years and over" +
					"\n18 - suitable for adults only";
		}
	}
}
