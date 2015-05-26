package fr.iutvalence.info.m2103.project.sokoban.ihm;
import javax.swing.SwingUtilities;

/**
 * The application displays the window of the game
 * @author cerrutik
 *
 */
public class DisplayApplication 
{

	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Run the task of the management of the screen
		SwingUtilities.invokeLater(new DisplayTask());
		System.out.println("End of the main !");
	}

}
