package exercise2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnimalService animalService = new AnimalService(List.of(
                new Canary("Canary1", "Yellow"),
                new Parrot("Domestic parrot"),
                new Dog("Husky ", 3, 45.4, 25.5),
                new Cat("Garfield ", 5, 29, 11),
                new Fly()
        ));

        System.out.println(animalService.getAnimals());
        animalService.makeSound(animalService.getAnimals().get(1));
        animalService.makeSound(animalService.getAnimals().get(0));
        animalService.makeSound(animalService.getAnimals().get(3));
    }
}
