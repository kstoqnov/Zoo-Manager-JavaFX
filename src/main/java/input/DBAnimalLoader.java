package input;

import domain.Animal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class DBAnimalLoader implements AnimalLoader {

    @Override
    public List<Animal> load() {

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Andrzej", "Horse", 5));
        animalList.add(new Animal("Daniel", "Crocodile", 1));
        animalList.add(new Animal("Gosia", "Llama", 2));

        return animalList;
    }
}
