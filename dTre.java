import java.util.ArrayList; 
import java.util.Scanner;

public class dTre {
	public static void main (String [] args) {
		
		Scanner reader = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println("Write names: ");
		
		while(true) {
			String lista = reader.nextLine();
			if (lista.equals("")) {
				break;
			}
			list.add(lista);
			
			
		}
		
		String Last = list.get(list.size()-1) ;
		String First = list.get(0);
		
		
		System.out.println("Last: " + Last );
		System.out.println("First: " + First + "\n");
		
		System.out.println("Last: " + list.get(list.size()-1));
		System.out.println("First: " + list.get(0));
	}
	}