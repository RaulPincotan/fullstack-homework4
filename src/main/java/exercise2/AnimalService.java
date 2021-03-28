package exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalService {
    private final List<Animal> animals = new ArrayList<>();

    public AnimalService(List<Animal> animals) {
        if (animals != null) {
            this.animals.addAll(animals);
        }
    }


    public List<Animal> getAnimals() {
        return Collections.unmodifiableList(animals);
    }

    public void makeSound(Animal animal) {
        System.out.println("The specific noise of this animal is " + animal.makeNoise());
    }
}
