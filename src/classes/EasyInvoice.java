package classes;

import java.io.IOException;

import javax.swing.JOptionPane;

public class EasyInvoice {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		//Functions.createQR();
		 Process process = java.lang.Runtime.getRuntime().exec("ping www.google.com"); //later change to DB address, because this is what app will need
	        int x = process.waitFor();
	        if (x == 0) {
	            System.out.println("Connection Successful, "
	                               + "Output was " + x);
	            WelcomeScreen.main(args);
	        }
	        else {
	        	JOptionPane.showMessageDialog(null, "Internet is not accessible");
	            System.out.println("Internet Not Connected, "
	                               + "Output was " + x);
	        }
		
		
	}

}