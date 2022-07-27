import java.util.HashMap;
import java.util.Map;

public class SampleTest {
    public static void main(String[] args) {
        //subarray
        //{10,13,21,8,19};
        ////negative
        //
        // {10,13,-21,8,19};
        //
        //sum = 42
        //
        //ans: [1,3]
        //{10,13,21,8,19};
//        first, second


//        first = 10
//        second = 13

//        //{10,13,21,8,19};
        //

        //{10,13,-21,8,19};//sum = 0
//        left prefix sum array 10,23,2,10,29
        //right sum     29,19,6,27,19

            int[] arr = {10,13,-21,8,19};
            int sum = 6;

            if(arr.length == 0) {
                return;
            }
            int n = arr.length;
            int first = 0;
            int second = 0;
            Map<Integer, Integer> map = new HashMap<>();
            int currentSum = 0;
            for(int i=0;i<n;i++) {
                currentSum += arr[i];
                if(map.containsKey(currentSum-sum)) {
                    first = map.get(currentSum-sum)+1;
                    second = i;
                    break;
                }
                map.put(currentSum, i);
            }
            System.out.println(first +","+second);

        }

}


