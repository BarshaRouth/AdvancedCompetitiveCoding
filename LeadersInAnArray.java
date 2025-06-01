import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;

public class LeadersInAnArray {
    public static void leader(int[] arr){
        int n=arr.length;
        ArrayList<Integer> result=new ArrayList<>();
        int maxLead=arr[n-1];
        result.add(maxLead);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxLead){
                result.add(arr[i]);
                maxLead=arr[i];
            }
        }
        Collections.reverse(result);
        for(int l:result){
            System.out.println(l);
        }
    }
    public static void main(String[] args) {
        int[] arr={9,4,6,1,3,5};
        leader(arr);
    }
}
