import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] genNumbers = Generate.intArray(30,150);
        System.out.println(Arrays.toString(genNumbers));

        //create sorter with buble sort strategy
        Sorter sorter = new Sorter(new BubbleSort());

        //now we can sort
        sorter.sort(genNumbers);

        System.out.println(Arrays.toString(genNumbers));
    }
}