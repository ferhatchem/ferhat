/* 
 * Cashier.java: A cashier menu for North Houston Restaurant
 */


package restaurant;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.util.*;

/**
 * This is the Cashier1 class
 */
public class Cashier1 extends JFrame {

	/**
	 * This method consist of application launch events 
	 */
	public void launchApp()	{	
		Login login = new Login();
		login.launchFrame();
	}

	/**
	 * This the driver program
	 */
	public static void main(String args[]) {
		Cashier cashier = new Cashier();
		cashier.launchApp();
	}	
}// End of Cashier class

/**
 * This is the Login class
 */
class Login extends JFrame implements KeyListener {

	// Store cashier's name
	public static String cashierName;

	// GUI components
	private JFrame loginFrame;
	private JLabel loginLabel;
	private JTextField loginText;

	/**
	 * This constructor initialize GUI components
	 */
	public Login() {
		loginFrame = new JFrame("Cashier Login");
		loginLabel = new JLabel("Cashier Name :");
		loginText = new JTextField("NewUser", 10);
		loginText.setFont(new Font("",Font.BOLD,12));
	
	}
public void launchFrame() {
		// TODO Auto-generated method stub
		
	}
public class cashier1 {

}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}