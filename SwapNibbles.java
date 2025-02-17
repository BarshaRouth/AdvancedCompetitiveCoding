import java.util.Scanner;

public class SwapNibbles {

    public static int swapNibbles(int num){
        return ((num & 0x0F)<<4) | ((num & 0xF0)>>4);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=swapNibbles(num);
        System.out.println(res);
        sc.close();
    }
}

// swap 2 nibbles in a byte

// 5 step
// 1.& num with hexadecimal 0F(15)
// 2.& Num with hexa F0(240)
// 3.<< by 4 positions
// 4.>> by 4 position
// 5.combine by using '|' operator