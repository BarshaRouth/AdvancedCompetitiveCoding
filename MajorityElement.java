public class MajorityElement{
    public static void main(String[] args) {
        int majorityCount=0;
        int num=0;
        int[] arr={2,3,4,1,2,2,2,2,2,2,1};
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if (count>majorityCount) {
                majorityCount=count;
                num=arr[i];
            }
        }
        if (majorityCount>(arr.length/2)) {
            System.out.println("Majority Element is:"+num);
        }
    }
}

// --OPTIMISED--BOYER MOORE SOLUTION