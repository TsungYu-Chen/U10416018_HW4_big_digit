//U10416018 陳宗佑
import java.util.Scanner;

public class BigDigit{
	//加法
	public static int[] add(int[] a, int[] b){
		int carry = 0;
		int[] c = new int[a.length];
		
		for(int i = a.length - 1; i >= 0; i--){
			c[i] = a[i] + b[i] + carry;
			if(c[i] < 10000)
				carry = 0;
			//如果大於四位數, 進位
			else {
				c[i] = c[i] - 10000;
				carry = 1;
			}
		}
		return c;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[5];
		int[] b = new int[5];
		
		System.out.println("\n請輸入兩個陣列 a, b 如: 1111 2222 3333 4444 5555, 使其相加\n");
		//讓使用者輸入兩個陣列, 使其相加
		System.out.print("enter a :");
		for(int i = 0; i < a.length; i ++){
			a[i] = input.nextInt();
		}
		
		System.out.print("enter b :");
		for(int i = 0; i < b.length; i ++){
			b[i] = input.nextInt();
		}
		System.out.println();
		
		int[] c = BigDigit.add(a, b);
		System.out.print("a + b =");
		for(int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
		System.out.println();
	}
}