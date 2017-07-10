package model;

public class Deplacement 
{
	public static char[][] move(int a, char[][] levelmap){
		//System.out.println("Move !");
		
		
		int depX = 0;
		int depY = 0;
		switch(a) {
			case 1: depX=0; depY=-1; break; //gauche
			case 2:depX=0; depY=1; break; //droite
			case 3: depX=1; depY=0; break; //bas
			case 4: depX=-1; depY=0;break; //haut
			default:break;
		}
		 System.out.println(depX);
		 System.out.println(depY);
		//if(a==1) { //left
		int found=0;
		int dirt= 0;
		int rock=0;
		int wall=0;
		int diams = 0;
		int v = 1;
		char bloc =0;
		
            	
            
			for(int y = 0; y < 20; y++) {
	            for(int x =0; x < 20; x++) {
	            	
	            
	            	if (levelmap[x][y]=='6' && found ==0)
	            	{
	            		if (levelmap[x+depX][y+depY] == '2')
	            		{
	            		dirt = 1;
	            		System.out.println("dirt =" +dirt);
		            	levelmap[x][y] = '1';
		            	levelmap[x+depX][y+depY] = '6';
		            	found =1;
			            System.out.println("found =" +found);
			            break;}
	            		
	            		else if (levelmap[x+depX][y+depY] == '3')
	            		{
	            		wall = 1;
		            	System.out.println("wall =" +wall);
	            		found =1;
			            System.out.println("found =" +found);
			            break;
			            }
	            		else if (levelmap[x+depX][y+depY] == '5' && levelmap[x+depX*2][y+depY*2]=='1')
	            		{levelmap[x][y] = '1';
	            		levelmap[x+depX][y+depY]= '6';
	            		levelmap[x+depX*2][y+depY*2] = '5';
	            		rock = 1;
			            System.out.println("rock =" +rock);
	            		found =1;
			            System.out.println("found =" +found);
			            break;}
	            		else if (levelmap[x+depX][y+depY] == '1')
	            		{
	            		levelmap[x][y] = '1';
			            levelmap[x+depX][y+depY] = '6';	
	            		v = 1;
			            System.out.println("void =" +v);
	            		found =1;
			            System.out.println("found =" +found);
			            break;
			            }
	            		else if (levelmap[x+depX][y+depY] == '4')
	            		{
	            		levelmap[x][y] = '1';
			            levelmap[x+depX][y+depY] = '6';	
	            		v = 1;
			            System.out.println("diams =" +diams);
	            		found =1;
			            System.out.println("found =" +found);
			            break;
			            }
	            	
	                found =1;
			        System.out.println("found =" +found);	
		            break;
	            	}
	            	/*else if (levelmap[x][y]=='5' ){
	            		if (levelmap[x+1][y] =='1')
	            		{
	            		levelmap[x][y] = '1';
	            		try {
	            	    Thread.sleep(300);}         
	            	    catch(InterruptedException ex) {Thread.currentThread().interrupt();}
	            		levelmap[x+1][y] ='5';
	            		if(levelmap[x+1][y]=='6'){
	            			System.out.println("perdu");
	            		}
	            		
	            		break;
	            		}*/
	            
	            	}
	            	}
	            	
	            	
	            
	            
	  
	               
	       
			return levelmap;
}
	

}
