package patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print(j);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}

Input: 5
Output:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

