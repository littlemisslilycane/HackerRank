import java.util.Arrays;

public class MaxMin {
  static int maxMin(int k, int[] arr) {
    Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
    Arrays.sort(array);
    int difference = Integer.MAX_VALUE;
    for(int i=0;i<=array.length-k;i++)
      if(array[i+k-1]-array[i]<difference){
        difference =array[i+k-1] - array[i];
      }
    return difference;
  }
}
