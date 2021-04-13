import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(14, 8, 6, 3, 1, 4, 2, 19, 42, 9));

        System.out.println(list1);
        rearrange(list1);
        System.out.println(list1);

        System.out.println(list2);
        rearrange(list2);
        System.out.println(list2);
    }

    public static void rearrange(ArrayList<Integer> list) {
        for (int i = 1; i <= list.size() / 2; i++) {
            int n = list.get(i);
            list.remove(i);
            list.add(n);
        }
    }
}