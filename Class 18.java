public class ArrayPassingExample {

    // Method to modify elements of an integer array
    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2; // Double each element
        }
    }

    // Method to print elements of an integer array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Passing the array to the modifyArray method
        System.out.println("Original array:");
        printArray(numbers);
        modifyArray(numbers);
        System.out.println("Array after modification:");
        printArray(numbers);
    }
}
