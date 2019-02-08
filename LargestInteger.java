 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int i;
        int j = integers[0]; 
         
         for (i = 1; i < integers.length; i++){ 
             if (integers[i] > j){ 
                 j = integers[i]; 
                }
            }
         return j; 
        
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int i = Math.max(Math.max(integers[0], integers[1]), integers[2]);
        return i;
    }
}
