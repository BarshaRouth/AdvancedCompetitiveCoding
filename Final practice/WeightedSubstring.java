import java.util.*;

public class WeightedSubstring {
    public static int countSubstring(String p,String q,int k){
        Set<String> uniqueSubstring=new HashSet<>();
        int[] weight=new int[26];
        for(int i=0;i<26;i++){
            weight[i]=q.charAt(i)-'0';
        }
        int n=p.length();
        for (int i = 0; i < n; i++) {
            int sum=0;
            StringBuilder sb=new StringBuilder();
            for (int j = i; j < n; j++) {
                char ch=p.charAt(j);
                sum+=weight[ch-'a'];
                if(sum>k) break;
                sb.append(ch);
                uniqueSubstring.add(sb.toString());
            }
        }

        return uniqueSubstring.size();
    }
    public static void main(String[] args) {
        String p="abc";
        String q="12345678901234567801234516";
        int k=2;
        int num=countSubstring(p, q, k);
        System.out.println(num);
    }
}
