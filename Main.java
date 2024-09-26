import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("byte, розмір: " + Byte.BYTES + " байт, мінімум: " + Byte.MIN_VALUE + ", максимум: " + Byte.MAX_VALUE);
        System.out.println("short, розмір: " + Short.BYTES + " байт, мінімум: " + Short.MIN_VALUE + ", максимум: " + Short.MAX_VALUE);
        System.out.println("int, розмір: " + Integer.BYTES + " байт, мінімум: " + Integer.MIN_VALUE + ", максимум: " + Integer.MAX_VALUE);
        System.out.println("long, розмір: " + Long.BYTES + " байт, мінімум: " + Long.MIN_VALUE + ", максимум: " + Long.MAX_VALUE);
        System.out.println("float, розмір: " + Float.BYTES + " байт, мінімум: " + Float.MIN_VALUE + ", максимум: " + Float.MAX_VALUE);
        System.out.println("double, розмір: " + Double.BYTES + " байт, мінімум: " + Double.MIN_VALUE + ", максимум: " + Double.MAX_VALUE);
        System.out.println("char, розмір: " + Character.BYTES + " байт, мінімум: " + (int) Character.MIN_VALUE + ", максимум: " + (int) Character.MAX_VALUE);
        System.out.println("boolean, розмір: невизначений, мінімум: false, максимум: true");

        Scanner scanner = new Scanner(System.in);

        System.out.print("введіть ціле число(int): ");
        String intInput = scanner.nextLine();
        int intValue = Integer.parseInt(intInput);
        System.out.println("int: " + intValue);

        System.out.print("введіть число з плаваючою точкою (double): ");
        String doubleInput = scanner.nextLine();
        double doubleValue = Double.parseDouble(doubleInput);
        System.out.println("double: " + doubleValue);

        System.out.print("введіть логічне значення (boolean): ");
        String booleanInput = scanner.nextLine();
        boolean booleanValue = Boolean.parseBoolean(booleanInput);
        System.out.println("boolean: " + booleanValue);
    }
}