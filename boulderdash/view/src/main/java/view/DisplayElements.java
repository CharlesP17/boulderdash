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
int monster =0;
public char[][] map;
public static int gameover= 0;
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
Image img1 = ImageIO.read(new File("11.jpg"));
g.drawImage(img1, i*16, j*16, null);
break;
case '2':
Image img2 = ImageIO.read(new File("22.jpg"));
g.drawImage(img2, i*16, j*16, null);
break;
case '3':
Image img3 = ImageIO.read(new File("33.jpg"));
g.drawImage(img3, i*16, j*16, null);
break;
case '4':
Image img4 = ImageIO.read(new File("44.jpg"));
g.drawImage(img4, i*16, j*16, null);
break;
case '5':
Image img5 = ImageIO.read(new File("55.jpg"));
g.drawImage(img5, i*16, j*16, null);
break;
case '6':
Image img6 = ImageIO.read(new File("66.jpg"));
g.drawImage(img6, i*16, j*16, null);
break;
case '7':
Image img7 = ImageIO.read(new File("77.jpg"));
g.drawImage(img7, i*16, j*16, null);
break;
case '8':
Image img8 = ImageIO.read(new File("8.jpg"));
g.drawImage(img8, i*16, j*16, null);
break;
case 'v':
Image imgv = ImageIO.read(new File("10.jpg"));
g.drawImage(imgv, i*16, j*16, null);
break;


}
		
if (map[j][i]=='5' ){
		if (map[j+1][i]=='1' && map[j+2][i]=='6'){
    		map[j][i] = '1';
    		map[j+1][i]= '1';
    		map[j+2][i] = '5';
    		gameover = 1;}
		
		else if (map[j+1][i]=='5'  && map[j][i+1]=='1' && map[j+1][i+1]=='1'){
			map[j][i]='1';
			map[j][i+1] ='5';
			}
		else if (map[j+1][i]=='5'   && map[j][i-1]=='1'&& map[j+1][i-1]=='1'){
			map[j][i]='1';
			map[j][i-1] ='5';
			}
		else if (map[j+1][i]=='5'   && map[j][i+1]=='1' && map[j+1][i+1]=='6'){
			map[j][i]='1';
			
			map[j+1][i+1] ='5';
			
			gameover = 1;
			}
		else if (map[j+1][i]=='5'  && map[j][i-1]=='1'&& map[j+1][i-1]=='6'){
			map[j][i]='1';
			map[j+1][i-1] ='5';
			gameover = 1;
			}
		else if (map[j+1][i]=='4'  && map[j][i+1]=='1' && map[j+1][i+1]=='1'){
			map[j][i]='1';
			map[j][i+1] ='5';
			}
		else if (map[j+1][i]=='4'   && map[j][i-1]=='1'&& map[j+1][i-1]=='1'){
			map[j][i]='1';
			map[j][i-1] ='5';
			}
		else if (map[j+1][i]=='4'   && map[j][i+1]=='1' && map[j+1][i+1]=='6'){
			map[j][i]='1';
			map[j+1][i+1] ='5';
			gameover = 1;
			}
		else if (map[j+1][i]=='4'  && map[j][i-1]=='1'&& map[j+1][i-1]=='6'){
			map[j][i]='1';
			map[j+1][i-1] ='5';
			gameover = 1;
			}
		else if (map[j+1][i]=='1'){
				map[j][i] = '1';
				map[j+1][i]= '5';
					}
		else if (map[j+1][i]=='7'){
			map[j][i] = '1';
			map[j+1][i]= '4';
				}
		if (gameover == 1 )
		{for(int m = 0; m < 20; m++) {
			  for(int t =0;  t< 20; t++) {
				    if (map[m][t]=='v'){map[m][t]='8';}
				  	if (map[m][t]=='6'){map[m][t]='8';}
			    	if (map[m][t]=='3'){map[m][t]='8';}
			    	if (map[m][t]=='2'){map[m][t]='8';}
			    	if (map[m][t]=='1'){map[m][t]='8';}
			    	if (map[m][t]=='5'){map[m][t]='8';}
			    	if (map[m][t]=='4'){map[m][t]='8';}
			    	if (map[m][t]=='7'){map[m][t]='8';}
			    }}}		
		
}
else if (map[j][i]=='4' ){
	if (map[j+1][i]=='1' && map[j+2][i]=='6'){
		map[j][i] = '1';
		map[j+1][i]= '1';
		map[j+2][i] = '4';
		gameover = 1;}
	else if (map[j+1][i] =='1')
	{
	map[j][i] = '1';
	map[j+1][i] ='4';}
	
	if (gameover == 1 )
	{for(int m = 0; m < 20; m++) {
		  for(int t =0;  t< 20; t++) {
			  
			    if (map[m][t]=='v'){map[m][t]='8';}
			  	if (map[m][t]=='6'){map[m][t]='8';}
		    	if (map[m][t]=='3'){map[m][t]='8';}
		    	if (map[m][t]=='2'){map[m][t]='8';}
		    	if (map[m][t]=='1'){map[m][t]='8';}
		    	if (map[m][t]=='5'){map[m][t]='8';}
		    	if (map[m][t]=='4'){map[m][t]='8';}
		    	if (map[m][t]=='7'){map[m][t]='8';}
		    }}}	}

else if (map[j][i]=='7' ){
	int rand =(int) (Math.random() * ( 4 - 0 ));
	switch (rand){
	
	case 0: if (map[j-1][i]=='1'){   //haut.monster
			
			map[j][i]='1';
			//try {Thread.sleep(200);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
			map[j-1][i]='7';}
	else if (map[j-1][i]=='6'){gameover =1;}
			break;
	
	case 1:	if (map[j+1][i]=='1'){   //bas.monster
		
		map[j][i]='1';
		//try {Thread.sleep(200);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
		map[j+1][i]='7';}
	else if (map[j+1][i]=='6'){gameover =1;}
	break;
	
	case 2:	if (map[j][i-1]=='1'){   //gauche.monster
		
		map[j][i]='1';
		//try {Thread.sleep(200);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
		map[j][i-1]='7';}
	else if (map[j][i-1]=='6'){gameover =1;}
	break;
	
	case 3:	if (map[j][i+1]=='1'){   //droite.monster
			
		map[j][i]='1';
		//try {Thread.sleep(200);}catch(InterruptedException ex) {Thread.currentThread().interrupt();}
		map[j][i+1]='7';}
	else if (map[j][i+1]=='6'){gameover =1;}
		break;
	
	
	}
if (gameover == 1 )
	{for(int m = 0; m < 20; m++) {
	  for(int t =0;  t< 20; t++) {
		  	if (map[m][t]=='v'){map[m][t]='8';}
		  	if (map[m][t]=='6'){map[m][t]='8';}
	    	if (map[m][t]=='3'){map[m][t]='8';}
	    	if (map[m][t]=='2'){map[m][t]='8';}
	    	if (map[m][t]=='1'){map[m][t]='8';}
	    	if (map[m][t]=='5'){map[m][t]='8';}
	    	if (map[m][t]=='4'){map[m][t]='8';}
	    	if (map[m][t]=='7'){map[m][t]='8';}
	    }}}
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




