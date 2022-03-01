package input;

import domain.Animal;
import domain.ZooManager;
import marketing.AnimalMarketing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Norbert on 2017-09-02.
 */
public class AnimalFileLoader  {


    public void load(ZooManager zooManager) {
        String fileToLoad = "D:\\temp\\fileexamples\\animals.txt";
        String line = "";
        List<Animal> list = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileToLoad))) {

            while ((line = br.readLine()) != null) {

                String[] loader = line.split(",");

                String name = loader[0];
                String type = loader[1];
                String age = loader[2];



                Animal animal = zooManager.addAnimal(name, type, Integer.parseInt(age));
                list.add(animal);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
