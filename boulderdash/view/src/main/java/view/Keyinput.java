package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import model.Deplacement;

public class Keyinput extends JPanel implements KeyListener 

{
DisplayElements ntr = new DisplayElements();
char[][] maptab = ntr.Gettab();
	
	@Override
	public void keyPressed(KeyEvent k) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		
		int key = k.getKeyCode();
		switch (key) {
			case KeyEvent.VK_DOWN : 
				
				this.maptab = Deplacement.move(3, this.maptab);
				System.out.println("bas");
				repaint();
				break;
			case KeyEvent.VK_UP:
				this.maptab = Deplacement.move(4, this.maptab);
				System.out.println("haut");
				repaint();
				break;
			case KeyEvent.VK_RIGHT:
				this.maptab = Deplacement.move(2, this.maptab);
				System.out.println("droite");
				repaint();
				break;
			case KeyEvent.VK_LEFT:
				this.maptab = Deplacement.move(1, this.maptab);
				System.out.println("gauche");
				repaint();
				break;}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
