package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.io.Serializable;

public class NoteStage extends Stage implements Serializable {

    public NoteStage() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/mainView.fxml"));
        root.getStylesheets().add(getClass().getResource("../resources/style.css").toExternalForm());
        this.setTitle("NoteIt");
        this.initStyle(StageStyle.DECORATED);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        Scene scene = new Scene(root);
        this.setScene(scene);
        this.show();
    }
}
