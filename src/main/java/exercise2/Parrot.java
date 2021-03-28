package exercise2;

import java.util.ArrayList;
import java.util.List;

public final class Parrot extends Bird {

    private final List<String> colors = List.of("Green", "Yellow", "Red", "Blue");

    public Parrot(String type) {
        super(type);
    }

    public List<String> getColors() {
        return new ArrayList<>(colors);
    }

    @Override
    public String makeNoise() {
        return "parrot noise";
    }
}
