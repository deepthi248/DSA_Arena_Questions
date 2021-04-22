public class ConstructArray {
    public static void main(String[] args){
        int [] values ={1,2,3,4,5};
        int [] frequencies ={1,1,1,2,2};
       int [] result= arrayConstruction(values,frequencies)  ;
       for(int value: result){
           System.out.print(values+" ");
       }
    }
    public static int[]  arrayConstruction(int [] values, int[] frequencies){
        int sum =0; int k=0;  int value=0;
        // I need to take a new array - have to find length using the frequencies
        for(int elements: frequencies )
                sum+=elements;
        //creating new array
        int result [] = new int[sum];
        int i =0;
       while(i < result.length){
         int  temp=0;
           while(temp < frequencies[k] && k < values.length && value < values.length){
               result[i]=values[value];

               i++;
               temp++;
           }
           if(k< frequencies.length && value< values.length){
               k++;
               value++;
           }
           else
               break;


           System.out.print(result[i]);
       }

        return result;
    }
}
