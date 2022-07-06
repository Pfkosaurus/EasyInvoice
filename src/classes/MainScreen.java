package classes;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JSpinner;

public class MainScreen {

	private JFrame frame;
	private JTextField addressTxt;
	private JTextField icoTxt;
	private JTextField dicTxt;
	private JTextField dateIssueTxt;
	private JTextField deliveryDateTxt;
	private JTextField dueDateTxt;
	private JTextField customerTxt;
	private JTextField addressCustomerTxt;
	private JTextField itemTxtField;
	private String nameTField;
	private String itemLabel;
    private int count;
    private int fromLeft;
    private int fromTop;
    private int fromRight;
    private int fromBottom;
    private int fromLeftPanelItemN;
    private int fromLeftPanelPiece;
    private static JTextField supplierNameTxt;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField ibanTxt;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private static JTextField finalPriceTxt;
    private JTextField pieceTxtField;
    private JLabel itemJLabel;
    private JLabel lblNewLabel;
    private JLabel lblQuantity;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
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
	public MainScreen() {
		nameTField = "tField";
        count = 0;
        fromLeft = 187;
        fromTop = 200;
        fromRight = 415;
        fromBottom = 20;
        fromLeftPanelItemN = 200;
        fromLeftPanelPiece = 245;
		initialize();
		//(187, 200, 86, 20);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 923, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton newInvBtn = new JButton("Create a new invoice");
		newInvBtn.setBounds(10, 54, 89, 23);
		frame.getContentPane().add(newInvBtn);
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		exitBtn.setBounds(10, 573, 89, 23);
		frame.getContentPane().add(exitBtn);
		
		JButton printBtn = new JButton("Print");
		printBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Functions.createQR();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		printBtn.setBounds(784, 573, 89, 23);
		frame.getContentPane().add(printBtn);
		
		JButton reviewBtn = new JButton("Review");
		reviewBtn.setBounds(10, 88, 89, 23);
		frame.getContentPane().add(reviewBtn);
		
		JButton logoutBtn = new JButton("Logout");
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				WelcomeScreen.main(null);
			}
		});
		logoutBtn.setBounds(10, 539, 89, 23);
		frame.getContentPane().add(logoutBtn);
		
		JButton clearBtn = new JButton("Clear");
		clearBtn.setBounds(10, 122, 89, 23);
		frame.getContentPane().add(clearBtn);
		
		JButton settingsBtn = new JButton("Settings...");
		settingsBtn.setBounds(10, 505, 89, 23);
		frame.getContentPane().add(settingsBtn);
		
		JLabel supplierL = new JLabel("Supplier");
		supplierL.setBounds(142, 58, 81, 14);
		frame.getContentPane().add(supplierL);
		
		JLabel addressSuplL = new JLabel("Address");
		addressSuplL.setBounds(142, 83, 81, 14);
		frame.getContentPane().add(addressSuplL);
		
		JLabel icoL = new JLabel("ICO");
		icoL.setBounds(142, 108, 81, 14);
		frame.getContentPane().add(icoL);
		
		JLabel dicL = new JLabel("DIC");
		dicL.setBounds(142, 131, 81, 14);
		frame.getContentPane().add(dicL);
		
		JLabel ibanL = new JLabel("IBAN");
		ibanL.setBounds(142, 156, 81, 14);
		frame.getContentPane().add(ibanL);
		
		addressTxt = new JTextField();
		addressTxt.setColumns(10);
		addressTxt.setBounds(216, 83, 155, 0);
		frame.getContentPane().add(addressTxt);
		
		icoTxt = new JTextField();
		icoTxt.setColumns(10);
		icoTxt.setBounds(216, 108, 155, 0);
		frame.getContentPane().add(icoTxt);
		
		dicTxt = new JTextField();
		dicTxt.setColumns(10);
		dicTxt.setBounds(216, 133, 155, 0);
		frame.getContentPane().add(dicTxt);
		
		
		JLabel dueDateL = new JLabel("Due date");
		dueDateL.setBounds(142, 577, 81, 14);
		frame.getContentPane().add(dueDateL);
		
		JLabel deliveryDateL = new JLabel("Delivery date");
		deliveryDateL.setBounds(142, 557, 81, 14);
		frame.getContentPane().add(deliveryDateL);
		
		JLabel dateIssueL = new JLabel("Date of issue");
		dateIssueL.setBounds(142, 527, 81, 14);
		frame.getContentPane().add(dateIssueL);
		
		dateIssueTxt = new JTextField();
		dateIssueTxt.setBounds(216, 524, 122, 0);
		frame.getContentPane().add(dateIssueTxt);
		dateIssueTxt.setColumns(10);
		
		deliveryDateTxt = new JTextField();
		deliveryDateTxt.setColumns(10);
		deliveryDateTxt.setBounds(216, 554, 122, 0);
		frame.getContentPane().add(deliveryDateTxt);
		
		dueDateTxt = new JTextField();
		dueDateTxt.setColumns(10);
		dueDateTxt.setBounds(216, 577, 122, 0);
		frame.getContentPane().add(dueDateTxt);
		
		JLabel finalPrice = new JLabel("Final price");
		finalPrice.setBounds(348, 524, 81, 14);
		frame.getContentPane().add(finalPrice);
		
		
		
		JLabel customerL = new JLabel("Customer");
		customerL.setBounds(422, 57, 81, 14);
		frame.getContentPane().add(customerL);
		
		JLabel addressCustomerL = new JLabel("Address");
		addressCustomerL.setBounds(422, 82, 81, 14);
		frame.getContentPane().add(addressCustomerL);
		
		customerTxt = new JTextField();
		customerTxt.setColumns(10);
		customerTxt.setBounds(496, 54, 155, 0);
		frame.getContentPane().add(customerTxt);
		
		addressCustomerTxt = new JTextField();
		addressCustomerTxt.setColumns(10);
		addressCustomerTxt.setBounds(496, 82, 155, 0);
		frame.getContentPane().add(addressCustomerTxt);
		
		
		
		JButton btnNewButton = new JButton("Add new item");
		btnNewButton.addActionListener(new ActionListener() {
			 @Override
			public void actionPerformed(ActionEvent e) {
				if (count == 13)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Maximum itemov si uz dosiahol chlapecku");
					System.out.println("maximalny pocet objednavok dosiahnuty");
				}
				else
				{
					itemTxtField = new JTextField();
					itemTxtField.setName(nameTField + count);					
					pieceTxtField = new JTextField();
					
	                count++;
	                itemJLabel = new JLabel("Item N." + count);
	                
	                frame.getContentPane().add(itemTxtField);
	                frame.getContentPane().add(itemJLabel);
	                frame.getContentPane().add(pieceTxtField);
	                
	                itemTxtField.setBounds(fromLeft, fromTop, fromRight, fromBottom);
	                itemJLabel.setBounds(125, fromLeftPanelItemN, 415, 20);
	                pieceTxtField.setBounds(620, fromTop, 40, 20);
	                
	                fromTop = fromTop + 25;
	                fromLeftPanelItemN = fromLeftPanelItemN + 25;
	               // fromLeftPanelPiece = fromLeftPanelPiece + 25;
	                
	                //frame.revalidate();  // For JDK 1.7 or above.
	                frame.getContentPane().revalidate(); // For JDK 1.6 or below.                
	                //frame.repaint();                
					System.out.println("novy riadok "+ itemTxtField.getName());
				}
				
			}
		});
		
		
		
		
		
		
		btnNewButton.setBounds(581, 156, 122, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel emailCustomerL = new JLabel("Email");
		emailCustomerL.setBounds(422, 108, 81, 14);
		frame.getContentPane().add(emailCustomerL);
		
		supplierNameTxt = new JTextField();
		supplierNameTxt.setBounds(187, 55, 225, 20);
		frame.getContentPane().add(supplierNameTxt);
		supplierNameTxt.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(187, 80, 225, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(187, 105, 225, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(187, 128, 225, 20);
		frame.getContentPane().add(textField_3);
		
		ibanTxt = new JTextField();
		ibanTxt.setColumns(10);
		ibanTxt.setBounds(187, 153, 225, 20);
		frame.getContentPane().add(ibanTxt);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(529, 55, 225, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(529, 80, 225, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(529, 105, 225, 20);
		frame.getContentPane().add(textField_7);
		
		JButton btnDone = new JButton("Save and send");
		btnDone.setBounds(652, 573, 122, 23);
		frame.getContentPane().add(btnDone);
		
		textField_9 = new JTextField();
		textField_9.setBounds(212, 526, 111, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(212, 554, 111, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(212, 582, 111, 20);
		frame.getContentPane().add(textField_11);
		
		finalPriceTxt = new JTextField();
		finalPriceTxt.setColumns(10);
		finalPriceTxt.setBounds(403, 524, 111, 20);
		frame.getContentPane().add(finalPriceTxt);
		
		lblNewLabel = new JLabel("Item");
		frame.revalidate();
		lblNewLabel.setBounds(394, 184, 81, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblQuantity = new JLabel("quantity");
		lblQuantity.setBounds(622, 184, 81, 14);
		frame.getContentPane().add(lblQuantity);
		
		
				
		
	}

	public static String getReceiver() {
		// TODO Auto-generated method stub
		return supplierNameTxt.getText();
	}

	public static String getAmount() {
		// TODO Auto-generated method stub
		return finalPriceTxt.getText();
	}
}
