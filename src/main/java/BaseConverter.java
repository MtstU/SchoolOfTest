import java.io.IOException;
import java.util.Scanner;

/**
 * Конвертация градусов Цельсия в Кельвины и Фаренгейты
 */
public class BaseConverter {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = 0.0;

        try {
            String userInput = input.nextLine();
            if (userInput.isEmpty()) {
                throw new Exception("Введите значение температуры.");
            }
            String s = null;
            if (userInput.contains(",")) {
                s = userInput.replace(",", ".");
                celsius = Double.parseDouble(s);
            } else {
                celsius = Double.parseDouble(userInput);
            }
        } catch (Exception e) {
        }

        System.out.print("В какие градусы конвертировать?" + System.lineSeparator() + "Фаренгейт, введите 1 " + System.lineSeparator() + "Кельвин, введите 2 " + System.lineSeparator() + "Для выхода нажмите 0 :");

        while (input.hasNext()) {
            int answer = input.nextInt();
            if (answer == 1) {
                double fahrenheit = celsius * 9 / 5 + 32;
                System.out.println("Температура в градусах Фаренгейта: " + fahrenheit);
            } else if (answer == 2) {
                double kelvin = celsius + 273.15;
                System.out.println("Температура в градусах Кельвина: " + kelvin);
            } else if (answer == 0) break;
        }
    }
}