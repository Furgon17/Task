package module3.Task1;
//https://www.youtube.com/watch?v=KLAf5EEdZ-s&t=132s&ab_channel=Followthewhiterabbit
class MyNewException extends Exception{ // При создании своего исключения необходимо наследоваться от Exeption
    //Далее необходимо определить конструкторы класса Exeption
    public MyNewException(String message) {
        super(message);
    }
}
