public class Fibonacci {
    public static int recursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursive(n - 1) + recursive(n - 2);
        }
    }

    public static int iterative(int n) {
        if (n <= 1) {
            return n;
        }

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }


    public static void main(String[] args) {
        int[] inputs = {1, 2, 3, 4, 5, 10, 20, 30, 40, 50};

        System.out.println("n\tRecursive\tIterative");
        for (int n : inputs) {
            long recursiveStartTime = System.nanoTime();
            int recursiveResult = Fibonacci.recursive(n);
            long recursiveEndTime = System.nanoTime();
            long recursiveTimeTaken = recursiveEndTime - recursiveStartTime;

            long iterativeStartTime = System.nanoTime();
            int iterativeResult = Fibonacci.iterative(n);
            long iterativeEndTime = System.nanoTime();
            long iterativeTimeTaken = iterativeEndTime - iterativeStartTime;

            System.out.println(n + "\t" + recursiveTimeTaken + "\t" + iterativeTimeTaken);
        }
    }
}