package exercise1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public record Student(String name, LocalDate birthDate, int grade) {

    public Student(int age) {
        this("Raul", LocalDate.of(LocalDate.now().getYear(), new Random().nextInt(12) + 1, new Random().nextInt(31) + 1), 7);
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
