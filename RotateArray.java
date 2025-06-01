// Rotate array by K elements : Block Swap Algorithm

class RotateArray {
    public static void swap(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotateArray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        if(k==0) return;
        swap(arr,0,k-1);
        swap(arr,k,n-1);
        swap(arr,0,n-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int rotation=3;
        rotateArray(arr, rotation);
        System.out.println("Rotated Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
