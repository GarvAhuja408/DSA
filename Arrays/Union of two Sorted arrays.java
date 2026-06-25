import java.util.*;

public class UnionSortedArrays {

    static ArrayList<Integer> union(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                add(result, a[i]);
                i++;
            } 
            else if (a[i] > b[j]) {
                add(result, b[j]);
                j++;
            } 
            else {
                add(result, a[i]);
                i++;
                j++;
            }
        }

        while (i < a.length) {
            add(result, a[i]);
            i++;
        }

        while (j < b.length) {
            add(result, b[j]);
            j++;
        }

        return result;
    }

    static void add(ArrayList<Integer> list, int val) {
        if (list.size() == 0 || list.get(list.size() - 1) != val) {
            list.add(val);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 4, 5};
        int[] b = {2, 3, 5, 6};

        System.out.println(union(a, b));
    }
}