package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;




public class Window   {
	


	
	/** Create the window*/
		public Window()
		{
		JFrame windo = new JFrame();
		/** Title */
		windo.setTitle("BOULDER DASH");
		/** Size */
		windo.setSize(336, 359);
		/** location */
		windo.setLocationRelativeTo(null);
		/** CloseOperation */
		windo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/** ContentPane */
		windo.setContentPane(new DisplayElements());
		
		/** visibility */
		windo.setVisible(true);
		windo.addKeyListener(new Keyinput());
		
		}
		

	


	


	}