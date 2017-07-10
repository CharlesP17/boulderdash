package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;


import javax.swing.JPanel;

import model.Deplacement;
import model.dao.Connect;

import javax.imageio.ImageIO;




//test


public class DisplayElements extends JPanel implements KeyListener {
private static final long serialVersionUID = 1L;
public char[][] map;
public DisplayElements(){

	
}
	
	
/** allow the picture to display on the panel*/
public void paintComponent(Graphics g)
{	





try{
	for(int i=0; i<map.length; i++){
	for(int j=0; j<map.length; j++){
		
		
                
 
            

/** replace each letter by a picture*/		
switch (map[j][i])
{
case '1':
Image img1 = ImageIO.read(new File("1.jpg"));
g.drawImage(img1, i*16, j*16, null);
break;
case '2':
Image img2 = ImageIO.read(new File("2.jpg"));
g.drawImage(img2, i*16, j*16, null);
break;
case '3':
Image img3 = ImageIO.read(new File("3.jpg"));
g.drawImage(img3, i*16, j*16, null);
break;
case '4':
Image img4 = ImageIO.read(new File("4.jpg"));
g.drawImage(img4, i*16, j*16, null);
break;
case '5':
Image img5 = ImageIO.read(new File("5.jpg"));
g.drawImage(img5, i*16, j*16, null);
break;
case '6':
Image img6 = ImageIO.read(new File("6.jpg"));
g.drawImage(img6, i*16, j*16, null);
break;
case '7':
Image img7 = ImageIO.read(new File("7.jpg"));
g.drawImage(img7, i*16, j*16, null);
break;


}
		
if (map[j][i]=='5' ){
		if (map[j+1][i] =='1')
		{
		
		try {	
	    Thread.sleep(100);}         
	    catch(InterruptedException ex) {Thread.currentThread().interrupt();}
		map[j][i] = '1';
		map[j+1][i] ='5';}
		else if (map[j+1][i] =='6')
		{
		try {Thread.sleep(1000);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}	
		}
		
		else if (map[j+1][i]=='1' && map[j+2][i]=='6'){
			System.out.println("ça marche ma couille");
		}
}

	
	
}}}

catch(IOException e)
{
		e.printStackTrace();

}



/*for(int v = 0; v < this.map.length; v++) {
    for(int z =0; z < this.map.length; z++) {
         
        System.out.println(this.map[v][z]);}
    	System.out.println("");
		}*/
}
public void setMAP(char[][] map, DisplayElements panelwindow)
{
	this.map=map;
}
public char [][] Gettab()
{
	return this.map;
}


@Override
public void keyPressed(KeyEvent k) {
	// TODO Auto-generated method stub
	int key = k.getKeyCode();
	switch (key) {
		case KeyEvent.VK_DOWN : 
			
			this.map = Deplacement.move(3, this.map);
			System.out.println("bas");
			repaint();
			break;
		case KeyEvent.VK_UP:
			this.map = Deplacement.move(4, this.map);
			System.out.println("haut");
			repaint();
			break;
		case KeyEvent.VK_RIGHT:
			this.map = Deplacement.move(2, this.map);
			System.out.println("droite");
			repaint();
			break;
		case KeyEvent.VK_LEFT:
			this.map = Deplacement.move(1, this.map);
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




