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
            return 0;           // if the list is EMPTY then there are NO UNIQUE VALUES (return 0)
        } else {
            int count = 1;      // the list MUST have at least ONE unique value (the first entry)
            for (int i = 1; i < list.length; i++) {     // starting with index = 1 (second entry) compare to the previous entry
                if (list[i] != list[i - 1]) {           // if values are different than the previous entry then increment number of unique values
                    count++;
                }
            }
            return count;       // return the number of unique values
        }
    }
}