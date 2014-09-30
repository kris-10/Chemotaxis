import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

 //declare bacteria variables here  
Bacteria[]back = new Bacteria[100];  
 public void setup()   
 {     
 	size(400,400);
 	for (int i=0;i<100;i++)
 	{
 		back[i] = new Bacteria(200,200);
 	}

 	//initialize bacteria variables here   
 }   
 public void draw()   
 {  
 	for(int i = 0;i<back.length;i++)
 	{

 		back[i].move();
 		back[i].show();
 	}
 	//move and show the bacteria   
 }  
 class Bacteria    
 {  
 	int myX, myY, myColor;   
 	Bacteria (int x, int y)
 		{
 			myX=x;
 			myY=y;
 			myColor=color(0,255,0);
 		}
 	public void move()
 	{
 		myX=myX+(int)((Math.random()*20)-10);

 		myY=myY+(int)((Math.random()*20)-10);

 	}
 	public void show()
 	{
 		noStroke();
 		fill ((int)(Math.random()*10),(int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
 		ellipse(myX,myY,20,20);//lots of java!   
 	}
 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
