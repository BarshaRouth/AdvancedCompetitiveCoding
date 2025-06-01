public class MoveHyphenToBeginning {
    static void hyphenInFront(char str[]){
        int i=str.length-1;
        for (int j = i; j >= 0; j--) {
            if(str[j]!='-'){
                char temp=str[j];
                str[j]=str[i];
                str[i]=temp;
                i--;
            }
            
        }
    }
    public static void main(String[] args) {
        char str[]="Barsha---Routh-".toCharArray();
        hyphenInFront(str);
        System.out.println(String.valueOf(str));
    }
}
