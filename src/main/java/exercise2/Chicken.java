package exercise2;

import java.util.Objects;

public non-sealed class Chicken extends Bird {
    private final String color;

    public Chicken(String color, String type) {
        super(type);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chicken chicken = (Chicken) o;
        return Objects.equals(color, chicken.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String makeNoise() {
        return "Bird noise";
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "color='" + color + '\'' +
                '}';
    }
}
