package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;


public class LoginScreen {

	private JFrame frame;
	private JTextField enteredUserName;
	private JLabel userName;
	private JLabel userPassword;
	private JButton userLogin;
	private JLabel lblWelcomeToStock;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen window = new LoginScreen();
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
	public LoginScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(SystemColor.infoText);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		enteredUserName = new JTextField();
		enteredUserName.setBounds(153, 80, 176, 30);
		frame.getContentPane().add(enteredUserName);
		enteredUserName.setColumns(10);
		
		
		userName = new JLabel("User Name");
		userName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		userName.setBounds(74, 69, 78, 50);
		frame.getContentPane().add(userName);
		
		userPassword = new JLabel("Password");
		userPassword.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		userPassword.setBounds(74, 121, 83, 39);
		frame.getContentPane().add(userPassword);
		
		userLogin = new JButton("Login");
		userLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		userLogin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		userLogin.setBounds(192, 181, 89, 23);
		frame.getContentPane().add(userLogin);
		
		lblWelcomeToStock = new JLabel("Welcome To Stock Market Simulator ");
		lblWelcomeToStock.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblWelcomeToStock.setBounds(101, 11, 264, 50);
		frame.getContentPane().add(lblWelcomeToStock);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(153, 126, 176, 30);
		frame.getContentPane().add(passwordField);
	}
	}
