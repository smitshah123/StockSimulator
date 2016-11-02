package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainDashboard extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDashboard frame = new MainDashboard();
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
	public MainDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel userLabel = new JLabel("Name and Date");
		userLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		userLabel.setBounds(293, 11, 131, 14);
		contentPane.add(userLabel);
		
		JLabel moneyLabel = new JLabel("moneyAmount");
		moneyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		moneyLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		moneyLabel.setForeground(new Color(0, 128, 0));
		moneyLabel.setBounds(303, 26, 103, 14);
		contentPane.add(moneyLabel);
		
		JLabel lblSearchForStock = new JLabel("Search for Stock:");
		lblSearchForStock.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSearchForStock.setBounds(10, 51, 100, 14);
		contentPane.add(lblSearchForStock);
		
		textField = new JTextField();
		textField.setBounds(115, 49, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(10, 26, 258, 23);
		contentPane.add(toolBar);
		
		JButton buyStock = new JButton("Buy Stock");
		toolBar.add(buyStock);
		
		JButton btnSellStock = new JButton("Sell Stock");
		btnSellStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toolBar.add(btnSellStock);
		
		JButton btnAddToWishlist = new JButton("Add to Wishlist");
		toolBar.add(btnAddToWishlist);
		
		JScrollPane wishList = new JScrollPane();
		wishList.setBounds(276, 51, 148, 199);
		contentPane.add(wishList);
		
		JPanel moneyGraph = new JPanel();
		moneyGraph.setBounds(10, 82, 228, 168);
		contentPane.add(moneyGraph);
	}
}
