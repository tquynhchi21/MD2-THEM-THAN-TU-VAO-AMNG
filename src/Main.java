import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 40, 9, 20, 83, 330};
        System.out.println("Nhap Phan tu muon them :");
        int x = sc.nextInt();
        System.out.println("Tai vi tri :");
        int i = sc.nextInt();
        if (i <= -1 || i >= array.length - 1) {
            System.out.println("Can not insert!");
            return;
        }
        System.arraycopy(array, i, array, i + 1, array.length - 1 - i);
        array[i] = x;
        System.out.println(Arrays.toString(array));
    }
}