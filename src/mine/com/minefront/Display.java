package mine.com.minefront;

import java.awt.Canvas;
import javax.swing.JFrame;

public class Display extends Canvas
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final String TITLE = "My first 3d game";
	
	private Thread thread;
	
	public static void main(String[] args) 
	{
		Display game = new Display();
		JFrame frame = new JFrame();
		frame.add(game);
		frame.pack();
		frame.setTitle(TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setVisible(true);
		
		System.out.println("Running...");
	}
	
}

