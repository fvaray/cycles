//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("i = " + i);
        }

        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i+=2) {
            System.out.println("i = " + i);
        }

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("i = " + i);
        }

        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i+=4) {
            System.out.printf("Год %d является високосным \n", i);
        }

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i+=7) {
            System.out.printf(i + " ");
        }

        System.out.println("Задача 7");
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.printf(i + " ");
        }

        System.out.println("Задача 8");
        int amountSavings = 0;
        for (int i = 1; i <= 12; i++) {
            amountSavings += 29000;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей \n",i,amountSavings);
        }

        System.out.println("Задача 9");
        float amountSavingsProc = 0;
        for (int i = 1; i <= 12; i++) {
            amountSavingsProc += 29000f;
            amountSavingsProc = amountSavingsProc + amountSavingsProc * 0.01f;
            System.out.printf("Месяц %d, сумма накоплений равна %.1f рублей \n",i,amountSavingsProc);
        }

        System.out.println("Задача 10");
        int mul = 0;
        for (int i = 1; i <= 10; i++) {
            mul = 2*i;
            System.out.printf("2*%d=%d\n", i,mul);
        }
    }
}