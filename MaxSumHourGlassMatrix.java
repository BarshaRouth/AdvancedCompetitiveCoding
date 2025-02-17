
class MaxSumHourGlassMatrix{
    public static void main(String[] args) {
        int arr[][]=new int[][]{
            {2,1,2,1},
            {1,2,1,5},
            {1,2,1,1},
            {2,2,1,1}
        };
        int sum,max=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr[i].length-2;j++){
                sum=0;
                sum+=(arr[i][j]+arr[i][j+1]+arr[i][j+2]);
                sum+=(arr[i+1][j+1]);
                sum+=(arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
                max=Math.max(sum,max);
            }
        }
        System.out.println(max);
    }
}