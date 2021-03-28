package exercise2;

public final class Canary extends Bird {
    private final String color;

    public Canary(String type, String color) {
        super(type);
        this.color = color;
    }

    @Override
    public String makeNoise() {
        return "canary noise";
    }
}
