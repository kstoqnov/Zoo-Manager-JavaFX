package view;

import care.AnimalCare;
import care.Care;
import domain.Animal;
import domain.ZooManager;
import input.AnimalFileLoader;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by Norbert on 2017-09-03.
 */
public class CareFrameController {


    @FXML
    private ListView<AnimalCare> animalListView;
    private Button infoButton;


    @FXML
    public void initialize() {

        List<AnimalCare> animalKey = ZooApp.care.getCare();
        ObservableList<AnimalCare> items = FXCollections.observableArrayList(animalKey);
        animalListView.setItems(items);

        animalListView.setCellFactory(new Callback<ListView<AnimalCare>, ListCell<AnimalCare>>() {

            @Override
            public ListCell<AnimalCare> call(ListView<AnimalCare> p) {

                ListCell<AnimalCare> cell = new ListCell<AnimalCare>() {

                    @Override
                    protected void updateItem(AnimalCare t, boolean bln) {
                        super.updateItem(t, bln);
                        if (t != null) {
                            setText(t.getCareOnlyName());
                        }
                    }

                };

                return cell;
            }
        });


    }


    public void addPressed(MouseEvent ev) {
        System.out.println("Add Button pressed.");
    }

    public void exitPressed(MouseEvent ex) {
        Platform.exit();
    }

    public void infoPressed(MouseEvent ev) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("NewWindow.fxml"));
        /*
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
            Stage stage = new Stage();
            Scene scene = new Scene((Parent) fxmlLoader.load(), 600, 400);
            stage.setTitle("New Window");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    };
    }




