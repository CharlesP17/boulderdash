package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import model.ModelFacade;

import model.dao.Connect;
import view.DisplayElements;
import view.ViewFacade;
import view.Window;

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
        //Connect ok = new Connect();
        Window lol = new Window();
        DisplayElements ok = new DisplayElements();
        char[][] maptablo = ok.Gettab();
        for (int i=0; i<20; i++){
        	for(int j=0; j<20; j++){
        		
        		System.out.println(maptablo[i][j]);	
        	}
        }
        
    
    }

}
