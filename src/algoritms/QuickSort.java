package algoritms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//TODO переделать без использованя дополнительных массивов (не эффективно по памяти)

public class QuickSort {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) array.add(random.nextInt(1000));
        System.out.println(sort(array));
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> array) {
        if (array.size() < 2) return array;
        Random random = new Random();
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> high = new ArrayList<>();
        int target = random.nextInt(array.size());
        for (int i = 0; i < array.size(); i++) {
            if (i == target) continue;
            if (array.get(i) <= array.get(target)) less.add(array.get(i));
            else high.add(array.get(i));
        }
        ArrayList<Integer> result;
        result = sort(less);
        result.add(array.get(target));
        result.addAll(sort(high));
        return result;
    }
}
