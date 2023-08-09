package module7_Streams.Sobes;

public class Group {
    private String name;
    private String description;

    public String getDiscription() {
        return description;
    }

    public void setDiscription(String discription) {
        this.description = discription;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public Group(String name, String discription) {
        this.name = name;
        this.description = discription;
    }
}
