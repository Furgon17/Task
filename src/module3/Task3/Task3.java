package module3.Task3;

public class Task3 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        BankClient clientGood = new BankClient("Миша", "У меня хорошая история", "Я соблюдая-ю законы");
        BankClient clientBad = new BankClient("Коля", "Я часто забываю про платежи...", "Я преступник...");
        clientGood.getCreditForClient(worker,clientGood);
        System.out.println();
        clientGood.getCreditForClient(worker,clientBad);
    }
}
