import java.util.Arrays;
import java.util.Random;

public class Sort3 {
    public static void main(String[] args) {
        int[] arr1 = generateArray(1000); // генерируем массив из 1000 случайных чисел
        int[] arr2 = Arrays.copyOf(arr1, arr1.length); // создаем копию массива для сортировки быстрой
        long start1 = System.nanoTime();
        new Sort1(arr1); // сортировка пузырьком
        long end1 = System.nanoTime();
        long time1 = end1 - start1;
        System.out.println("Bubble sort time for array of 1000 elements: " + time1 / 1000000.0 + " ms");
        long start2 = System.nanoTime();
        new Sort2(arr2, 0, arr2.length - 1); // сортировка быстрая
        long end2 = System.nanoTime();
        long time2 = end2 - start2;
        System.out.println("Quick sort time for array of 1000 elements: " + time2 / 1000000.0 + " ms");
        // повторяем для массива из 10000 элементов
        int[] arr3 = generateArray(10000);
        int[] arr4 = Arrays.copyOf(arr3, arr3.length);
        long start3 = System.nanoTime();
        new Sort1(arr3);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;
        System.out.println("Bubble sort time for array of 10000 elements: " + time3 / 1000000.0 + " ms");
        long start4 = System.nanoTime();
        new Sort2(arr4, 0, arr4.length - 1);
        long end4 = System.nanoTime();
        long time4 = end4 - start4;
        System.out.println("Quick sort time for array of 10000 elements: " + time4 / 1000000.0 + " ms");
    }

    private static int[] generateArray(int n) {
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
}
