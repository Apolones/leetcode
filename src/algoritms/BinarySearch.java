package algoritms;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) array.add(random.nextInt(1000));
        Collections.sort(array);
        int target = random.nextInt(1000);
        System.out.println(target);
        System.out.println(array);
        System.out.println(search(array, target));
        System.out.println(array.get(search(array, target)));
    }

    public static int search(ArrayList<Integer> array, int target) {
        int low = 0;
        int high = array.size();
        while (low < high) {
            int medium = (low + high) / 2;
            if (array.get(medium) < target) low = medium;
            else if (array.get(medium) > target) high = medium;
            else return medium;
        }
        return -1;
    }

}
