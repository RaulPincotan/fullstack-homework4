package exercise1;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SchoolService {
    private final List<Student> students = new ArrayList<>();
    public Map<Predicate<Student>, Function<List<Student>, String>> mapStudentsToGrade;

    public SchoolService(Collection<Student> students) {
        if (students != null) {
            this.students.addAll(students);
        }
    }

    public String getNamesAndAverageGrade() {
        double average = students.stream()
                .collect(Collectors.teeing(
                        Collectors.summingDouble(student -> student.grade()),
                        Collectors.counting(),
                        (sum, count) -> sum / count
                ));
        return "Student with names " + getStudentsName() + " have an average grade of " + average;
    }

    private List<String> getStudentsName() {
        return students.stream()
                .map(student -> student.name())
                .collect(Collectors.toList());
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public List<String> textBlockCoursesList() {
        String math = """
                {
                'course':%s,
                'semester':%d
                }
                """.formatted("Math course", 2);
        String algorithmic = """
                {
                'course':%s,
                'semester':%d
                }
                """.formatted("Algorithmic course", 1);
        String science = """
                {
                'course':%s,
                'semester':%d
                }
                """.formatted("Science course", 2);

        return List.of(math, algorithmic, science);
    }


    public String allocateCounrse(Student student) {
        Random random = new Random();
        int choice = random.nextInt(textBlockCoursesList().size());
        return "Student with name " + student.name() + " has been allocated to " + textBlockCoursesList().get(choice);
    }


    public void mapStudentsToGrade() {
        mapStudentsToGrade.put(student -> sortByGrade().indexOf(student) < 3, student -> "For the first 3 students: 1st grade");
        mapStudentsToGrade.put(student -> sortByGrade().indexOf(student) == 3, student -> "For the 4th student: 5th grade");
        mapStudentsToGrade.put(student -> sortByGrade().indexOf(student) > 3, student -> "For everyone else: 7th grade");
    }

//    public String dispatch(Student student) {
//        return mapStudentsToGrade.entrySet().stream()
//                .filter(entry -> entry.getKey().test(student))
//                .map(entry -> entry.getValue().apply(student))
//                .collect(Collectors.joining(System.lineSeparator()));
//    }

    private List<Student> sortByGrade() {
        return students.stream()
                .sorted(Comparator.comparing(Student::grade).reversed())
                .collect(Collectors.toList());
    }
}
