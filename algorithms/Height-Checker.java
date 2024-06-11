import java.util.Arrays;
public class myTrial {
  public int HeightList(int[] heights){
      int[] expected = heights.clone();
      Arrays.sort(expected);

      int mismatches=0;
      for(int i=0; i < heights.length; i++){
          if(heights[i] != expected[i]){
              mismatches++;
          }
      }
      return  mismatches;
  }

  public static void main (String args[]){
      myTrial solution = new myTrial();

      int[] heights1 = {1,3,4,5,6,6,3,7,8,6,6,7,5};
      System.out.println(solution.HeightList(heights1));

      int[] heights2 = {2,3,4,2,5};
      System.out.println(solution.HeightList(heights2));

      int[] heights3 = {1,2,3,4,5,6};
      System.out.println(solution.HeightList(heights3));

  }

}
