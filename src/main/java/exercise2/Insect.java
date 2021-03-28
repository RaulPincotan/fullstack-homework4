package exercise2;

public non-sealed interface Insect extends Animal {
    boolean isFlying();
}

record LadyBug(String color) implements Insect {
    @Override
    public String makeNoise() {
        return "Lady bug noise";
    }

    @Override
    public boolean isFlying() {
        return false;
    }

    @Override
    public String toString() {
        return "LadyBug{" +
                "color='" + color + '\'' +
                '}';
    }
}

class Fly implements Insect {

    @Override
    public String makeNoise() {
        return "Fly annoying noise buzz buzz";
    }

    @Override
    public boolean isFlying() {
        return true;
    }

    @Override
    public String toString() {
        return "classic fly";
    }
}