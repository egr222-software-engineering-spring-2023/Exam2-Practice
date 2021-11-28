import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,String> mapA = new LinkedHashMap<>();
        mapA.put("two","deaux");
        mapA.put("five","cinq");
        mapA.put("one","un");
        mapA.put("three","trois");
        mapA.put("four","quatre");

        Map<String,String> mapB = new LinkedHashMap<>();
//        Map<String,String> mapB = new TreeMap<>();    // note that the output will CHANGE if the input is a TreeMap but the printout of the list will not match the problem statement (because a TreeMap prints in natural order)
        mapB.put("skate","board");
        mapB.put("drive","car");
        mapB.put("program","computer");
        mapB.put("play","computer");

        Map<String,String> mapC = new LinkedHashMap<>();
        mapC.put("siskel","ebert");
        mapC.put("girl","boy");
        mapC.put("heads","tails");
        mapC.put("ready","begin");
        mapC.put("first","last");
        mapC.put("begin","end");

        Map<String,String> mapD = new LinkedHashMap<>();
        mapD.put("cotton","shirt");
        mapD.put("tree","violin");
        mapD.put("seed","tree");
        mapD.put("light","tree");
        mapD.put("rain","cotton");

        System.out.println("a)");
        System.out.println(mapA);
        mystery(mapA);
        System.out.println("b)");
        System.out.println(mapB);
        mystery(mapB);
        System.out.println("c)");
        System.out.println(mapC);
        mystery(mapC);
        System.out.println("d)");
        System.out.println(mapD);
        mystery(mapD);
    }

    public static void mystery(Map<String, String> map) {
        Map<String, String> result = new TreeMap<String, String>();
        for (String key : map.keySet()) {
            String value = map.get(key);
            if (key.compareTo(value) < 0) {
                result.put(key, value);
            } else { //value is smaller or equal to key
                result.put(value, key);
            }
        }
        System.out.println(result);
    }
}