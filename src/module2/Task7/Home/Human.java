package module2.Task7.Home;

public class Human {
    private final String secret; //секретики
    private final String news; //новости
    private final String experience; //опыт
    private final String gossip; //сплетни

    public Human(String secret, String news, String experience, String gossip) {
        this.secret = secret;
        this.news = news;
        this.experience = experience;
        this.gossip = gossip;
    }

    private String getSecret() { // доступ только в пределах класса
        return secret;
    }

    public String getNews() { // доступ для всех
        return news;
    }

    protected String getExperience() { // доступ разрешен только для классов наследников и текущего пакта
        return experience;
    }

    String getGossip() { //без модификатора доступа доступ только внутри пакета
        return gossip;
    }
}

