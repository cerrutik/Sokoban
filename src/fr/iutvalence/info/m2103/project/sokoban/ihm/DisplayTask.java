package fr.iutvalence.info.m2103.project.sokoban.ihm;

import java.awt.GridLayout;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
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
	private JPanel container;
		
	public DisplayTask() 
	{
		// Create a new window
		// Set a title and a size
		
		this.window = new JFrame();
		this.window.setTitle("Sokoban");
		this.window.setSize(800, 600);
		this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.window.setResizable(false);
		JSplitPane splitSuperieur = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		this.container = new JPanel();
		this.container.setLayout(new GridLayout(25,20));
		for (int i=0; i<25;i++)
		{
			for (int j=0;j<20;j++)
			{
				this.container.add(new JLabel("x"));
			}
		}
		splitSuperieur.setTopComponent(container);
		window.getContentPane().add(splitSuperieur);
		
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
		splitSuperieur.setBottomComponent(Column);
		window.getContentPane().add(splitSuperieur);
		
		//Makes the window visible
		this.window.setVisible(true);
		
	}

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		
	}

}
