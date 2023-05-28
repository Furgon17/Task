package module2;
public class Task1 {
    public static void main(String[] args) {
        Day d = Day.SUNDAY;
        System.out.println(d.getRusName());
        System.out.println("Это выходной? " + d.isWeekend());
    }
}

enum Day {
    MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"), SATURDAY("Суббота"), SUNDAY("Воскресенье");

    private String translate;
    Day(String translate) {
        this.translate = translate;
    }

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    public String getRusName() {
        return translate;
    }
}