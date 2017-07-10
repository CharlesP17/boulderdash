package view;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;




public class Window   {
	
	DisplayElements panelwindow;
	JFrame windo;


	
	/** Create the window*/
		public Window()
		{
			this.windo = new JFrame();
			this.panelwindow = new DisplayElements();
		/** Title */
		windo.setTitle("BOULDER DASH");
		/** Size */
		windo.setSize(336, 359);
		/** location */
		windo.setLocationRelativeTo(null);
		/** CloseOperation */
		windo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/** ContentPane */
		windo.setContentPane(panelwindow);
		
		/** visibility */
		windo.setVisible(true);
		windo.addKeyListener(panelwindow);
		
		}
		
		public void UpdateMap(char[][] map){

			
			panelwindow.setMAP(map,panelwindow);
			windo.setContentPane(panelwindow);
			//WindowPanel.setFirstTime(false);
	


	


	}}