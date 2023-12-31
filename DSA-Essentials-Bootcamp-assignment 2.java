public class CountPrimes {

    public static boolean isPrime(int num) {
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

    public static int countPrimes(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int output = countPrimes(arr);
        System.out.println("Output: " + output); 
}
