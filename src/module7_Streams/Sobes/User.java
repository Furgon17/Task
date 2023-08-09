package module7_Streams.Sobes;

import javax.swing.*;
import java.util.List;

public class User {
    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", groups=" + groups +
                '}';
    }

    private String userName;
    private Integer age;
    private List<Group> groups;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public User(String userName, Integer age, List<Group> groups) {
        this.userName = userName;
        this.age = age;
        this.groups = groups;
    }
}
