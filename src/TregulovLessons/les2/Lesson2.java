package TregulovLessons.les2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Методы stream не меняют саму коллекцию или массив, от которой были созданы
public class Lesson2 {
    public static void main(String[] args) {
//Создадим 5 студентов и поместим их в ArrayList
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

//Давай сделаем имена только заглавными буквами, потом отфильтруем по полу, и отсортируем по возрасту
        Student first = students.stream().map(e ->
                {e.setName(e.getName().toUpperCase()); return e;}) //делаем все имена капсом
                .filter(e->e.getSex()=='f') //фильтруем по полу
                .sorted((x,y) -> x.getAge() - y.getAge()) // сортируем по возрасту
                .findFirst().get();
        System.out.println(first);
//        students = students.stream().sorted((x,y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
//        System.out.println(students);
////Отфильтруем студентов и отсавим только тех, чей возраст > 22 лет и средняя оценка меньше 7.2
//// filter вурнет только тех студентов, которые подходят под условия
//       students = students.stream().filter(element
//                -> element.getAge()>22 && element.getAvgGrade()<7.2).collect(Collectors.toList());
//        System.out.println(students);
//        //Мы можем создать стрим с 0, не используя мамссив или коллекци.:
//        Stream<Student> myStream = Stream.of(st1, st2, st3,st4, st5);
//        myStream.filter(element-> element.getAge()>22 && element.getAvgGrade()<7.2).collect(Collectors.toList());
    }
}

//Создадим стандартный класс студентов
class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
        this.setCourse(course);
        this.setAvgGrade(avgGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
