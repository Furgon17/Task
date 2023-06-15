package module3.Task3;

public interface BankWorker {
    public boolean checkClientForCredit(BankClient bankClient) throws ProblemWithLawException, BadCreditHistoryException;
}
