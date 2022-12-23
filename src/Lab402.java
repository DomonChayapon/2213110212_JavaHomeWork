import java.util.*;
public class Lab402 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.println("The sentence must end with full stop : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int countofSpace = 0;
		for(int i = 0;i<sentence.length();i++) {
			System.out.print((sentence.charAt(i) == ' ') ? "\n" : sentence.charAt(i));
			}
		}

	}


