//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача 1");
        }
        int money = 15000;
        int total = 0;
        int i=0;
        while(total<2_459_000) {
            total = total + total/100;
            total = total + money;
            i=i+1;
            System.out.println("Месяц"+i+"="+total);
        }
    }
}