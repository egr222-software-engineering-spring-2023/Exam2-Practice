import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main a = new Main();

        List<String> list1 = new ArrayList<String>() {
            {
                add("b");
                add("l");
                add("u");
                add("e");
            }
        };

        List<String> list2 = new ArrayList<String>() {
            {
                add("s");
                add("p");
                add("o");
                add("t");
            }
        };

        System.out.println(a.mystery2(list1,list2));

        list1.clear();
        list1.add("s");
        list1.add("o");
        list1.add("b");
        list1.add("e");
        list1.add("r");

        list2.clear();
        list2.add("b");
        list2.add("o");
        list2.add("o");
        list2.add("k");
        list2.add("s");

        System.out.println(a.mystery2(list1,list2));
    }

    public Map<String, String> mystery2(List<String> list1, List<String> list2) {
        Map<String, String> result = new TreeMap<String, String>();
        for (int i = 0; i < list1.size(); i++) {
            result.put(list1.get(i), list2.get(i));
            result.put(list2.get(i), list1.get(i));
        }
        return result;
    }
}