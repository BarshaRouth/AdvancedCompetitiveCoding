import java.util.Scanner;

public class SwapNibbles {

    public static int swapNibbles(int num) {
        // Isolate the lower nibble (last 4 bits) and shift it left by 4 positions
        int lowerNibble = (num & 0x0F) << 4;
        
        // Isolate the upper nibble (first 4 bits) and shift it right by 4 positions
        int upperNibble = (num & 0xF0) >> 4;
        
        // Combine the shifted nibbles using the bitwise OR operator
        return lowerNibble | upperNibble;
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