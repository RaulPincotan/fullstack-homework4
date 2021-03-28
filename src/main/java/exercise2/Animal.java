package exercise2;

sealed public interface Animal permits Dog, Cat, Bird, Insect {
    public String makeNoise();
}
