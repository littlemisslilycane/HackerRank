public class MainClass {
  public static void main(String[] args){
    System.out.println(MinimumAbsoluteDifference.minimumAbsoluteDifference(new int[]{-59, -36 ,-13 ,1 ,-53, -92 ,-2, -96 ,-54 ,75}));
    System.out.println(LuckBalance.luckBalance(3,new int[][]{{5,1},{2,1},
            {1,1},{8,1},{10,0},{5,0}}));
    System.out.println(LuckBalance.luckBalance(5,new int[][]{{13,1},{10,1},
            {9,1},{8,1},{13,1},{12,1},{18,1},{13,1}}));
    System.out.println(GreedyFlorist.getMinimumCost(3,new int[]{1,3,5,7,9}));
    System.out.println(MaxMin.maxMin(3, new int[]{10,100,300,200,1000,20,30}));
  }
}
