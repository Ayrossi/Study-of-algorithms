package ayrossi.sorting;

import ayrossi.utility.SwapCounter;
import ayrossi.utility.logging.Logger;

public class SelectionSort extends SortAlgorithm {

    @Override
    public void sort(Comparable[] c) {
        Logger.logHeader(this.getClass().getSimpleName());
        this.swapCounter = new SwapCounter();
        for(int i = 0; i < c.length; i++) {
            int min = i;
            for(int j = i+1; j < c.length; j++) {
                if(c[j].compareTo(c[min]) < 0) {
                    min = j;
                }
            }
            swap(c, i, min);
            this.swapCounter.incrementSwapCounter();
        }
        this.swapCounter.logSwapCount();
    }

    /**
     *  Unused at the moment.
     *  Alternative algorithm possible with this method if we slice the array?
     *  Seems inefficient.
     */
    public Comparable findMinimum(Comparable[] c) {
        Comparable min = c[0];

        for(Comparable comp: c){
            if(min.compareTo(comp) > 0) {
                min = comp;
            }
        }
        return min;
    }
}
