package succ;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Meme extends JPanel implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Sound audio = new Sound();
	
	ImageIcon slide1 = new ImageIcon(getClass().getResource("slides/1myfather.jpg"));
	ImageIcon slide2 = new ImageIcon(getClass().getResource("slides/2closeup.jpg"));
	ImageIcon slide3 = new ImageIcon(getClass().getResource("slides/3whysip.jpg"));
	ImageIcon slide4 = new ImageIcon(getClass().getResource("slides/4succ.jpg"));
	String sipp = ("audio/why_sipp.wav");
	String succ = ("audio/succ.wav");
	
	Timer tick = new Timer(1000, this);
	int time = 1;
	boolean earrape_open = false;
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if (time <= 14)//0 - 14
			slide1.paintIcon(this,g,-25,0);
		if (time > 14 && time <= 16)//14 - 16
			slide2.paintIcon(this,g,-25,0);
		if (time > 16 && time <= 21)//16 - 21
			slide3.paintIcon(this,g,-25,0);
		if (time > 21 && time <= 32)//21 - 32
			slide4.paintIcon(this,g,-25,0);
	}

	public void actionPerformed(ActionEvent e) {
		time += 1;
		repaint();
		
		if (time == 33)
			System.exit(0);
		if (time > 21 && time <= 32 && earrape_open == false)
			earrape();
		
	}

	public void init() {
		tick.start();
		audio.playSound(sipp, -15.0f);
	}
	
	public void earrape(){
		earrape_open = true;
		audio.playSound(succ, 6.0f);
	}
	
	
}
