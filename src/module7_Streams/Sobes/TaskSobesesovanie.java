package module7_Streams.Sobes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskSobesesovanie {
    public static void main(String[] args) {
        Group group1 = new Group("Aria", "Солист Кипелов");
        Group group2 = new Group("Xex", "частушки");
        Group group3 = new Group("Xxxtantion", "американский реп");

        List<Group> groupList = new ArrayList<>();
        List<Group> groupList2 = new ArrayList<>();
        List<Group> groupList3 = new ArrayList<>();

        groupList.add(group1);
        groupList2.add(group2);
        groupList3.add(group3);

        User user1 = new User("Ivan", 28, groupList);
        User user2 = new User("Marat", 38, groupList2);
        User user3 = new User("Evgeniy", 36, groupList3);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        System.out.println(SomeConsumer.userList(users));

    }
}
