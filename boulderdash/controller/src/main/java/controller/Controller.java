package controller;
import view.Window;
public class Controller 
{
	private Window wind;
	private char[][] map;
	private boolean gameRunning;
	
	public Controller(char[][] levelmap){
	
	gameRunning = true;
	this.wind = new Window();
	this.map=levelmap;
	//this.Gameloop(this.map);
	
	}
	
public void Gameloop(char[][]levelmap)
{
	while (gameRunning) {
	this.wind.UpdateMap(levelmap);
	try {
	    Thread.sleep(1000);                 //1000 milliseconds is one second.
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
	
}}}
