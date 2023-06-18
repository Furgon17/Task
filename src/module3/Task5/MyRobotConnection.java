package module3.Task5;

public class MyRobotConnection implements RobotConnection{
    private String host;
    private int port;
    private boolean isConnected;

    public MyRobotConnection(String host, int port) {
        this.host = host;
        this.port = port;
        this.isConnected = false;
    }

    public void connect() throws RobotConnectionException {
        // логика подключения к удаленному серверу или устройству
        // при неудачном подключении выбрасывается исключение RobotConnectionException
        isConnected = true;
    }

    @Override
    public void disconnect() {
        // логика отключения от удаленного сервера или устройства
        isConnected = false;
    }

    @Override
    public void sendCommand(String command) throws RobotConnectionException {
        if (!isConnected) {
            throw new RobotConnectionException("Connection is not established");
        }
        // логика отправки команды на удаленный сервер или устройство
    }

    @Override
    public String receiveResponse() throws RobotConnectionException {
        if (!isConnected) {
            throw new RobotConnectionException("Connection is not established");
        }
        // логика получения ответа от удаленного сервера или устройства
        return null;
    }
}
}
