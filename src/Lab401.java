import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full name: ");
		String fullname = scan.nextLine();
		int space = fullname.indexOf(' ');
		//System.out.println(fullname.contains(" ")?fullname.substring(0,space)+"\n"+fullname.substring(space+1):"Incorrect Name");
		/*if(space == -1) {
			System.out.print("incorrect");
		}
		else {
			System.out.println("first Name: "+fullname.substring(0,space).toUpperCase());
			System.out.println("last  Name: "+fullname.substring(space+1).toLowerCase());*/
			System.out.print(space == -1 ?"incorrect": "first Name: "+fullname.substring(0,space).toUpperCase()
					+"\nlast  Name: "+fullname.substring(space+1).toLowerCase());
	}

}
