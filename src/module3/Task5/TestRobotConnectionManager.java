package module3.Task5;

public class TestRobotConnectionManager implements RobotConnectionManager{
    private int attempts;
    private int ping;

    public TestRobotConnectionManager(int ping) {
        this.attempts = 0;
        this.ping = ping;
    }

    @Override
    public RobotConnection getConnection() throws RobotConnectionException{
        attempts++;
        if(attempts > 3){
            throw new RobotConnectionException("Не удалось установить соединение");
        }
        TestRobotConnection connection = new TestRobotConnection();
        connection.connect(ping); //Помещаем либо true (<5) либо false(>5)
        return connection;
    }
}
