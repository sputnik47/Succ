package succ;

import java.awt.*;
import javax.swing.*;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame frame = new JFrame();
		
		Meme anim = new Meme();
		
		final double HEIGHT = screenSize.getHeight();
		final double WIDTH = screenSize.getWidth();
		
		frame.pack();
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation((int)(WIDTH/2) - 300,(int)(HEIGHT/2) - 300);
		frame.setSize(700, 750);
		frame.setResizable(false);
		frame.setTitle("Why sip when you can...");
		frame.add(anim);
		anim.init();
		
		frame.setVisible(true);
		
		
		
	}

}
