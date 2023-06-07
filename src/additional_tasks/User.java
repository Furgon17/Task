package additional_tasks;

import java.util.Objects;

public class User {
    public static void main(String[] args) {
        User user1 = new User(1,"Bob", 54686);
        User user2 = new User(1,"Bob", 54686);
        System.out.println("Сравнение через equals: " + user1.equals(user2));
        System.out.println("Сравниение hashcod'oв: " + user1.hashCode() + " " + user2.hashCode()
                + " " + (user1.hashCode() == user2.hashCode()));
        System.out.println("Сравнение через == : " + (user1 == user2));
    }

    private int id;
    private String name;
    private int phone;

    public User(int id, String name, int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Сравниваем ссылки, если ссылка одна и та же, то объекты равны.
        if (!(o instanceof User user)) return false; // Если сравниваемый объект не принадлежит классу User, то false
        user = (User) o; // Приводим объект о типа Object к типу User и сохраняем его в переменную типа user
        // Если объект о не может быть приведен к типу User, то сработает исключение ClassCastException
        return (id == user.id && phone == user.phone && name.equals(user.name));
        // Если все 3 поля равны, то true
    }

    @Override
    public int hashCode() {
        int result = 31 * id + phone/(id+1) + name.hashCode();
        return result;
    }
}
