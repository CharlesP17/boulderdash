package model;

/**
 * Move the player in the level
 * @author Charles
 *
 */
public class Deplacement 
{
	public static int nbrDiamonds = 0;
	public static int win = 0;
	public static char[][] move(int a, char[][] levelmap){
		//System.out.println("Move !");
		
		
		int depX = 0;
		int depY = 0;
		switch(a) {
			case 1: depX=0; depY=-1; break; //left
			case 2:depX=0; depY=1; break; //right
			case 3: depX=1; depY=0; break; //down
			case 4: depX=-1; depY=0;break; //up
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
		int v = 0;
		//char bloc =0;
		int gameover =0;
		//int win =0;
		
            	
            
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
			            ++nbrDiamonds;
			            System.out.println("nbrDiamonds =" +nbrDiamonds);
	            		v = 1;
			            System.out.println("diams =" +diams);
	            		found =1;
			            System.out.println("found =" +found);
			            break;
			            }
	            		/*else if (levelmap[x+depX][y+depY] == '7')
	            		{
	            		levelmap[x][y] = '1';
			            levelmap[x+depX][y+depY] = '7';	
	            		found =0;
	            		gameover =1;
			            System.out.println("found =" +found);
			            break;
			            }*/
	            		else if (gameover == 1){
	            		System.out.println("perdu");
	            	}
	            	else if (levelmap[x+depX][y+depY] == 'v')
	            	{
	            		
	            	win = 1;
	            	System.out.println("win =" +win);
	            	break;}
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


if (nbrDiamonds == 1){System.out.println("find the door");
levelmap[1][1]= 'v';}
if (win == 1){System.out.println("WIN");
for(int i = 0; i < 20; i++) {
    for(int j =0;  j< 20; j++) {
    	if (levelmap[i][j]=='v'){levelmap[i][j]='8';}
    	if (levelmap[i][j]=='3'){levelmap[i][j]='8';}
    	if (levelmap[i][j]=='2'){levelmap[i][j]='8';}
    	if (levelmap[i][j]=='1'){levelmap[i][j]='8';}
    	if (levelmap[i][j]=='5'){levelmap[i][j]='8';}
    	if (levelmap[i][j]=='4'){levelmap[i][j]='8';}
    	if (levelmap[i][j]=='7'){levelmap[i][j]='8';}
    	if (levelmap[i][j]=='6'){levelmap[i][j]='8';}
    }}
}


			return levelmap;
}
	

}
