/**
 * Программа должна найти и вывести повторяющийся символ в слове "Hello"
 */
public class Repeateable {
    public static void main(String[] args) {

        String string = "Hello";
        char[] charArray = string.toCharArray();

        System.out.println("Повторяющиеся символы:");
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (charArray[i] == charArray[j]) {
                    System.out.println(charArray[j] + " ");
                    break;
                }
            }
        }
    }
}
