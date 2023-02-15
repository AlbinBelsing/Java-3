import java.util.ArrayList;
import java.util.Scanner; 

public class aTre {
	public static void main (String [] args) {
		
		Scanner reader = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println("Write a name: ");
			
			
		
		while(true) {
			String name = reader.nextLine();
			if(name.equals("")) {
				break;
			}
			
			list.add(name);
		}
			
			System.out.println(list.get(2));
	}
		
	
}
