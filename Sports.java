import org.code.theater.*;
import org.code.media.*;


public class Sports extends Scene {

// Arrays for scene media content
String[] Images;
String [] Sounds;
String [][] Text;
String [] textColor;

 // Coordinates and size for drawing characters
  private int x;
  private int y;
  private int size;



 /*
   * Main constructor: Sets up shared media for all sports scenes.
   * @param Images Array of image file names
   * @param Sounds Array of sound file names
   * @param Text 2D array of descriptive words
   * @param textColor Array of text colors
   */
 public Sports ( String [] Images, String[] Sounds, String[][] Text, String [] textColor){
  this.Images = Images;
  this.Sounds = Sounds;
  this.Text = Text;
  this.textColor = textColor;
}

   /*
   * Overloaded constructor for initializing position.
   * @param x X-coordinate
   * @param y Y-coordinate
   */
  public Sports(int x, int y) {
    this.x = x;
    this.y = y;
  }
   yes
  /*
   * Overloaded constructor for position and size.
   * @param x X-coordinate
   * @param y Y-coordinate
   * @param size Size of the character/image
   */
 public Sports(int x, int y, int size) {
    this.x = x;
    this.y = y;
    this.size = size;
  }

  /*
   * Gets the x-coordinate.
   * @return x
   */
  public int getX() {
    return x;
  }

   /*
   * Gets the y-coordinate.
   * @return y
   */
  public int getY() {
    return y;
  }
   /*
   * Gets the size of the object.
   * @return size
   */
  public int getSize(){
   return size;
  }
   /*
   * Sets the x-coordinate.
   * @param x New x value
   */
  public void setX(int x) {
    this.x = x;
  }
  /*
   * Sets the y-coordinate.
   * @param y New y value
   */
  public void setY(int y) {
    this.y = y;
  }
  /*
   * Public method to get time from private helper method.
   * @return Time value
   */
public int getTimes(){
  return timeCalc();
}
  /*
   * Private helper method to simulate a time value.
   * @return A fixed integer value ( 5 seconds)
   */
private int timeCalc(){
  return 5;
  }
  
  

}
