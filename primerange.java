public class primerange {

    public static void main(String[] args) {
        int start = 10;  // Replace with your desired start value
        int end = 50;    // Replace with your desired end value

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        printPrimeNumbersInRange(start, end);
    }

    static void printPrimeNumbersInRange(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
