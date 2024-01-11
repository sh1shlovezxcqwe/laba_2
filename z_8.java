import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class z_8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\u001B[35m" + "Введите количество чисел после запятой (не более 8): ");
        int decimalPlaces = scanner.nextInt();

        BigDecimal sqrtValue = new BigDecimal(Math.sqrt(0.5));
        sqrtValue = sqrtValue.setScale(decimalPlaces, RoundingMode.HALF_UP);

        System.out.println("\u001B[35m" + "Квадратный корень из 0.5: " + sqrtValue);
    }
}