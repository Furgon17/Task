package module3.Task3;

public class BankClient {
    private String name;
    private String history;
    private String law;

    public BankClient(String name, String history, String law) {
        this.name = name;
        this.history = history;
        this.law = law;
    }

    public String getHistory() {
        return history;
    }

    public String getLaw() {
        return law;
    }

    public String getName() {
        return name;
    }

    public boolean getCreditForClient(BankWorker worker, BankClient client) {
        try {
            if (worker.checkClientForCredit(client)) {
                System.out.println("Ваш кредит одобрен!");
                return true;
            }
        } catch (BadCreditHistoryException ex) {
            System.out.println("Проблемы с банковской историей");
        //    throw new BadCreditHistoryException(ex); Почему нельзя так сделать?!!!!!!!!!!!!!!!!!!!!!
        } catch (ProblemWithLawException e) {
            // Ничего не делаем, не нужно выводить сообщение
            System.out.println("Проблемы с законом.");
        }
        System.out.println("Кредит не одобрен.");
        return false;
    }
}
