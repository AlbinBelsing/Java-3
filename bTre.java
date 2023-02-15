import java.util.Scanner;
import java.util.ArrayList;




public class bTre {
	public static void main (String [] args) {
	
		Scanner reader = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		System.out.println("Give a number: ");
		
		
		while(true) {
			int number = Integer.valueOf(reader.nextLine());
			
			if (number == 0) {
				break;
			}
			numbers.add(number);
		}
		
		System.out.println(numbers.get(8) + numbers.get(4));
		
	}
}
