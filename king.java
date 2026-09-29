import java.util.Scanner;

public class king {

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    static void selectionSort(int[] arr) {
        System.out.println("\n--- Selection Sort ---");

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);
        }
    }

    static void bubbleSort(int[] arr) {
        System.out.println("\n--- Bubble Sort ---");

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);
        }
    }

    static void insertionSort(int[] arr) {
        System.out.println("\n--- Insertion Sort ---");

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.print("Pass " + i + ": ");
            printArray(arr);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("\nEnter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nSelect Sorting Algorithm:");
        System.out.println("[1] Selection Sort");
        System.out.println("[2] Bubble Sort");
        System.out.println("[3] Insertion Sort");

        System.out.print("\nEnter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                selectionSort(arr);
                break;

            case 2:
                bubbleSort(arr);
                break;

            case 3:
                insertionSort(arr);
                break;

            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }

        System.out.print("\nFinal Sorted Array: ");
        printArray(arr);

        scanner.close();
    }
}
