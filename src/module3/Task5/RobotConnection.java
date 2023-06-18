package module3.Task5;

public interface RobotConnection extends AutoCloseable{
    void moveRobotTo(int x, int y);
    @Override
    void close();
}
