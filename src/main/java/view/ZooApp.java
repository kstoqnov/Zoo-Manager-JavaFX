package view;

import care.AnimalCare;
import care.Care;
import domain.ZooManager;
import input.AnimalFileLoader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.List;

/**
 * Created by Norbert on 2017-09-02.
 */
public class ZooApp extends Application {
    public static Care care;


    public static void main(String[] args) {
        ZooManager zooManager = new ZooManager();
        AnimalFileLoader fileLoader = new AnimalFileLoader();
        fileLoader.load(zooManager);

        List<AnimalCare> animalCareList = zooManager.getAnimalCareList();
        care = new Care(animalCareList, zooManager.getAnimalName_To_AnimalCare());


        Application.launch();

    }


    public void start(Stage primaryStage) throws Exception {
        Parent sceneGraph = createSceneGraph();
        Scene scene = new Scene(sceneGraph);
        primaryStage.setTitle("Animal Care Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Parent createSceneGraph() throws IOException {
        return FXMLLoader.load(getClass().getResource("/scene.fxml"));
    }


}

