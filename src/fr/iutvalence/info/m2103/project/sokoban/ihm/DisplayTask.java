package fr.iutvalence.info.m2103.project.sokoban.ihm;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
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
		
	public DisplayTask() 
	{
		// Create a new window
		// Set a title and a size
		
		this.window = new JFrame();
		this.window.setTitle("Sokoban");
		this.window.setSize(800, 600);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.window.setResizable(false);
		
		
		JPanel line1 = new JPanel();
		line1.setLayout(new BoxLayout(line1,BoxLayout.LINE_AXIS));
		line1.add(new JButton("Up"));
		JPanel line2 = new JPanel();
		line2.setLayout(new BoxLayout(line2,BoxLayout.LINE_AXIS));
		line2.add(new JButton("Left"));
		line2.add(new JButton("Right"));
		JPanel line3 = new JPanel();
		line3.setLayout(new BoxLayout(line3,BoxLayout.LINE_AXIS));
		line3.add(new JButton("Down"));
		JPanel Column = new JPanel();
		Column.setLayout(new BoxLayout(Column,BoxLayout.PAGE_AXIS));
		Column.add(line1);
		Column.add(line2);
		Column.add(line3);
		
		window.getContentPane().add(Column);
		
		//Makes the window visible
		this.window.setVisible(true);
		
	}

}
