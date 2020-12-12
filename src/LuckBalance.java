import java.util.Arrays;

public class LuckBalance {
  static int luckBalance(int k, int[][] contests) {
    int luckBalance = 0;
    Arrays.sort(contests,(a,b) -> Integer.compare(b[0],a[0]));
    for(int i=0;i<contests.length;i++){
      if(contests[i][1] == 1){
        if(k>0){
          luckBalance += contests[i][0];
          k--;
        }
        else{
          luckBalance -=contests[i][0];
        }
      }
      else{
        luckBalance += contests[i][0];
      }
    }
    return luckBalance;
  }
}
