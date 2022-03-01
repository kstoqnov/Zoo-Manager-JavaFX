package marketing;

import domain.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Marketing {

    private List<AnimalMarketing> marketing;


    public Marketing(List<AnimalMarketing> marketing) {
        this.marketing = marketing;
    }

    public void printMarketingInfo() {
        for (AnimalMarketing animal : marketing) {
            System.out.println(animal.getMarketingInfo());
        }

    }

    public void printMarketingTypesInfo(Set<String> setOfTypes) {
        Iterator<String> iterator = setOfTypes.iterator();
        while (iterator.hasNext()) {
            String animalType = iterator.next();
            System.out.println(animalType);
        }
    }
}


