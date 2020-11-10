package level1;

import java.util.Scanner;

// 직사각형 별찍기
public class Level1_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();

		// 자원 해제
		sc.close();
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}