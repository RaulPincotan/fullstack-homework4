package exercise1;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student raul = new Student("Raul", LocalDate.of(1991, Month.JULY, 8), 7);
        Student adrian = new Student("Adrian", LocalDate.of(1991, Month.JANUARY, 8), 8);
        Student pincotan = new Student("Pincotan", LocalDate.of(1964, Month.MAY, 7), 10);
        Student vlad = new Student("Vlad", LocalDate.of(1989, Month.MAY, 7), 9);
        Student emil = new Student("Emil", LocalDate.of(1981, Month.OCTOBER, 3), 7);
        Student cristina = new Student("Cristina", LocalDate.of(1993, Month.OCTOBER, 15), 9);
        SchoolService service = new SchoolService(List.of(raul, adrian, pincotan, vlad, emil, cristina));
        System.out.println(raul.birthDate());
        System.out.println(raul.getAge());
        System.out.println(service.getNamesAndAverageGrade());
        System.out.println(service.allocateCounrse(raul));
        System.out.println(service.allocateCounrse(vlad));


    }
}
