public class JosephusTrap {
    public static void main(String[] args) {
        int n=7;
        int k=3;
        int safePosition=josephus(n,k)+1;
        System.out.println(safePosition);
    }
    
    public static int josephus(int n,int k){
        if (n==1) return 0;
        else{
            return (josephus(n-1,k)+k)%n;
        }
    }
}
