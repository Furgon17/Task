package module2.Task2;
public class Robot {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 0, 0);
        Robot.moveRobot(robot, 3, -7);
    }

    private static Direction direction;//создаю объект взгляда
    public Direction getDirection() {
        // геттер, для текущего направления взгляда
        return direction;
    }
    private int x; //начальная координата х
    private int y;// начальная координата у
    public int getX() {
        // геттер для х
        return x;
    }
    public int getY() {
        // геттер для у
        return y;
    }
    //конструктор класса Робот, для задания начального положения
    public Robot(Direction direction, int x, int y) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public static void turnLeft() {
        if (direction == Direction.LEFT) {
            direction = Direction.DOWN;
        } else if (direction == Direction.RIGHT) {
            direction = Direction.UP;
        } else if (direction == Direction.UP) {
            direction = Direction.LEFT;
        } else if (direction == Direction.DOWN) {
            direction = Direction.RIGHT;
        }
    }

    public static void turnRight() {
        if (direction == Direction.LEFT) {
            direction = Direction.UP;
        } else if (direction == Direction.RIGHT) {
            direction = Direction.DOWN;
        } else if (direction == Direction.UP) {
            direction = Direction.RIGHT;
        } else if (direction == Direction.DOWN) {
            direction = Direction.LEFT;
        }
    }

    public void stepForward() {
        // шаг в направлении взгляда
        if (direction == Direction.UP)  y++;
        if (direction == Direction.RIGHT) x++;
        if (direction == Direction.DOWN) y--;
        if (direction == Direction.LEFT) x--;
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        System.out.println("Начальное положение: \nвзгляд: " + direction.toString() + "; x:" + x + "; y: " + y);
        if (x <= toX) {
            while (direction != Direction.RIGHT) {
                turnLeft();
            }
            while (x != toX) {
                robot.stepForward();
                x++;
            }
        } else {
            while (direction != Direction.LEFT) {
                turnLeft();
            }
            while (x != toX) {
                robot.stepForward();
                x--;
            }
        }
        if (y <= toY) {
            while (direction != Direction.UP) {
                turnLeft();
            }
            while (y != toY) {
                robot.stepForward();
                y++;
            }
        } else {
            while (direction != Direction.DOWN) {
                turnLeft();
            }
            while (y != toY) {
                robot.stepForward();
                y--;
            }
        }
        System.out.println("Пришли в положение:\nвзгляд: " + direction.toString() + "; x:" + x + "; y: " + y);
    }
}