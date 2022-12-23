import java.util.*;

import javax.swing.JOptionPane;
public class Example_402 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("input your e-mail: ").toLowerCase();
		while(inputEmail.startsWith("@")||inputEmail.contains(" ") ) {
			inputEmail = JOptionPane.showInputDialog("input your e-mail,again: ".toLowerCase());
		}
		boolean checkemail = (inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com"));
		JOptionPane.showMessageDialog(null, checkemail
				?"your email is "+inputEmail
				:"Your e-mail is not hotmail or gmaildot com");
		

	}

}
