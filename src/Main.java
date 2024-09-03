import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        System.out.println("Задача 1");
        System.out.println("Объявите целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова");
        System.out.println("Первый способ");
        int[] arrays = new int[]{1, 2, 3};
        System.out.println("Второй способ");
        int[] arrays1 = new int[3];
        arrays1[0] = 1;
        arrays1[1] = 2;
        arrays1[2] = 3;
        System.out.println("Объявите массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.");
        double[] a = {1.57, 7.654, 9.986};
        System.out.println("Объявите произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.");
        boolean[] b = new boolean[3];
        b[0] = true;
        b[1] = true;
        System.out.println();


        System.out.println("Задача 2.");
        for (int i = 0; i < arrays1.length; i++) {
            if (i == 2) {
                System.out.println(arrays1[i]);
                continue;
            }
            System.out.print(arrays1[i] + ",");
        }
        for (int i = 0; i < a.length; i++) {
            if (i == 2) {
                System.out.println(a[i]);
                continue;
            }
            System.out.print(a[i] + ",");
        }
        for (int i = 0; i < b.length; i++) {
            if (i == 2) {
                System.out.println(b[i]);
                continue;
            }
            System.out.print(b[i] + ",");
        }
        System.out.println();


        System.out.println("Задача 3.");
        for (int i = arrays1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrays1[i]);
                continue;
            }
            System.out.print(arrays1[i] + ",");
        }
        System.out.println();
        for (int i = a.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(a[i]);
                continue;
            }
            System.out.print(a[i] + ",");
        }
        System.out.println();
        for (int i = b.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(b[i]);
                continue;
            }
            System.out.print(b[i] + ",");
        }
        System.out.println();
        System.out.println();


        System.out.println("Задача 4.");
        for (int i = 0; i < arrays1.length; i++) {
            arrays1[i]+=1;
            if (arrays1[i]%2==0){
                System.out.print(arrays1[i] + " ");
            }

        }
    }
}