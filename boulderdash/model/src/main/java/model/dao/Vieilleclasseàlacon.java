package model.dao;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Vieilleclasseàlacon {
	private int posX;
	private int posY;
	private static int nbrDiamond;
	
	public Vieilleclasseàlacon(String name, Image path, char code) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public static char[][] move(int a, char[][] tabMap){
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
			for(int y = 0; y < 25; y++) {
	            for(int x =0; x < 25; x++) {
	                 
	            	if(tabMap[y][x]=='P' && found==0) {
	            		if(tabMap[y+depY][x+depX]=='W') {
	            			found=1;
	            			break;
	            		}
	            		else if(tabMap[y+depY][x+depX]=='S' && tabMap[y+depY*2][x+depX*2]=='V') {
	            			tabMap[y][x] = 'V';
	            			tabMap[y+depY][x+depX] = 'P';
	            			tabMap[y+depY*2][x+depX*2] = 'S';
	            			found=1;
	            			break;
	            		}
	            		else if (tabMap[y+depY][x+depX]=='D' || tabMap[y+depY][x+depX]=='V') {
	            			tabMap[y][x] = 'V';
		            		tabMap[y+depY][x+depX] = 'P';
	            		}
	            		else if (tabMap[y+depY][x+depX]=='G') {
	            			tabMap[y][x] = 'V';
		            		tabMap[y+depY][x+depX] = 'P';
		            		nbrDiamond+=1;
		            		//System.out.println("Diamonds : "+nbrDiamond);
	            		}
	            		else if (tabMap[y+2][x]=='S') {
	            		//	this.dead();
	            			
	            		}
	            		found=1;
	            		break;
	            	}
	            }
	        }
		//}
		//System.out.println(depX);
		return tabMap;
	}
}