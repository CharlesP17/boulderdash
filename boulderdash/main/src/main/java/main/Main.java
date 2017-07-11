package main;



import controller.Controller;



import model.dao.Connect;


/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {
	
	


    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
    	
        //Connect connection = new Connect();
    	//Connect con = new Connect();
    	Connect con = new Connect();
        Controller controller = new Controller(con.levelmap);
        
       // Window lol = new Window();
        /*DisplayElements ok = new DisplayElements();
        char[][] maptablo = ok.Gettab();
        for (int i=0; i<20; i++){
        	for(int j=0; j<20; j++){
        		
        		System.out.println(maptablo[i][j]);	
        	}
        }*/
        
    
    }
}

