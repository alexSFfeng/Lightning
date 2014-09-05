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

public class Lightning extends PApplet {

int lightX = 0;
int lightY = 0;
int lightX1 = 0;
int lightY1 = 0;
int opacity = 120;
public void setup()
{
  size(500,500);
  background(0);
  strokeWeight(2.5f);
  frameRate(3);
}
public void draw()
{	
  //range of rgb of electric blue
 while(lightX1 < 500)
 {
 	stroke((int)(Math.random()*39)+44,(int)(Math.random()*14)+104,(int)(Math.random()*136)+120,opacity);
    lightX1 = lightX + (int)(Math.random()*10);
 	lightY1 = lightY + (int)(Math.random()*10)-1;
 	line(lightX,lightY,lightX1,lightY1);
 	lightX = lightX1;
 	lightY = lightY1;
 	opacity = opacity - 1;
 }
 opacity = 120;
 lightX = 0;
 lightY = 0;
 lightX1 = 0;
 lightY1 = 0;
}
public void keyPressed()
{
	if(keyCode == ' ')
	{
		background(0);
	}
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
