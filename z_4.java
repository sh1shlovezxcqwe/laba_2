import java.util.Scanner;
import static java.lang.Math.*;

public class z_4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("\u001B[35m" + "Введите переменную x: ");
        double x = in.nextDouble(), y;
        if (x <= -4) {
            y = Math.log(Math.abs(10 * x));
        }else if (x > -4 & x < 2) {
            y = Math.log10(Math.abs(x - 2 * Math.pow(x, 2)));
        }
        else if (x > 2) {
            y = (Math.pow(Math.cos(x), Math.sin(x))) / (Math.pow(Math.pow(x, 2), 0.2));
        }
        else y=sqrt(2);
        System.out.println("\u001B[35m" + "y = " + y);
    }
}