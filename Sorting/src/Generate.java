import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Generate {
    public static int[] intArray(int n, int max){
        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            arr[i]=random.nextInt(max);
        }
        return arr;
    }
}
