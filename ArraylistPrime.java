import java.util.*;

public class ArraylistPrime {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(11);
        list.add(12);

        System.out.println("Original List: " + list);

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : list) {
            if (!isPrime(num)) {
                result.add(num); 
            }
        }

        System.out.println("List after removing primes: " + result);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}