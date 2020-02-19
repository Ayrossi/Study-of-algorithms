package ayrossi.sorting;

abstract class SortAlgorithm {

    abstract void sort(Comparable[] c);

    static void swap(Comparable[] c, int i, int j){
        Comparable temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

}
