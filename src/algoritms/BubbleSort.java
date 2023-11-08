package algoritms;

import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) array.add(random.nextInt(1000));
        System.out.println(sort(array));

    }

    public static ArrayList<Integer> sort(ArrayList<Integer> array) {

        for (int i = 0; i < array.size() - 1; i++)
            for (int j = 0; j < array.size() - i - 1; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    int temp;
                    temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }


        return array;
    }
}
