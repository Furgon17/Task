package module3.Task4;

public class Task4 {
    public static void main(String[] args) {
        try(Car car = new Car()){
            Car.drive();
        } catch (RuntimeException e){ //Машина закрывается выводится после машинаа поехала, т.к зыкрывается поток
            //игнорируем
        }
    }

    static class Car implements AutoCloseable{ //Ресурсы должны реализовывать интерфейс Autocloseable, в котором есть метод close()
        @Override
        public void close(){
            System.out.println("Машина закрываается...");;
        }
        public static void drive(){
            System.out.println("Машина поехала.");;
        }
    }
}
