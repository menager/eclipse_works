
public class visa1 {

	
    static int minMoves(int[] avg) {

        int leftIndex = 0;
        int rightIndex = (avg.length-1);
        int moveCount = 0;
      while(leftIndex < rightIndex){
          
          while(avg[leftIndex] == 1 && leftIndex < rightIndex){
              leftIndex++;
          }
          while(avg[rightIndex] == 0 && leftIndex < rightIndex){
              rightIndex--;
          }
          if(leftIndex < rightIndex){
              avg[leftIndex] = 1;
              avg[rightIndex] =0;
              moveCount++;
              leftIndex++;
              rightIndex--;
          }
          
      }
   
      return moveCount;

  }
}
