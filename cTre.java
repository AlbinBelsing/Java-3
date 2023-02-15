import java.util.ArrayList;
import java.util.Scanner;

public class cTre {
	public static void main (String [] args) {
	
		Scanner reader = new Scanner(System.in);
		
		ArrayList<String> name = new ArrayList();
		
		System.out.println("Write names: ");
	
		while (true) {
			String text = String.valueOf(reader.nextLine());
		
			if(text.equals("")) {
				break;
			}
			name.add(text); 
		}
		System.out.println("Total: " + name.size());
	}	
	
}
