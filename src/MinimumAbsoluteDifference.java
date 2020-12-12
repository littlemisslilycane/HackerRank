import java.util.Arrays;

public class MinimumAbsoluteDifference {
  static int minimumAbsoluteDifference(int[] arr) {
    //Sort the elements in the ascending order of the absolute value of the variable
    Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
    Arrays.sort(integerArray, (a, b) -> Integer.compare(Math.abs(a),
            Math.abs(b)));
    if (arr.length > 1) {
      int diff = Integer.MAX_VALUE;
      for (int i = 1; i < integerArray.length; i++) {
        int abDiff  = Math.abs(integerArray[i] - integerArray[i - 1]);
        if (abDiff < diff) {
          diff = abDiff;
        }
      }
      return diff;
    }
    return 0;


  }
}
