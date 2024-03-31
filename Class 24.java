public class TimeComplexityExample {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];

        // O(n) time complexity
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        // O(n^2) time complexity
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("[" + i + ", " + j + "]");
            }
        }

        // O(log n) time complexity
        int num = n;
        while (num > 1) {
            num /= 2;
            System.out.println(num);
        }
    }
}
