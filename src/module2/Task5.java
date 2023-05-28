package module2;

public class Task5 {
    public static void main(String[] args) {
        String[] dayName = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Это выходной день? "+ isWeekend("Sunday"));
        System.out.println("Количество выходных дней равно " + weekendCount(dayName));
        System.out.println("Количество рабочих дней равно " + weekdayCount(dayName));
    }

    public static boolean isWeekend(String dayName) {
        boolean result = false;
        if (dayName.equals("Sunday") || dayName.equals("Saturday")) {
            result = true;
        }
        return result;
    }

    public static int weekendCount(String[] days) {
        int count = 0;
        for (String s : days) {
            if (isWeekend(s)) {
                count++;
            }
        }
        return count;
    }

    public static int weekdayCount(String[] days) {
        int count = 0;
        for (String s : days) {
            if (!isWeekend(s)) {
                count++;
            }
        }
        return count;
    }
}
