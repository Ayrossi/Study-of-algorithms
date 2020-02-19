package ayrossi.sorting;

import java.util.Arrays;

public class MergeSort extends SortAlgorithm {

    @Override
    public void sort(Comparable[] c) {
        if(c.length <= 1) {
            return;
        }

        int middle = c.length/2;

        sort(sliceOfArray(c,0, middle));
        sort(sliceOfArray(c, middle + 1, c.length));


    }

    public static Comparable[] sliceOfArray(Comparable[] arr,
                                        int startIndex,
                                        int endIndex) {
        return Arrays.stream(arr, startIndex, endIndex).toArray(Comparable[]::new);
    }

}
