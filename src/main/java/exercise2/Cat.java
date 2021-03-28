package exercise2;

public record Cat(String breed, int age, double height, double weigth) implements Animal {
    @Override
    public String makeNoise() {
        return "miau miau";
    }
}
