import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;


public class CreateAccount {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccount window = new CreateAccount();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 541, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnCreateNewAccount = new JTextPane();
		txtpnCreateNewAccount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnCreateNewAccount.setForeground(Color.BLUE);
		txtpnCreateNewAccount.setBackground(Color.LIGHT_GRAY);
		txtpnCreateNewAccount.setText("Create New Account");
		txtpnCreateNewAccount.setBounds(199, 22, 172, 33);
		frame.getContentPane().add(txtpnCreateNewAccount);
		
		JTextPane txtpnUserName = new JTextPane();
		txtpnUserName.setForeground(Color.BLUE);
		txtpnUserName.setBackground(Color.LIGHT_GRAY);
		txtpnUserName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnUserName.setText("First Name");
		txtpnUserName.setBounds(41, 92, 72, 33);
		frame.getContentPane().add(txtpnUserName);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(123, 92, 139, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setText("Password");
		txtpnPassword.setForeground(Color.BLUE);
		txtpnPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnPassword.setBackground(Color.LIGHT_GRAY);
		txtpnPassword.setBounds(41, 233, 72, 33);
		frame.getContentPane().add(txtpnPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123, 229, 139, 25);
		frame.getContentPane().add(passwordField);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setText("Email");
		txtpnEmail.setForeground(Color.BLUE);
		txtpnEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnEmail.setBackground(Color.LIGHT_GRAY);
		txtpnEmail.setBounds(41, 182, 72, 33);
		frame.getContentPane().add(txtpnEmail);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(123, 182, 139, 25);
		frame.getContentPane().add(textField_1);
		
		JTextPane txtpnLastName = new JTextPane();
		txtpnLastName.setText("Last Name");
		txtpnLastName.setForeground(Color.BLUE);
		txtpnLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnLastName.setBackground(Color.LIGHT_GRAY);
		txtpnLastName.setBounds(40, 135, 72, 33);
		frame.getContentPane().add(txtpnLastName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(122, 135, 139, 25);
		frame.getContentPane().add(textField_2);
		
		JTextPane txtpnStartingAmmount = new JTextPane();
		txtpnStartingAmmount.setText("Starting Amount");
		txtpnStartingAmmount.setForeground(Color.BLUE);
		txtpnStartingAmmount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpnStartingAmmount.setBackground(Color.LIGHT_GRAY);
		txtpnStartingAmmount.setBounds(41, 277, 72, 48);
		frame.getContentPane().add(txtpnStartingAmmount);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(5000, 1000, 50000, 1000));
		spinner.setBounds(132, 287, 72, 20);
		frame.getContentPane().add(spinner);
	}
}
