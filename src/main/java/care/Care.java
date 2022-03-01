package care;

import java.util.List;
import java.util.Map;

public class Care {

    private List<AnimalCare> care;
    private Map<String, AnimalCare> animalName_To_AnimalCare;

    public Care(List<AnimalCare> care, Map<String, AnimalCare> animalName_To_AnimalCare) {
        this.care = care;
        this.animalName_To_AnimalCare = animalName_To_AnimalCare;
    }

    public List<AnimalCare> getCare() {
        return care;
    }

//    public void printCareInfo(List<AnimalCare> animalCareList) {
//        for (AnimalCare animal : care) {
//            System.out.println(animal.getCareInfo());
//        }
//    }

    public void printCareInfoForAnimal() {

        for (String key : animalName_To_AnimalCare.keySet()) {
        AnimalCare animalCare =animalName_To_AnimalCare.get(key);
            System.out.println("Key "+key + ": "+ animalCare.getCareInfo());
        }
    }


}

