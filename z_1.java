import java.util.Scanner;

public class z_1 {
    public static void main(String[] args) {
        System.out.print("Введите 10 чисел: ");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        boolean[] foundPairs = new boolean[10];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.printf("%d и %d являются парой дубликатов%n", numbers[i], numbers[j]);
                    foundPairs[i] = true;
                    foundPairs[j] = true;
                }
            }
        }
            }
        }