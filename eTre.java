import java.util.Scanner;
import java.util.ArrayList;


public class eTre {
	public static void main (String [] args) {
	
		Scanner reader = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		
		System.out.println("Write numbers: (-1 to exit)");
		
		while(true) {
			int number = reader.nextInt();
			
			if (number == -1) {
				break;
				
			}
			numbers.add(number);
		}
		
		System.out.println("From where? ");
			int start = reader.nextInt();
		
		System.out.println("To where? ");
			int end = reader.nextInt();
			
		for (int i = start; i<=end; i++) {
			System.out.println(numbers.get(i));
		}
	}
}
