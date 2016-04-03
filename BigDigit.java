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
			else if(c[i] < 1000){
				System.out.print("0");
			}
			//如果大於四位數, 進位
			else {
				c[i] = c[i] - 10000;
				carry = 1;
			}
		}
		return c;
	}
	//減法
	public static int[] sub(int[] a, int[] b) { 
        	int borrow = 0; 
        	int[] c = new int[a.length];
        
	 for(int i = a.length - 1; i >= 0; i--) { 
        	c[i] = a[i] - b[i] - borrow; 
            	if(c[i] >= 0) 
                	borrow = 0;
		//如果 a[i] < b[i] 借位
            	else { 
                	c[i] = c[i] + 10000; 
                	borrow = 1; 
            	} 
        }
        
        return c;
    } 
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[6];
		int[] b = new int[6];
		
		System.out.println("請輸入1 or 2\n分別代表 + - : ");
		int determine = input.nextInt();
		//使用者輸入1, 加法
		if(determine == 1){
			System.out.println("\n請輸入兩個陣列 a, b 如: 1111 2222 3333 4444 5555 6666, 使其相加\n");
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
				//判斷 c 的位數並輸出 c
				if(c[i] < 1000 && c[i] > 100){
					System.out.print("0" + c[i]);
				}
				else if(c[i] < 100 && c[i] > 10){
					System.out.print("00" + c[i]);
				}
				else if(c[i] < 10 && c[i] > 1){
					System.out.print("000" + c[i]);
				}
				else if(c[i] < 1){
					System.out.print("0000");
				}
				else{
					System.out.print(c[i]);
				}
			}
			System.out.println();
		
		}
		//使用者輸入2, 減法
		else if (determine == 2){
			System.out.println("\n請輸入兩個陣列 a, b 如: 1111 2222 3333 4444 5555 6666, 使其相減\n");
			//讓使用者輸入兩個陣列, 使其相減
			System.out.print("enter a :");
			for(int i = 0; i < a.length; i ++){
				a[i] = input.nextInt();
			}
		
			System.out.print("enter b :");
			for(int i = 0; i < b.length; i ++){
				b[i] = input.nextInt();
			}
			System.out.println();
		
			int[] c = BigDigit.sub(a, b);
			System.out.print("a - b =");
			for(int i = 0; i < c.length; i++) {
				//判斷 c 的位數並輸出 c
				if(c[i] < 1000 && c[i] > 100){
					System.out.print("0" + c[i]);
				}
				else if(c[i] < 100 && c[i] > 10){
					System.out.print("00" + c[i]);
				}
				else if(c[i] < 10 && c[i] > 1){
					System.out.print("000" + c[i]);
				}
				else if(c[i] < 1){
					System.out.print("0000");
				}
				else{
					System.out.print(c[i]);
				}
			}
			System.out.println();
		}
		else{
			System.out.println("You enter a wrong number!!");
		}
	}
}
