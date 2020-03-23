import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;
        int[] array;

        System.out.print("Nhap vao chieu dai cua mang : ");
        size = input.nextInt();

        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Vui long nhap phan tu thu %d : ", i + 1);
            array[i] = input.nextInt();
        }
        int min = findMin(array);
        int index = findIndexOfMax(array);

        System.out.printf("So nho nhat la %d, tai vi tri %d", min, index);
    }

    static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static int findIndexOfMax(int[] array) {
        int min = findMin(array);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                index = i + 1;
                break;
            }
        }
        return index;
    }
}