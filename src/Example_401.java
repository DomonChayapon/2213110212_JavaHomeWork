import java.util.*;
public class Example_401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = "", word2="";
		while(true)
		{
		System.out.print("Enter Word: ");
		word = scan.nextLine();
		if(word.equalsIgnoreCase("stop")) {
			break;
		}
		word2 += word+" ";
		
		}
		
		System.out.print(word2);
	}

}
