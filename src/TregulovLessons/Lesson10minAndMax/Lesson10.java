package TregulovLessons.Lesson10minAndMax;

import TregulovLessons.Les8_flatMap.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson10 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
////        найдём минимального студента
//        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
//        System.out.println(min);
////        найдем максимального студента
//        Student max = students.stream().max((x, y) -> x.getAge() - y.getAge()).get();
//        System.out.println(max);
// метод limit ограничивает кол-во эл-тов в стриме
//        students.stream().filter(e-> e.getAge()>20).limit(3).forEach(System.out::println);
// метод skip ограничивает кол-во эл-тов в стриме
//        students.stream().filter(e-> e.getAge()>20).skip(2).forEach(System.out::println);
        //Рассмотрим метод mapToInt, который возвращает интовый стрим (P.S. так же работает и для mapToDouble)
        List<Integer> courses = students.stream()
                .mapToInt(e->e.getCourse())// Верни курс каждого студента (они int)
                .boxed()// необходимо использовать для записи в лист, иначе Exeption!!!!!!!!!! Он конвентирует int в Integer
                .collect(Collectors.toList());
        System.out.println(courses);
        System.out.println("------------------------------");
        double avgCourses = students.stream().mapToInt(Student::getCourse).average().getAsDouble();
        System.out.println(avgCourses);
        int minGrade = students.stream().mapToInt(Student::getAge).min().getAsInt();
        System.out.println(minGrade);
    }
}
