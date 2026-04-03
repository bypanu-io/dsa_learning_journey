public class Main {

    public static int[] moveZeroes(int arr[], int n) {
        int result[] = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }
        while (index < n) {
            result[index++] = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 0, 3, 0, 4 };
        int n = arr.length;

        int result[] = moveZeroes(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
        }
    }
}