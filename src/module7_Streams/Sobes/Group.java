package module7_Streams.Sobes;

public class Group {
    private String name;
    private String description;

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }


    public Group(String name, String discription) {
        this.name = name;
        this.description = discription;
    }
}
