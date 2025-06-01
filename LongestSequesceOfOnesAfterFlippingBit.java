public class LongestSequesceOfOnesAfterFlippingBit {
    public static int findMaxConsecutiveOnes(int[] a,int k){
        int max=Integer.MIN_VALUE;
        int f=0;
        int left=0;
        for (int right = 0; right < a.length; right++) {
            if(a[right]==0){
                f++;
            }
            while(f>k){
                if(a[left]==0){
                    f--;
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a={1,1,1,0,0,0,1,1,1,1,1,0};
        int k=1;
        int results=findMaxConsecutiveOnes(a, k);
        System.out.println("Result:"+results);
    }
}
