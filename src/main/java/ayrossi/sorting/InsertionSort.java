package ayrossi.sorting;

import ayrossi.utility.SwapCounter;
import ayrossi.utility.logging.Logger;

public class InsertionSort extends SortAlgorithm {

    @Override
    public void sort(Comparable[] c) {
        Logger.logHeader(this.getClass().getSimpleName());
        this.swapCounter = new SwapCounter();
        for(int i=1; i < c.length; i++) {
            int currentIndex = i;
            while(currentIndex > 0 && c[currentIndex].compareTo(c[currentIndex-1]) < 0){
                swap(c, currentIndex, currentIndex-1);
                this.swapCounter.incrementSwapCounter();
                currentIndex--;
            }
        }
        this.swapCounter.logSwapCount();
    }

}
