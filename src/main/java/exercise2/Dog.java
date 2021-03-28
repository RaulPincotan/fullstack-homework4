package exercise2;

import java.util.Objects;

public final class Dog implements Animal {

    private final String breed;
    private final int age;
    private final double height;
    private final double weigth;

    public Dog(String breed, int age, double height, double weigth) {
        this.breed = breed;
        this.age = age;
        this.height = height;
        this.weigth = weigth;
    }

    @Override
    public String makeNoise() {
        return "ham ham";
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeigth() {
        return weigth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Double.compare(dog.height, height) == 0 && Double.compare(dog.weigth, weigth) == 0 && Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, age, height, weigth);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weigth=" + weigth +
                '}';
    }
}
