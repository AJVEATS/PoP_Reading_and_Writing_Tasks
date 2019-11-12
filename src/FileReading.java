import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

	//Task 1 
	
	public String readName1(String fileName) throws Exception{
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		String name = scan.next();
		String name2 = scan.next();
		scan.close();
		return name + " " + name2;
	}
	
	//Task 2 
	
	public String readName2(String fileName){
		File file = new File(fileName);
		Scanner scan;
		try {
				scan = new Scanner(file);
				String name = scan.next();
				String name2 = scan.next();
				scan.close();
				return name + " " + name2;
		} catch (FileNotFoundException e) {
				return "Invalid filename";
		}
	}
	
	//Task 3 
	
	public String[] readNames(String fileName) throws Exception{
		String[] names = new String[10];
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		for( int i = 0; i < names.length; i++) {
			names[i] = scan.next();
			names[i] = names[i] + " " + scan.next();
		}
		scan.close();
		return names;
	}
	
	//Task 4 
	
	public int[] readNumbers1(String fileName) throws Exception {
		int[] numbers = new int[20];
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		for( int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		scan.close();
		return numbers;
	}
	
	/*Task5 
	public ?? readNumbers2(??)  {
		??
	}
	*/
	
	/*Task 6 
	public ?? readAddressBook(??)  {
		??
	}
	*/
	

}
