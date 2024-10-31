import java.util.Scanner;

public class Main {
    public void swap(int arr[], int i, int min) {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }

    public void selcection(int arr[]) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int min = i;
            for (int j = i+1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    public static void main(String[] args) {
        Main mad=new Main();
        System.out.println("Enter your array elements");
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        mad.selcection(arr);

        System.out.println("Sorted one=");
        for (int val:arr) {
            System.out.println(val);
        }
    }
}