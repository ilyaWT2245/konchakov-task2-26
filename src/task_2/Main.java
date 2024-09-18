package task_2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во мальчиков: ");
        int n = scanner.nextInt();
        System.out.print("Введите кол-во девочек: ");
        int m = scanner.nextInt();

        System.out.print("Максимальное количество команд - " + countMaxTeams(n, m));
    }

    public static int countMaxTeams(int boys, int girls){
        // ввожу новую переменную, в которой будет содержаться максимальное возможное количество команд
        // ((мальчики + девочки) / 3) с округлением в меньшую сторону
        int teams = (boys + girls) / 3;
        int[] array = {boys, girls, teams};
        return Arrays.stream(array).min().getAsInt();
    }
}