import care.AnimalCare;
import care.Care;
import domain.Animal;
import domain.ZooManager;
import input.AnimalFileLoader;
import input.AnimalLoader;
import input.FileAnimalLoader;
import marketing.AnimalMarketing;
import marketing.Marketing;

import java.util.*;

public class Run {


    public static void main(String[] args) {

        //FileAnimalLoader loader2 = new FileAnimalLoader();

       // List<Animal> animalList = new ArrayList<>();

        ZooManager zooManager = new ZooManager();
        AnimalFileLoader fileLoader = new AnimalFileLoader();

        fileLoader.load(zooManager);



//        zooManager.addAnimal("Burek", "Tiger", 12);
//        zooManager.addAnimal("Tajger", "Tiger", 122);
//        zooManager.addAnimal("Adolf", "Monkey", 3);



        printMarketinginfo(zooManager);
        printCareInfo(zooManager);




        //wyswietlic anuimalTabel

        // myAnimals(animalT2);

    }

    private static void printCareInfo(ZooManager zooManager) {
        System.out.println("Care info:");
        List<AnimalCare> animalCareList = zooManager.getAnimalCareList();
        Care care = new Care(animalCareList,zooManager.getAnimalName_To_AnimalCare());
        care.printCareInfoForAnimal();
    }

    private static void printMarketinginfo(ZooManager zooManager) {
        System.out.println("Marketing info:");
        List<AnimalMarketing> animalListMarketing = zooManager.getAnimalMarketingList();
        Marketing marketing = new Marketing(animalListMarketing);
        marketing.printMarketingTypesInfo(zooManager.getSetOfTypes());
    }

    private static void showAnimal(Animal animal) {

        String animalName = animal.getName();
        String animalType = animal.getType();
        System.out.println(animalName + " " + animalType);

    }

    private static void myAnimals(List<Animal> allAnimals) {
        for (int i = 0; i < allAnimals.size(); i++) {
            showAnimal(allAnimals.get(i));
        }
    }


}
