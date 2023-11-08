package algoritms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SelectSort {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int temp = random.nextInt(1000);
            array.add(temp);
            array2.add(temp);
        }
        System.out.println(sort(array));
        Collections.sort(array2);
        System.out.println(array2);
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> array) {

        for (int i = 0; i < array.size(); i++) {
            int min = i;
            for (int j = i + 1; j < array.size(); j++)
                if (array.get(j) < array.get(min))
                    min = j;
            int temp = array.get(i);
            array.set(i, array.get(min));
            array.set(min, temp);
        }
        return array;
    }
}
