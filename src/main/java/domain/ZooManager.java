package domain;


import care.AnimalCare;
import marketing.AnimalMarketing;

import java.util.*;

public class ZooManager {

    private final Set<String> setOfTypes;
    private List<AnimalMarketing> animalMarketingList;
    private List<AnimalCare> animalCareList;
    private Map<String, AnimalCare> animalName_To_AnimalCare;


    public ZooManager() {
        animalMarketingList = new LinkedList<>();
        animalCareList = new LinkedList<>();
        setOfTypes = new HashSet<String>();
        animalName_To_AnimalCare = new HashMap<>();

    }

    public Animal addAnimal(String name, String type, int age) {

        Animal newAnimal = new Animal(name, type, age);
        animalMarketingList.add(newAnimal);
        setOfTypes.add(type);
        animalCareList.add(newAnimal);
        animalName_To_AnimalCare.put(name, newAnimal);

        return newAnimal;
    }


    public List<AnimalCare> getAnimalCareList() {
        return animalCareList;
    }

    public List<AnimalMarketing> getAnimalMarketingList() {
        return animalMarketingList;
    }

    public Map<String, AnimalCare> getAnimalName_To_AnimalCare() {
        return animalName_To_AnimalCare;
    }

    public Set<String> getSetOfTypes() {
        return setOfTypes;
    }
}

