package gridy;

/*
1. 아이디어
동전들 for -> 동전cnt 업뎃, 현재 남은 액 업뎃
2. 시간 복잡도
for : N
3. 자료구조
- 동전 종류 개수 : int
- 합 K : int
- 동전 종류 : int[]
- 남은 잔액 : int
- cnt : int
	
 */
import java.util.Scanner;
public class Coin11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] coins = new int[N];
		for(int i=0; i<N; i++) {
			coins[i] = sc.nextInt();
		}
		
		int cnt = 0;
		for(int i=N-1; i>=0; i--) {
			cnt += K / coins[i];
			K %= coins[i];
		}
		
		System.out.println(cnt);
	}

}
