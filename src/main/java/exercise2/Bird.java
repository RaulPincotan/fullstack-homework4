package exercise2;

import java.util.Objects;

public abstract sealed class Bird implements Animal permits Canary, Parrot, Chicken {
    private final String type;

    public Bird(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return Objects.equals(type, bird.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "type='" + type + '\'' +
                '}';
    }
}


