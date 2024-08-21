/*
1. 아이디어
while문 -> 무한, break
1) 현재 칸 청소x -> 청소
2) for문으로 4방향 검사 -> 회전,전진 -> 1)
3)                 없다면 후진 -> 1)
                            불가능 -> 종료

2. 시간 복잡도
for : N x M
4방향 : 4
-> 4xNxM = O(NM) = 50^2 = 2500  < 2억

3. 자료구조
map : int[][]
    0: 청소x, 1:벽, 2:청소o
cnt, 내 위치, 방향 : int, int, int, int
 */

import java.util.*;

public class RobotCleaner14503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int r = sc.nextInt();
        int c = sc.nextInt();

        int d = sc.nextInt();

        int map[][] = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;

        int dr[] = {-1, 0, 1, 0}; // 북 동 남 서 (시계방향)
        int dc[] = {0, 1, 0, -1};

        while(true){
            // System.out.println("현재 위치: " + r + ", " + c);
            // System.out.println("방향 : " + d);
            boolean flag = true; // 4방향 모두 청소되어있나
            if(map[r][c] == 0){
                map[r][c] = 2;
                cnt++;
            }

            for(int i=1; i<5; i++) {
                int nd = d-i<0? d-i+4:d-i;

                int nr = r + dr[nd]; 
                int nc = c + dc[nd]; 

                // if((nr >= 0 && nr < N) && nc>=0 && nc < M){
                    if(map[nr][nc] == 0) {
                        d = nd;
                        r = nr;
                        c = nc;
                        map[nr][nc] = 2;
                        cnt++;
                        flag = false;
                        break;
                    }
                // }
                
            }

            // 현재 칸의 주변 4칸 중 청소되지 않은 빈 칸이 없는 경우
            if (flag) {
                r = r + dr[(d+2)%4]; 
                c = c + dc[(d+2)%4]; 

                // if((r >= 0 && r < N) && c>=0 && c < M){
                    if(map[r][c] == 1) {
                        break;
                    }
                // }
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}
