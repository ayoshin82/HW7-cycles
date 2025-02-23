import java.time.Year;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача 1");
        }
        int money = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + money;
            i = i + 1;
            System.out.println("Месяц" + i + "=" + total);
        }
        {
            System.out.println("Задача 2");
        }
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        {
            System.out.println();
            for (int d = 10; d > 0; d--) {
                System.out.print(d + " ");
            }
        }
        {
            System.out.println("Задача 3");
        }
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        int dif = born - death;
        for (int y = 1; y <= 10; y++) {
            population = population + population / 1000 * dif;
            {
                System.out.println("Год" + " " + y + " " + "Численность населения составляет" + " " + population);
            }
        }
        {
            System.out.println("Задача 4");
        }
        int m = 15000;
        int t = 0;
        int v = 0;
        while (t < 12_000_000) {
            t = t + t / 100*7;
            t = t + m;
            v = v + 1;
            System.out.println("Месяц" + v + "=" + t);
        }
    }
}




