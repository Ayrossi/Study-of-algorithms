package ayrossi.sorting;

public class InsertionSort extends SortAlgorithm {

    @Override
    public void sort(Comparable[] c) {
        for(int i=1; i < c.length; i++) {
            int currentIndex = i;
            while(currentIndex > 0 && c[currentIndex].compareTo(c[currentIndex-1]) < 0){
                swap(c, currentIndex, currentIndex-1);
                currentIndex--;
            }
        }
    }

}
