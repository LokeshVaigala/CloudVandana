import java.util.*;

public class ArrayShuffle {
    public static void main(String[] args) {
        // Create an array
        Integer[] arr = {1,2,3,4,5,6,7};

        // Convert the array to a list
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        // Shuffle the list
        Collections.shuffle(list);

        // Convert the list back to an array (if needed)
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Print the shuffled array
        System.out.println(Arrays.toString(shuffledArray));
    }
}
