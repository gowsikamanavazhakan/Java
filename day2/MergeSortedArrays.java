import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};

        List<Integer> mergedList = mergeArrays(array1, array2);

        System.out.println("Merged Sorted Array: " + mergedList);
    }

    public static List<Integer> mergeArrays(int[] array1, int[] array2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;


        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedList.add(array1[i]);
                i++;
            } else {
                mergedList.add(array2[j]);
                j++;
            }
        }


        while (i < array1.length) {
            mergedList.add(array1[i]);
            i++;
        }

        while (j < array2.length) {
            mergedList.add(array2[j]);
            j++;
        }

        return mergedList;
    }
}
