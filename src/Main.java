import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        double numb1 = in.nextInt();
        System.out.println("Введите мнимое число: ");
        double numb2i = in.nextInt();
        System.out.println("Введите символ: ");
        String char1 = in.next();
        System.out.println("Введите число: ");
        double numb3 = in.nextInt();
        System.out.println("Введите мнимое число: ");
        double numb4i = in.nextInt();

        in.close();

        Calculator calc2 = new Calculator();


        if (char1.equals("+")){
            System.out.println(calc2.sum( numb1,  numb2i,  numb3,  numb4i ));

        }

        if (char1.equals("-")){
            System.out.println(calc2.substraction( numb1,  numb2i,  numb3,  numb4i ));
        }

        if (char1.equals("*")){
            System.out.println(calc2.multiplication( numb1,  numb2i, numb3, numb4i ));
        }

        if (char1.equals("/")){
            System.out.println(calc2.dividing( numb1,  numb2i,  numb3,  numb4i ));

        }
    }
}