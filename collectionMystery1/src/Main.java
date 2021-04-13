import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,String> mapA = new TreeMap<String, String>();
        mapA.put("two","deaux");
        mapA.put("five","cinq");
        mapA.put("one","un");
        mapA.put("three","trois");
        mapA.put("four","quatre");

        Map<String,String> mapB = new TreeMap<String, String>();
        mapB.put("skate","board");
        mapB.put("drive","car");
        mapB.put("program","computer");
        mapB.put("play","computer");

        Map<String,String> mapC = new TreeMap<>();
        mapC.put("siskel","ebert");
        mapC.put("girl","boy");
        mapC.put("heads","tails");
        mapC.put("ready","begin");
        mapC.put("first","last");
        mapC.put("begin","end");

        Map<String,String> mapD = new TreeMap<>();
        mapD.put("cotton","shirt");
        mapD.put("tree","violin");
        mapD.put("seed","tree");
        mapD.put("light","tree");
        mapD.put("rain","cotton");

        mystery(mapA);
        mystery(mapB);
        mystery(mapC);
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