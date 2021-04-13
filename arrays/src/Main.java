public class Main {
    public static void main(String[] args) {
        int [] list1 = new int[] { 5, 7, 7, 7, 8, 22, 22, 23, 31, 35, 35, 40, 40, 40, 41 };
        int [] list2 = new int[] { 1, 2, 11, 17, 19, 20, 23, 24, 25, 26, 31, 34, 37, 40, 41 };
        int [] list3 = new int[] {};

        System.out.println(numUnique(list1));
        System.out.println(numUnique(list2));
        System.out.println(numUnique(list3));
    }

    public static int numUnique(int[] list) {
        if (list.length == 0) {
            return 0;
        } else {
            int count = 1;
            for (int i = 1; i < list.length; i++) {
                if (list[i] != list[i - 1]) {
                    count++;
                }
            }
            return count;
        }
    }
}