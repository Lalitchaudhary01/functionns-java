public class PrimeQues {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= 1; i++) {
            if (n % i == 0) {
                isPrime = false;

            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }

}
