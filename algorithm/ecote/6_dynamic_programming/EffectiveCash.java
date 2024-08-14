package ecote;

import java.util.*;

public class EffectiveCash {
//	public static int[] memo= new int[10001];
//	public static int[] cashSort = new int[100];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] memo = new int[m+1];
		for(int i=0; i<m; i++)
			memo[i] = 0;
		
		int[] cashSort = new int[n];
		
		for(int i=0; i<n; i++)
			cashSort[i] = sc.nextInt();
		
//		for(int me : memo)
//			System.out.print(me + " ");
		
		for(int i=1; i<=m; i++) {
			int j=0;
			for(;j<n; j++) {
				if (i-cashSort[j] == 0) {
					memo[i] = memo[i-cashSort[j]]+1;
					j++;
					break;
				}
				else if (i-cashSort[j] > 0 && memo[i-cashSort[j]] != 0) {
					memo[i] = memo[i-cashSort[j]]+1;
					j++;
					break;
				}
			}
			for(; j<n; j++) {	
				if (i-cashSort[j] == 0) {
					memo[i] = Math.min(memo[i], memo[i-cashSort[j]]+1);

				}
				else if (i-cashSort[j] > 0 && memo[i-cashSort[j]] != 0) {
					memo[i] = Math.min(memo[i], memo[i-cashSort[j]]+1);

				}
			}
		}
		
//		for(int i=0; i<=m; i++)
//			System.out.print(memo[i] + " ");
//		System.out.println();
		
		if(memo[m] == 0)
			System.out.println(-1);
		else System.out.println(memo[m]);
		
		sc.close();
	}

}
