package ayrossi.utility;

public class SwapCounter {

    private int counter;

    public void logSwapCount() {
        System.out.println("This algorithm took " + counter + " swaps.");
    }

    public void incrementSwapCounter(){
        this.counter++;
    }
}
