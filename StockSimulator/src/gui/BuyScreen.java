package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class BuyScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyScreen frame = new BuyScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BuyScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(138, 58, 144, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSearchForStock = new JLabel("Search for Stock");
		lblSearchForStock.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchForStock.setBounds(160, 33, 100, 14);
		contentPane.add(lblSearchForStock);
		
		JButton btnBuyStock = new JButton("Buy Stock");
		btnBuyStock.setBounds(138, 108, 146, 23);
		contentPane.add(btnBuyStock);
		
		JButton btnViewPortfolio = new JButton("View Portfolio");
		btnViewPortfolio.setBounds(138, 142, 144, 23);
		contentPane.add(btnViewPortfolio);
		
		JLabel lblMoneyAmount = new JLabel("MONEY AMOUNT");
		lblMoneyAmount.setForeground(new Color(0, 128, 0));
		lblMoneyAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoneyAmount.setBounds(164, 209, 96, 14);
		contentPane.add(lblMoneyAmount);
	}
}
