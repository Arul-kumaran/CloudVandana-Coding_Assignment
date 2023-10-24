import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();
        
        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
