public class MaxFrequentNumberInArray {

        public static void main(String[] args) {
            // int[] arr = {1 ,1, 1, 2 ,2 ,2 ,3 ,3 ,3 ,3,40 ,40, 40,45,60,60,60,60};
            int[] arr = {10, 20, 10, 20, 30, 20, 20};
            if(check_freq(arr)==0)
                    System.out.print(max_number(arr));
            else
                System.out.print(freq_number(arr));
        }

    public static int freq_number(int[] elements) {
        int count =1, number=0, check_point =1, number_temp=0;
        for( int i =0;i<elements.length;i++) {
            count =1;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i] == elements[j]) {
                    count++;
                    number=elements[i];
                }
            }
            if(check_point <= count){
                check_point = count;
                number_temp = number;
            }

        }
        return number_temp;
    }
        //return max number of array
        public static int max_number(int[] elements) {
            int max = elements[0];
            for (int i = 1; i < elements.length; i++) {
                if (max < elements[i])
                    max = elements[i];
            }
            return max;
        }

        public static int check_freq(int [] elements) {
            int loop =0;
            int count =0;
            for( int i =0;i< elements.length;i++) {
                for (int j = i+1; j < elements.length; j++) {
                    if (elements[i] == elements[j]) {
                        count++;
                        break;
                    }

                }
            }
            return count;
        }

        // return max freq number



}

