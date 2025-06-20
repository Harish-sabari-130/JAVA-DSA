import java.util.*;

public class Kthlargest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(11);
        list.add(5);

        System.out.println("Original List: " + list);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        Collections.sort(list, Collections.reverseOrder());

        if (k > 0 && k <= list.size()) {
            int kthlarge = list.get(k - 1);
            System.out.println(k+"th largest element is: " + kthlarge);
        } else {
            System.out.println("Invalid value of K");
        }
    }
}