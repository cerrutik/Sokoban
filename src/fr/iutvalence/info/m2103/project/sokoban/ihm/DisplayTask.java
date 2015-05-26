package fr.iutvalence.info.m2103.project.sokoban.ihm;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
/**
 * Task managing the display
 * @author cerrutik
 *
 */
public class DisplayTask implements Runnable 
{
	/**
	 * The main window
	 */
	private JFrame window;
	
	
	@Override
	public void run() 
	{
		// Create a new window
		// Set a title and a size
		
		this.window = new JFrame();
		this.window.setTitle("Sokoban");
		this.window.setSize(800, 600);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		//Makes the window visible
		this.window.setVisible(true);
		
	}

}
