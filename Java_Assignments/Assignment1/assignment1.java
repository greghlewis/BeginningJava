import javax.swing.JOptionPane;


public class displayName {

	public static void main(String[] args) {
		//first name string
		String First_Name = JOptionPane.showInputDialog(null,"What is your first name?");
		//last name string
		String Last_Name = JOptionPane.showInputDialog(null,"What is your last name?");
		//middle name string
		String Middle_Name = JOptionPane.showInputDialog(null,"What is your middle name?");
		//integer count
		int xxx = First_Name.length() + Last_Name.length() + Middle_Name.length();
		//display name and length
		JOptionPane.showMessageDialog(null, "Your full name is: " + Last_Name +", " + First_Name + " " + Middle_Name + "\n This name has a total of " + xxx + " characters");
	}

}