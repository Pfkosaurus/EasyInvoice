package classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeScreen {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeScreen window = new WelcomeScreen();
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
	
	
	public WelcomeScreen() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 759, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MainScreen.main(null);
				
				
				
			}
		});
		loginBtn.setBounds(219, 231, 89, 23);
		frame.getContentPane().add(loginBtn);
		
		textField = new JTextField();
		textField.setBounds(219, 115, 285, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(219, 174, 285, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("User");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(340, 90, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(318, 149, 79, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton registerBtn = new JButton("Register");
		registerBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				RegisterScreen.main(null);
			}
		});
		registerBtn.setBounds(415, 231, 89, 23);
		frame.getContentPane().add(registerBtn);
		
	}
}
