import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] genNumbers = Generate.intArray(30,150);
        System.out.println(Arrays.toString(genNumbers));
        int[] genNumbers2 = genNumbers.clone();

        //create sorter with buble sort strategy
        Sorter sorter = new Sorter(new BubbleSort());

        //now we can sort
        sorter.sort(genNumbers);

        //now we change to another sorting strategy
        sorter.setStrategy(new SelectionSort());
        sorter.sort(genNumbers2);

        System.out.println("Bubble sort: "+Arrays.toString(genNumbers));
        System.out.println("Selection sort: "+Arrays.toString(genNumbers2));
    }
}