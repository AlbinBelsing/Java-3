import java.util.Scanner;
import java.util.ArrayList;


public class fTre {
	public static void main (String [] args ) {
		
		Scanner reader = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		System.out.println("Write numbers ");
		
		while(true) {
			int number = reader.nextInt();
			if (number == -1) {
				break;
			 
		}
			numbers.add(number);
			
	} 
		
		int greatest = numbers.get(0);
		
		for(int i = 0; i < numbers.size(); i++) {
			int number = numbers.get(i);
			if (greatest < number) {
				greatest = number;
		}
		//System.out.println("All numbers" + numbers);
		 //här ska det stå greatest 
	}
		System.out.println("Greatest: " + greatest);
}
}
