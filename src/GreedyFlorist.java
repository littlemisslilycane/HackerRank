import java.util.Arrays;

public class GreedyFlorist {
  static int getMinimumCost(int k, int[] c) {
    //Sort the array in descending order
    Integer[] array = Arrays.stream(c).boxed().toArray(Integer[]::new);
    Arrays.sort(array,(a,b) -> Integer.compare(b,a));
    int totalCost = 0;
    int purchases = 0;
    int i = 0;
    int friends = k;
    while (i < array.length) {
      if (k == 0) {
        purchases++;
        k = friends;
      } else {
        k--;
        totalCost += ((purchases + 1) * array[i]);
        i++;
      }

    }
    return totalCost;
  }
}
