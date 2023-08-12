package module7_Streams.Sobes;

import javax.swing.*;
import java.util.List;

public class User {

    private String userName;
    private Integer age;
    private List<Group> groups;

    public List<Group> getGroups() {
        return groups;
    }

    public User(String userName, Integer age, List<Group> groups) {
        this.userName = userName;
        this.age = age;
        this.groups = groups;
    }
    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", groups=" + groups +
                '}';
    }
}
