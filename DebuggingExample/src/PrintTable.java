import java.util.Scanner;

public class PrintTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = scan.nextInt();
		PrintTable pt = new PrintTable();
		pt.print(num);
	}
	
	public void print(int n) {
		for(int i = 1 ; i<=10; i++) {
			int ans = n * i;
			System.out.println(n + " * "+ i + " = "+ans);
		}
	}
}
