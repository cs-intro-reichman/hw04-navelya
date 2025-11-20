public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to "+ n +":");
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (count * 100 / n) + "% are primes)");
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}