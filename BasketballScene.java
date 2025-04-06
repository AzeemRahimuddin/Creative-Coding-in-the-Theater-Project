import org.code.theater.*;
import org.code.media.*;

public class BasketballScene extends Sports {


/*
   * Constructor for BasketballScene. Passes media and text arrays to the superclass.
   * @param Images Array of image file names
   * @param Sounds Array of sound file names
   * @param Text 2D array of descriptive words
   * @param textColor Array of color strings
   */
public BasketballScene ( String [] Images, String[] Sounds, String[][] Text, String [] textColor){
  super (Images, Sounds, Text, textColor);
}
    /*
     * Draws the basketball scene with images, sounds, and text.
     * Overrides the drawScene method from the Sports class.
     */
 public void drawScene() {
    drawBasketball();
  }
  
 /*
   * Private helper method that animates a basketball player shooting the ball.
   */ 
 private void drawBasketball(){
Sports position = new Sports (140,40);

 // Draw basketball court and player
drawImage(Images[0],0,0,getWidth()); // Basketball court background
drawImage(Images[3],position.getX(),position.getY(),120);// basketball player image
playSound(Sounds[0]);
drawImage(Images[2],position.getX()+20,position.getY(),30); // The basketball 
drawText(" My favorite sport is basketball. It is:  ",5,240);
  
   // Ball animation: movement using x and y
   int x = 160;
   int y = 40;
   
    for (int i = 0; i < 10; i++) {
    drawImage(Images[0],0,0,getWidth());// basketllcourt
    drawImage(Images[3],position.getX(),position.getY(),120);// person
      
    drawImage(Images[2], x, y, 30);
       x = x -10;
    if (i < 5){
       y= y -5;
    }
     else{ 
       y = y + 5;
     }
      pause(0.5);
    }

  // Randomly display 3 uppercased words in different colors from the 2D array
 int randomColorIndex = 0; 
 int z = 260;
 for(int i =0; i < 3; i++){
      randomColorIndex = (int)(Math.random() * textColor.length);
      setTextColor(textColor[randomColorIndex]);
   
      z = z + 20;
      drawText(Text[0][i].toUpperCase(),5,z);
      pause(1);
      }

   // Display time taken to shoot
  int time = getTimes(); 
  drawText("Time taken to shoot in seconds:   " + time,5,350);
  pause(3);
       
   
  // Clear the screen
   clear("white");
   pause(0.5);
}




  
}
