package input;

import care.AnimalCare;
import domain.Animal;
import marketing.AnimalMarketing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileAnimalLoader {


    public void load(Animal animal) {

        List<AnimalMarketing> animalListMarketing = new ArrayList<>();
        Iterator<AnimalMarketing> iterator = animalListMarketing.iterator();

        while (iterator.hasNext()) {
            AnimalMarketing animalMarketing = iterator.next();
            System.out.println(animal.getMarketingInfo());
        }

        List<AnimalCare> animalListCare = new ArrayList<>();
        Iterator<AnimalCare> iterator2 = animalListCare.iterator();

        while (iterator.hasNext()) {
            AnimalCare animalCare = iterator2.next();
            System.out.println(animal.getCareInfo());
        }


//        animalList.add(new Animal("Burek", "Tiger", 12));
//        animalList.add(new Animal("Adolf", "Monkey", 3));
//        animalList.add(new Animal("Adam", "Bird", 11));



    }
}
