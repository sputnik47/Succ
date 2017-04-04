package succ;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public abstract class Display implements ActionListener{

	public static void main(String[] args) {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		JDialog frame = new JDialog();
		Meme anim = new Meme();
		
		final double HEIGHT = screenSize.getHeight();
		final double WIDTH = screenSize.getWidth();
		
		int window_x = (int)(WIDTH/2) - 300;
		int window_y = (int)(HEIGHT/2) - 300;
		
		
		frame.pack();
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setAlwaysOnTop(true);
		frame.setLocation(window_x ,window_y);
		frame.setSize(700, 750);
		frame.setResizable(false);
		frame.setTitle("Sipp");
		frame.add(anim);
		anim.init();
		
		frame.setVisible(true);
		
		
		
		Timer tick_run = new Timer();
		tick_run.scheduleAtFixedRate(new TimerTask(){
			@Override
	         public void run(){ //commands running every tick
				
				Point mouse_pos = MouseInfo.getPointerInfo().getLocation();
				Point window_pos = frame.getLocation();
				
				int window_2x = (int) window_pos.getX();// had to restate window x and y
				int window_2y = (int) window_pos.getY();// 		because of timer
				int mx = (int) mouse_pos.getX();//mouse x and y
				int my = (int) mouse_pos.getY();
				int close_x = window_2x + 676;// close button x and y
				int close_y = window_2y + 6;
				

				
				double m_distance = Math.sqrt(Math.pow((close_x - mx), 2) + Math.pow((close_y - my), 2)); 
				//mouse distance from [x] ^
				
				
	            if (m_distance <= 50){
					int new_x = window_2x + (close_x - mx);
					int new_y = window_2y + (close_y - my);
			
					frame.setLocation(new_x, new_y);
	            }
	         }},0,30);
		
		}
		
	

}
