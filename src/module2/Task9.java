package module2;

public class Task9 {
    public static void main(String[] args) {
        LazyStudent ls = new LazyStudent();
        ls.study();
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

    public static class LazyStudent extends Student {
        String studying;
        public LazyStudent() {
            studying = "мне лень.";
        }

        @Override
        public void study() {
            System.out.println("Сегодня не учусь, " + studying);
        }
    }
}
