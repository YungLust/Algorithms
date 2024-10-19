public class Sorter {
    private SortStrategy currentStrategy;
    public Sorter(SortStrategy sortStrategy){
        currentStrategy = sortStrategy;
    }
    //change to another strategy if needed
    public void setStrategy(SortStrategy sortStrategy){
        currentStrategy = sortStrategy;
    }
    //using sort method from currentStrategy
    public void sort(int[] arr){
        currentStrategy.sort(arr);
    }
}
