import java.util.Scanner;
import java.lang.Math;

public class z_2{
    public static void main (String[] args){
        Scanner input  = new Scanner(System.in);

        System.out.print("Введиитее координаты центра первой окружности (x1, y1):");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Введите радиус первой окружности: ");
        double Radius1 = input.nextDouble();

        System.out.print("Введиитее координаты центра второй окружности (x2, y2):");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Введите рвдиус второй окружности: ");
        double Radius2 = input.nextDouble();

        // Вычисляем расстояние между центрами окружностей
        double Distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.print("Рассстояние между центрами окружностей" + " " + Distance);

        // Вычисляем минимальное расстояние как разность радиусов окружностей и расстояния между центрами
        double minDistance = Math.abs(Distance - (Radius1 + Radius2));
        System.out.print("\nМинимальное растояние между центрами окружности " + minDistance);

        // Вычисляем координату минимального расстояния
        double minX = x1 + (minDistance / Distance) * (x2 - x1);
        double minY = y1 + (minDistance / Distance) * (x2 - x1);
        System.out.println("\nКоордината минимального расстояния: (" + minX + ", " + minY + ")");

    }
}