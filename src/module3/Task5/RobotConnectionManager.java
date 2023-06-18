package module3.Task5;

public interface RobotConnectionManager {
    RobotConnection getConnection();
    //Метод getConnection() делает попытку соединиться с роботом и
    // возвращает установленное соединение, через которое можно отдавать роботу команды.
//    Установка соединения может завершиться неуспешно, а также уже установленное соединение
//    может внезапно разорваться. Всякое бывает. Поэтому любой метод RobotConnectionManager и
//    RobotConnection может бросить непроверяемое исключение RobotConnectionException
}
