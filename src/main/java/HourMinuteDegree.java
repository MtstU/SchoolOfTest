import java.util.Scanner;

/**
 * Рассчитать угол между часосвой и минутной стрелками.
 */
public class HourMinuteDegree {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Введите время (в формате чч:мм): ");
    String time = scanner.nextLine();

    int hours = Integer.parseInt(time.split(":")[0]);
    int minutes = Integer.parseInt(time.split(":")[1]);

    double minuteAngle = (minutes * 6); // каждая минута - 6 градусов
    double hourAngle = (hours % 12 * 30) + (minutes * 0.5); // каждый час - 30 градусов, каждая минута - 0.5 градуса
    double angle = Math.abs(hourAngle - minuteAngle);

        System.out.println("Угол между минутной и секундной стрелкой равен: " + angle + " градусов");
    }
}

