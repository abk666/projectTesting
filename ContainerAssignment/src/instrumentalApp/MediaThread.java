package instrumentalApp;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MediaThread implements Runnable{
private String fileName;
private String folderName;
public MediaThread(String folderName,String fileName) {
   this.folderName=folderName;
   this.fileName=fileName;
}
    @Override
	public void run() {
    	Media sound2=new Media(new File("src\\"+folderName+"\\"+fileName).toURI().toString());
    	MediaPlayer mPlayer=new MediaPlayer(sound2);
    	mPlayer.setAutoPlay(true);
		
	}


	
	

	

}

	


