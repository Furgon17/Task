package TregulovLessons.Les8_flatMap;

import java.util.ArrayList;
import java.util.List;

public class Lesson8 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");
        f1.addStudentsOnFaculty(st1);
        f1.addStudentsOnFaculty(st2);
        f1.addStudentsOnFaculty(st3);
        f2.addStudentsOnFaculty(st4);
        f2.addStudentsOnFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);
        facultyList.stream().flatMap(f -> f.getStudentsOnFaculty().stream()).forEach(e-> System.out.println(e.getName()));
    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    //Метод для добавления студентов на факультет
    public void addStudentsOnFaculty(Student student) {
        studentsOnFaculty.add(student);
    }
}
