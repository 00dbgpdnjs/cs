/*
1.  아이디어
n0: 0 -> 1
n1: 1 -> 1
    n0+1
n2: 1+1, 2 -> 2
    n1+1  n0+2
n3: 0+3 / 1+2 / 1+1+1, 2+1 -> 4
    n0+3  n1+2  n2+1
점화식 : An = An-1 + An-2 + An-3  (n>=3)

2. 시간 복잡도
for : 3~N = O(N)

3. 자료구조
메모 : int[]
 */
import java.util.Scanner;
public class Add9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int memo[] = new int[n+2];
            memo[0] = 1;
            memo[1] = 1;
            memo[2] = 2;
            for(int j=3; j<=n; j++){
                memo[j] = memo[j-1] + memo[j-2] + memo[j-3];
            }
            System.out.println(memo[n]);
        }
    }
}
