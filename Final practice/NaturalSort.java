import java.util.Arrays;
import java.util.Comparator;

class NaturalSort{
    public static void main(String[] args) {
        String[] files={"file1","file20","file2","file15"};
        Arrays.sort(files,new Comparator<String>(){
            @Override
            public int compare(String a,String b){
                return extractNumber(a) - extractNumber(b);
            }
            public int extractNumber(String a){
                String num=a.replaceAll("\\D","");
                return Integer.parseInt(num);
            }
        });
        System.out.println(Arrays.toString(files));
    }
}