/*
1. 아이디어
for t
    for 4
        현재 돈 %= 현재 화폐
        개수 += 현재돈/현재 화폐

2. 시간 복잡도
t*4 = O(t)

3. 자료구조
화폐단위 : double[]
카운트 : int[]
 */
import java.util.Scanner;
public class Laundry2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // double[] coins = {0.25, 0.10, 0.05, 0.01};
        int[] coins = {25, 10, 5, 1};
        for(int i=0; i<t; i++){
            // double money = sc.nextDouble()/100;
            int money = sc.nextInt();
            int[] cnt = {0,0,0,0};
            for(int j=0; j<4; j++){ // 124 -> 24 -> 4
                // System.out.printf("money/coins[%d]=%f/%f=%f\n", j, money, coins[j], money/coins[j]);
                // System.out.println("(int) (money/coins[j])="+(int) (money/coins[j]));
                // cnt[j] = (int) (money/coins[j]);
                cnt[j] = money/coins[j];
                money %= coins[j];
            }
            
            for(int c : cnt){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
