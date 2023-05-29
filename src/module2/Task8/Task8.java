package module2.Task8;

public class Task8 {
    public static void main(String[] args) {
        JavaStudent js = new JavaStudent();
        Student st = new Student();
        st.study();
        js.study();
    }

    public static class Student {
        protected final String studying;

        protected Student(String work) {
            this.studying = work;
        }

        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }

        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }

    public static class JavaStudent extends Student {
        public JavaStudent() {
            super("Прохожу курсы по Java");
        }
    }
}
