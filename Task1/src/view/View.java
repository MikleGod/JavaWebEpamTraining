package view;

import java.util.Scanner;

public class View {

    private static Scanner scanner = new Scanner(System.in);

    public static void print(Object o) {
        if (o != null)
            System.out.println(o);
    }

    public static String readString() {
        return scanner.nextLine();
    }

    public static double readDouble() {
        return scanner.nextDouble();
    }
}
