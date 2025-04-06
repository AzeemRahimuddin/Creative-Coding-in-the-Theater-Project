import org.code.theater.*;
import org.code.media.*;

/*
 * The TrackScene class animates a Track and Field scene.
 * It extends the Sports superclass and overrides drawScene.
 */
public class TrackScene extends Sports {

  
  /*
   * Constructor for TrackScene. Passes media and text data to the superclass.
   *
   * @param Images     Array of image file names
   * @param Sounds     Array of sound file names
   * @param Text       2D array of descriptive words
   * @param textColor  Array of color strings
   */
  public TrackScene ( String [] Images, String[] Sounds, String[][] Text, String [] textColor){
  super (Images, Sounds, Text, textColor);
}

 /*
   * Overrides drawScene from Scene.
   * Calls method to animate the Track and Field scene.
   */
public void drawScene() {
    drawTrack();
  }


  /*
   * Private helper method that draws the track animation,
   * including runner movement, text descriptions, and sound effects.
   */
private void drawTrack(){

Sports loc = new Sports (45,100,80);  // Starting position for the runner
drawImage(Images[1],0,0,getWidth());  // track background
drawImage(Images[4],loc.getX(),loc.getY(),loc.getSize());// person
pause(0.5);
playSound(Sounds[2]);
drawText(" My favorite sport is Track and Field. It is:  ",5,280);

       // Runner animation loop
    for (int i = 0; i < 26; i++) {
        drawImage(Images[1],0,0,getWidth());// track
        drawImage(Images[4],loc.getX(),loc.getY(),80);// person
        loc.setX(loc.getX() + 10);
        pause(0.1);
    }
    playSound(Sounds[1]);  // crowd cheering

   // Display descriptive words in random colors
   int randomColorIndex = 0; 
   int z = 290;
   for(int i =0; i < 3; i++){
      randomColorIndex = (int)(Math.random() * textColor.length);
      setTextColor(textColor[randomColorIndex]);
   
      z = z + 20;
      drawText(Text[1][i].toLowerCase(),5,z);
      pause(1);
      }
  // Display runtime
  int time = getTimes(); 
  drawText("Running time in seconds:    " + time,5,380);
  pause(3);
  
    }

  /*
   * Returns the adjusted time using timeCalc.
   * @return int representing adjusted time
   */
public int getTimes(){
  return timeCalc();
}
   /*
   * Private helper method that subtracts 1 from the superclass time.
   * @return int adjusted time value
   */ 
private int timeCalc(){
  return super.getTimes() -1;
  }
  



}

