package module5.Task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(Box.getBox().toString());
    }

    public static class Box<T> {
        public Box(T object){
            this.object = object;
        }
        private T object;
        public static <T> Box<T> getBox(){ // мы также указываем параметр типа <T> перед возвращаемым типом Box<T>.
            // Это необходимо, чтобы указать, что метод также является параметризованным.

            return new Box<>(null); //null, т.к. по условию необх вернуть пустой объект
        }

        @Override
        public String toString() {
            return "Box{" +
                    "object=" + object +
                    '}';
        }
    }
}

