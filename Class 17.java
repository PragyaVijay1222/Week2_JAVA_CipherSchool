public class ArrayExample {
    public static void main(String[] args) {
        // Declaration and initialization of an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements of the array using index
        System.out.println("Accessing elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modifying an element of the array
        numbers[2] = 35;
        System.out.println("\nAfter modification:");
        System.out.println("Element at index 2: " + numbers[2]);

        // Declaration and initialization of an array of strings
        String[] names = {"Alice", "Bob", "Charlie", "David", "Emma"};

        // Accessing elements of the string array using enhanced for loop
        System.out.println("\nAccessing elements of the string array:");
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // Declaration and initialization of a two-dimensional array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Accessing elements of the two-dimensional array using nested loops
        System.out.println("\nAccessing elements of the two-dimensional array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
