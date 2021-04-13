import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<Integer>(Arrays.asList(10,20,10,5));
        ArrayList<Integer> listB = new ArrayList<Integer>(Arrays.asList(8,2,9,7,-1,55));
        ArrayList<Integer> listC = new ArrayList<Integer>(Arrays.asList(0,16,9,1,64,25,25,14,0));

        mystery(listA);
        mystery(listB);
        mystery(listC);
    }

    public static void mystery(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i += 2) {
            if (list.get(i - 1) >= list.get(i)) {
                list.remove(i);
                list.add(0, 0);
            }
        }
        System.out.println(list);
    }
}