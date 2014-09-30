 //declare bacteria variables here  
Bacteria[]back = new Bacteria[100];  
 void setup()   
 {     
 	size(400,400);
 	for (int i=0;i<100;i++)
 	{
 		back[i] = new Bacteria(200,200);
 	}

 	//initialize bacteria variables here   
 }   
 void draw()   
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
 	void move()
 	{
 		myX=myX+(int)((Math.random()*20)-10);

 		myY=myY+(int)((Math.random()*20)-10);

 	}
 	void show()
 	{
 		noStroke();
 		fill ((int)(Math.random()*10),(int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
 		ellipse(myX,myY,20,20);//lots of java!   
 	}
 }    