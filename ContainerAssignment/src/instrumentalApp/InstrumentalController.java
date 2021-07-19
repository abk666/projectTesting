package instrumentalApp;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class InstrumentalController implements Initializable {
	 @FXML
	    private TabPane tabPane;
    @FXML
    private TreeView<String> tvInstruments;
    private Image instrument=new Image(getClass().getResourceAsStream("../img/music-note.png"));
    private Image Piano=new Image(getClass().getResourceAsStream("../img/piano.png"));
    private Image Drum=new Image(getClass().getResourceAsStream("../img/drums.png"));
    
    @FXML
    void processDo(ActionEvent event) {
        MediaThread playMedia=new MediaThread("pianoSounds","Do.wav");
    	playMedia.run();
    	
    	System.out.println("Hello World");
    }

    @FXML
    void processFa(ActionEvent event) {
    	 MediaThread playMedia=new MediaThread("pianoSounds","Fa.wav");
     	playMedia.run();
     	System.out.println("Hello World");
    }

    @FXML
    void processLa(ActionEvent event) {
    	 MediaThread playMedia=new MediaThread("pianoSounds","La.wav");
     	playMedia.run();
     	System.out.println("Hello World");
    }

    @FXML
    void processMi(ActionEvent event) {
    	 MediaThread playMedia=new MediaThread("pianoSounds","Mi.wav");
     	playMedia.run();
     	System.out.println("Hello World");
    }

    @FXML
    void processRe(ActionEvent event) {
    	 MediaThread playMedia=new MediaThread("pianoSounds","Re.wav");
     	playMedia.run();
     	System.out.println("Hello World");
    }

    @FXML
    void processSi(ActionEvent event) {
    	 MediaThread playMedia=new MediaThread("pianoSounds","Si.wav");
     	playMedia.run();
     	System.out.println("Hello World");
    }

    @FXML
    void processSol(ActionEvent event) {
    	 MediaThread playMedia=new MediaThread("pianoSounds","Sol.wav");
     	playMedia.run();
     	System.out.println("Hello World");
     	
    }

    @FXML
    void processSound1(ActionEvent event) {
    	 MediaThread playMedia=new MediaThread("drumSounds","crash.mp3");
     	playMedia.run();
     	System.out.println("Hello World");
    	
    }

    @FXML
    void processSound2(ActionEvent event) {
    	 MediaThread playMedia=new MediaThread("drumSounds","tom-1.mp3");
      	playMedia.run();
      	System.out.println("Hello World");
    	
    }

    @FXML
    void processSound3(ActionEvent event) {
    	 MediaThread playMedia=new MediaThread("drumSounds","tom-2.mp3");
      	playMedia.run();
      	System.out.println("Hello World");
    	
    }

    @FXML
    void processSound4(ActionEvent event) {
    	 MediaThread playMedia=new MediaThread("drumSounds","tom-3.mp3");
      	playMedia.run();
      	System.out.println("Hello World");
    	
    
    }

    @FXML
    void processSound5(ActionEvent event) {
    	 MediaThread playMedia=new MediaThread("drumSounds","tom-4.mp3");
      	playMedia.run();
      	System.out.println("Hello World");
    	
    }

    @FXML
    void processSound6(ActionEvent event) {
    	 MediaThread playMedia=new MediaThread("drumSounds","kick-bass.mp3");
      	playMedia.run();
      	System.out.println("Hello World");
    	
    }

    @FXML
    void processSound7(ActionEvent event) {
    	 MediaThread playMedia=new MediaThread("drumSounds","snare.mp3");
      	playMedia.run();
      	System.out.println("Hello World");
    
    }
    @FXML
    void processTv(MouseEvent event) {
    	SingleSelectionModel<Tab> selectedTab=tabPane.getSelectionModel();
TreeItem<String>selectedItem=tvInstruments.getSelectionModel().getSelectedItem();
if(event.getClickCount()==2) {
	if(selectedItem.getValue()=="Piano") {
		selectedTab.select(0);
	}
	else if(selectedItem.getValue()=="Drum") {
		selectedTab.select(1);
	}
}


    }

	@SuppressWarnings("unchecked")
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TreeItem<String> instruments=new TreeItem<>("Instruments",new ImageView(instrument));
		
		TreeItem<String> drum=new TreeItem<>("Drum",new ImageView(Drum));
		TreeItem<String> piano=new TreeItem<>("Piano",new ImageView(Piano));
		instruments.getChildren().addAll(piano,drum);
		tvInstruments.setRoot(instruments);
		
		System.out.println("Hello World");
		
	}

}
