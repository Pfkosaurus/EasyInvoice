package classes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Base64;
import java.util.regex.Pattern;

import javax.crypto.spec.PBEKeySpec;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegisterScreen {

	private JFrame frame;
	private JTextField userTxt;
	private JTextField emailTxt;
	private JTextField passTxt;
	private JTextField pass2Txt;
	private JTextField companyTxt;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField ico;
	private JTextField dic;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterScreen window = new RegisterScreen();
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
	public RegisterScreen() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 759, 615);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton registerBtn = new JButton("Register");
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (passTxt.getText().contentEquals(pass2Txt.getText()))
				{
					
					
					boolean result = isValid(emailTxt.getText());
					if (result == true)
					{
						System.out.println("cc");
					}
					
				}
								
				
				
				
			}
		});
		registerBtn.setBounds(219, 231, 89, 23);
		frame.getContentPane().add(registerBtn);
		
		userTxt = new JTextField();
		userTxt.setBounds(184, 71, 285, 20);
		frame.getContentPane().add(userTxt);
		userTxt.setColumns(10);
		
		emailTxt = new JTextField();
		emailTxt.setColumns(10);
		emailTxt.setBounds(184, 96, 285, 20);
		frame.getContentPane().add(emailTxt);
		
		JLabel userLabel = new JLabel("User");
		userLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		userLabel.setBounds(78, 72, 46, 14);
		frame.getContentPane().add(userLabel);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		emailLabel.setBounds(78, 97, 79, 14);
		frame.getContentPane().add(emailLabel);
		
		JButton backBtn = new JButton("Back");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				WelcomeScreen.main(null);
			}
		});
		backBtn.setBounds(415, 231, 89, 23);
		frame.getContentPane().add(backBtn);
		
		JLabel passLabel = new JLabel("Password");
		passLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		passLabel.setBounds(78, 121, 79, 14);
		frame.getContentPane().add(passLabel);
		
		JLabel pass2Label = new JLabel("Repeat password");
		pass2Label.setFont(new Font("Tahoma", Font.BOLD, 15));
		pass2Label.setBounds(78, 146, 79, 14);
		frame.getContentPane().add(pass2Label);
		
		passTxt = new JTextField();
		passTxt.setColumns(10);
		passTxt.setBounds(184, 120, 285, 20);
		frame.getContentPane().add(passTxt);
		
		pass2Txt = new JTextField();
		pass2Txt.setColumns(10);
		pass2Txt.setBounds(184, 145, 285, 20);
		frame.getContentPane().add(pass2Txt);
		
		companyTxt = new JTextField();
		companyTxt.setColumns(10);
		companyTxt.setBounds(184, 170, 285, 20);
		frame.getContentPane().add(companyTxt);
		
		JLabel companyLabel = new JLabel("Company");
		companyLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		companyLabel.setBounds(78, 173, 79, 14);
		frame.getContentPane().add(companyLabel);
		
		JLabel companyLabel_1 = new JLabel("Company");
		companyLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		companyLabel_1.setBounds(78, 198, 79, 14);
		frame.getContentPane().add(companyLabel_1);
		
		JLabel companyLabel_2 = new JLabel("Company");
		companyLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		companyLabel_2.setBounds(304, 201, 79, 14);
		frame.getContentPane().add(companyLabel_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(184, 201, 107, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(374, 201, 107, 20);
		frame.getContentPane().add(textField_1);
	}
	
	public static boolean isValid(String emailTxt)
	{
	String regex = "^(.+)@(.+)$";
	Pattern pattern = Pattern.compile(regex);
	if (emailTxt == null)
	return false;
	return pattern.matcher(emailTxt).matches();
	}
}
