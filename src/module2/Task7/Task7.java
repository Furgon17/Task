package module2.Task7;

import module2.Task7.Home.Human;

public class Task7 extends Human{
//    Конструктор Task7 вызывает конструктор родительского класса с теми же параметрами, используя ключевое слово super
    public Task7(String secret, String news, String experience, String gossip) {
        super(secret, news, experience, gossip);
    }

    public static void main(String[] args) {
        Human h = new Human("secret", "news", "experience", "gossip");
        Task7 t = new Task7("secret", "news", "experience", "gossip");
        System.out.println(h.getNews() + ", " + t.getExperience()); //secret и gossip тут недоступны,
        // т.к. имеют приватный и дефолтный модификаторы доступа
    }
}
