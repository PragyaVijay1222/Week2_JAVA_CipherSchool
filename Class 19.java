public class MultiDimensionalArrayExample {
    public static void main(String[] args) {
        // Declaration and initialization of a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements of the 2D array
        System.out.println("Accessing elements of the 2D array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Declaration and initialization of a 3D array
        int[][][] threeDArray = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };

        // Accessing elements of the 3D array
        System.out.println("\nAccessing elements of the 3D array:");
        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
