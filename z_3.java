import java.util.Scanner;
import java.lang.Math;

public class z_3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите переменную x в диапазоне [-3 ; 3] с шагом 0,5: ");
        double x = in.nextDouble(), f;
        if (x >= -3 & x <= 3){
            if (x >= 0)
                f = Math.sin(2*Math.PI*x);
            else
                f  = 3*Math.PI*x - Math.cos(2*Math.PI*x);
            System.out.print("f =" + f);
        }else
            System.out.print("\u001B[31m" + "!!! Вы ввели данные не из диапазона [-3 ; 3] !!!");
    }
}