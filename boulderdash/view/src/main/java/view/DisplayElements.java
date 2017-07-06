package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;


import javax.swing.JPanel;
import model.dao.Connect;

import javax.imageio.ImageIO;




//test


public class DisplayElements extends JPanel {
private static final long serialVersionUID = 1L;
char[][] tab= new char[20][20];
public DisplayElements(){
	
	this.Gettab();
}
	
	
/** allow the picture to display on the panel*/
public void paintComponent(Graphics g)
{	

/** get the map*/



Connect test = new Connect();
	test.Getmap();
	System.out.println(test.Getmap());
String str = test.Getmap();
	


	/** split the map in differents part and pull it the board*/
String[] splitArray = str.split(";");
for(int x = 0; x<20;x++){
for(int y = 0; y<20;y++){
		/** Detect the position of each character in the board*/
tab[x][y]=splitArray[x].charAt(y);} 



try{
	for(int i=0; i<tab.length; i++){
	for(int j=0; j<tab.length; j++){

/** replace each letter by a picture*/		
switch (tab[j][i])
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
Image img6 = ImageIO.read(new File("8.jpg"));
g.drawImage(img6, i*16, j*16, null);
break;
case '7':
Image img7 = ImageIO.read(new File("7.jpg"));
g.drawImage(img7, i*16, j*16, null);
break;


}
}

}}
catch(IOException e)
{
		e.printStackTrace();

}


}}
public void setMAP(char[][] tab, DisplayElements display)
{
	this.tab=tab;
}
public char [][] Gettab()
{
	return this.tab;
}
public static char[][] move(int a, char[][] tab){
	//System.out.println("Move !");
	
	int depX = 0;
	int depY = 0;
	switch(a) {
		case 1: depX=-1; depY=0; break;
		case 2:depX=1; depY=0; break;
		case 3: depY=1; depX=0; break;
		case 4: depY=-1; depX=0;break;
		default:break;
	}
	
	//if(a==1) { //left
	int found=0;
		for(int y = 0; y < 20; y++) {
            for(int x =0; x < 20; x++) {
                 
            	if(tab[y][x]=='6' && found==0) {
            		if(tab[y+depY][x+depX]=='3') {
            			found=1;
            			break;
            		}
            		else if(tab[y+depY][x+depX]=='5' && tab[y+depY*2][x+depX*2]=='1') {
            			tab[y][x] = '1';
            			tab[y+depY][x+depX] = '6';
            			tab[y+depY*2][x+depX*2] = '5';
            			found=1;
            			break;
            		}
            		else if (tab[y+depY][x+depX]=='2' || tab[y+depY][x+depX]=='1') {
            			tab[y][x] = '1';
	            		tab[y+depY][x+depX] = '6';
            		}
            		else if (tab[y+depY][x+depX]=='4') {
            			tab[y][x] = '1';
	            		tab[y+depY][x+depX] = '6';
	            		
	            		//System.out.println("Diamonds : "+nbrDiamond);
            		}
            		else if (tab[y+2][x]=='5') {
            		//	this.dead();
            			
            		}
            		found=1;
            		break;
            	}
            }
        }
		return tab;


}}


