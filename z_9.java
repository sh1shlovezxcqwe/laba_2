import java.util.Scanner;

public class z_9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("добро пожаловать в опросник !");

        System.out.print("\nУкажите свой возраст: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.print("\nОтлично! Вы совершеннолетний.");

            System.out.print("\nКакой предмет в университете вам нравится больше всего ?");
            System.out.print("\n1. Математика");
            System.out.print("\n2. Информтика");
            System.out.print("\n3. История");
            int subject = scanner.nextInt();

            switch (subject) {
                case 1:
                    System.out.print("\nМатематика - это класссно !");
                    break;
                case 2:
                    System.out.print("\nинформатика это преввосходно !");
                    break;
                case 3:
                    System.out.print("\nИстория - это очень интересно !");
                    break;
                default:
                    System.out.print("\nНекорректный выбор предмета.");
                    break;
            }
        } else {
            System.out.print("\nИзвините, опрос доступен только для совершеннолетних");

            System.out.print("\nСпасибо за участие в опросе !");
            scanner.close();
        }
        System.out.print("\nСколько часов ежедневно вы тратите на выполнение домашней работы ?");
        System.out.print("\n1. Менее 1 часа в день");
        System.out.print("\n2. От 2 до 3 часов в день");
        System.out.print("\n3. Более 3 часов в лень");
        int hours = scanner.nextInt();

        switch (hours){
            case 1:
                System.out.print("\nВам стоит уделять больше времени для обучения !");
                break;
            case 2:
                System.out.print("\nХорошее время ! Вы молодец, продолжайте в том же духе <3");
                break;
            case 3:
                System.out.print("\nОтлично ! Но не забывай отдхать !");
                break;
            default:
                System.out.print("\nНекоректный выбор количества чаасов.");
                break;
        }

        System.out.print("\nКакую программу вы предпочитаете для разработки ?");
        System.out.print("\n1. Java");
        System.out.print("\n2. Python");
        System.out.print("\n3. C++");
        int programminlanguage = scanner.nextInt();

        switch (programminlanguage) {
            case 1:
                System.out.print("\nОтличный выбор! Java мощный язык программирования!");
                break;
            case 2:
                System.out.print("\nPython - прекрасный выбор для написания кода!");
                break;
            case 3:
                System.out.print("\nC++ - Классический язык с большими возможностями!");
                break;
            default:
                System.out.print("\nНекорректный выбор языка программирования");
                break;
        }
        System.out.print("\nСпасибо за участие в опросе !");

        scanner.close();
        }
    }