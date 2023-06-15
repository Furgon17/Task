package module3.Task3;

public class Worker implements BankWorker {
    public boolean checkClientForCredit(BankClient bankClient) throws ProblemWithLawException, BadCreditHistoryException {
        System.out.println("Проверяем кредитную историю клиента " + bankClient.getName());
        if (bankClient.getHistory().equals("Я часто забываю про платежи...")) {
            throw new BadCreditHistoryException("У этого клиента плохая кредитная исторя");
        }
        if (bankClient.getLaw().equals("Я преступник...")) {
            throw new ProblemWithLawException("У этого клиента проблемы с законом!");
        }
        return true;
    }
}
