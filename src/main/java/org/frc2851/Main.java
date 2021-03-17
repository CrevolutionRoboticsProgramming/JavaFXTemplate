package org.frc2851;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application
{
    @FXML
    Pane mRoot;
    @FXML
    Button mButton;

    @FXML
    private void initialize()
    {
        mButton.setOnAction(e ->
                System.out.println("Button pressed"));
    }

    @Override
    public void start(Stage stage)
    {
        stage.setOnCloseRequest(e ->
                System.exit(0));

        Scene scene = null;

        try
        {
            scene = new Scene(FXMLLoader.load(getClass().getResource("JavaFXTemplate.fxml")));
        } catch (IOException e)
        {
            e.printStackTrace();
            System.exit(-1);
        }

        stage.setTitle("JavaFXTemplate");
        stage.setScene(scene);
        stage.show();
    }
}