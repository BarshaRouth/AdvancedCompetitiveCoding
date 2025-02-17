public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] arr={4,1,0,9,8,-1,9,9};
        int prefix=1;
        int suffix=1;
        int ans=Integer.MIN_VALUE;
        int n=arr.length;
        for (int i = 0; i < n; i++) {

            // Reset when encountering zero
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            
            prefix=prefix*arr[i];
            suffix=suffix*arr[n-i-1];
            ans=Math.max(ans,Math.max(prefix, suffix));
        }
        System.out.println(ans);
    }
}
