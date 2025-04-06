import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  
  
   /*
   * The main method initializes all media and data, creates scene objects,
   * and plays the animation using Theater.playScenes.
   */
  public static void main(String[] args) {

  // 1D Array containing the background, ball and player images
String [] Images = { "BasketballCourt.png","Track.png","Basketball.png","Basketball_player.png","runner_track.png"};   

   // 1D Array containing the sounds for both of the scenes 
String [] Sounds = {"basketball_dribbling.wav","crowd_cheering.wav","trackstart.wav"};

   // 2D Array containing the descriptive words that will be printed out for each scene 
  String [][] Text = {{"Fun", "Exciting","Joyful"},
                    {"Fast","Tiring","Painful"}};                   

  // 1D Array containg colors that will be used randomly on the words when they get printed out
  String [] colorArray = { "blue", "green", "purple", "orange", "red","black","aqua","brown"};


 // Create scene objects with shared media and text
  BasketballScene basketballScene = new BasketballScene(Images, Sounds, Text, colorArray);
  TrackScene trackScene = new TrackScene(Images, Sounds, Text, colorArray);                         
    
    
 // Draw and play each scene
 basketballScene.drawScene();
 trackScene.drawScene();


// Play both scenes using the Theater class
Theater.playScenes(basketballScene,trackScene);

    
    
  }
}
