package classes;

import java.awt.PageAttributes.MediaType;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import javax.imageio.ImageIO;



public class Functions {
	private static String receiverName= MainScreen.getReceiver();
	private static String ibanNumber = "SK002087650000002008765";
	private static String description = "description";
	private static String amountE = MainScreen.getAmount();
	//must encode - spaces must be replaced with %20

	public void replaceAndCreateDoc() 
	{
		
	}
	
	public void saveAndSend() 
	{
		
	}
	
	public void registerNew()
	{
		
	}
	
	public void login()
	{
		
	}
	
	public void logout()
	{
		
	}
	
	public void forgotPassword()
	{
		
	}
	
	public void clear()
	{
		
	}
	
	public void settings()
	{
		
	}
	
	public static void createQR() throws IOException
	{
		URL url = new URL("https://chart.googleapis.com/chart?cht=qr&chl=BCD%0A002%0A1%0ASCT%0A%0A" + receiverName + "%0A" +ibanNumber + "%0AEUR" + amountE + "%0A%0A" + description + "%0A%0A&chs=180x180&choe=UTF-8&chld=L|2");
		InputStream in = new BufferedInputStream(url.openStream());
		OutputStream out = new BufferedOutputStream(new FileOutputStream("testQR.jpg"));

		for ( int i; (i = in.read()) != -1; ) {
		    out.write(i);
		}
		in.close();
		out.close();	
	}
	
	
	public static StringBuilder sendRequest() throws IOException
	{

		StringBuilder informationString = null;
			try {
				URL url = new URL("");				
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.connect();
				
				int responseCode = conn.getResponseCode();
				if(responseCode !=200)
				{
				throw new RuntimeException("HttpResponseCode: " + responseCode);
				}
				else
				{
					 informationString = new StringBuilder();
					Scanner scanner = new Scanner(url.openStream());
					
					while (scanner.hasNext()) {
						informationString.append(scanner.nextLine());
					}
					scanner.close();					
					
				}	
			}			
		catch (MalformedURLException e)
			{
			e.printStackTrace();
			}		
		
		
		
		return informationString;
	}
	
}
		
