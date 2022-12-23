import java.util.*;
public class Example_403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int countspace =0;
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence,again : ");
			sentence = scan.nextLine();
		}
		for(int i = 0;i<sentence.length();i++) {
			countspace += (sentence.charAt(i) == ' ') ? 1 : 0;
		}
		System.out.println("This sentence has "+countspace+" space");
		System.out.println("This sentence has "+(countspace+1)+" space");
	}

}
