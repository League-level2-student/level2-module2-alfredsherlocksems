package _06_overloading;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Overloading is when we have multiple methods with the SAME name, but DIFFERENT parameters.
 * This can mean a different number of parameters, or the parameter types can differ, or both!
 * An overloaded method can also have a different return type, in addition to changing the parameters.
 * 
 * GOAL: Create your own custom pop-up messages
 */
public class LeagueOptionPane {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel image = new JLabel();
	static JLabel messageLabel = new JLabel();
	public static void showMessageDialog(String message) {
		// 1. Open example.png and make a GUI that looks like that
		//    The message parameter is what we want to show on our pop-up
	
		
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setTitle("Message");
		frame.add(panel);
		
		image.setIcon(loadImage("league.png"));
		panel.add(image);
		
		messageLabel.setText(message);
		panel.add(messageLabel);
		frame.pack();
		
		// 2. Uncomment the line of code below. It sets the location of our frame to the center of the screen
		frame.setLocationRelativeTo(null);
	}
	
	// 3. Call this method in the Runner class
	
	//I did that.

	// 4. Create another showMessageDialog() method that lets us also choose the Message and Title 
	//    2 String parameters (one for the message and one for the title)
	public static void showMessageDialog(String message, String title) {
	messageLabel.setText(message);
	frame.setTitle(title);
	frame.pack();
	}
	// 5. Call this method in the Runner class
	
	//I did that.
	
	// 6. Create another showMessageDialog() method that lets us choose the Message, Title, and Image
	//    3 String parameters (one for the message, one for the title, and one for the fileName)
	public static void showMessageDialog(String message, String title, String imageFileName) {
		messageLabel.setText(message);
		frame.setTitle(title);
		image.setIcon(loadImage(imageFileName));
		frame.pack();
	}
	// 7. Call this method in the Runner class
	
	//I did that.
	
	// CHALLENGE: 
		//	1. Create another showMessageDialog() method that lets us choose the Message, Title, Image, and Background Color
		//     3 String parameters (one for the message, one for the title, and one for the fileName)
		//	   1 Color parameter for the backgroundColor
		//			
		//	2. Change the return type of the 3rd showMessageDialog() method(the one right above) to JPanel
		//	   Make sure to return your panel at the end of that method
		//	
		//	3. Call the showMessageDialog() method you just modified in this method
		//	   Set the method equal to a JPanel
		//	
		//	4. Set the background of your panel to the backgroundColor parameter
		//
		//	5. Call this method in the Runner class
		//
		// WHY DID WE DO THIS? - because we were able to overload this method by calling one of the other methods inside of it
	
	
	public static ImageIcon loadImage(String fileName) {
		try {
			return new ImageIcon(ImageIO.read(new LeagueOptionPane().getClass().getResourceAsStream(fileName)));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
