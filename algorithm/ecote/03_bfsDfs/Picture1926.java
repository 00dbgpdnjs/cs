package search.bfsDfs;

/*
1. 아이디어
이중 for -> if 값1 & 방문x : bfs
	각 bfs : 크기+1
2. 복잡도
이중 for : n*m = 500*500
bfs : e+v = v+4v = 5v = 5 * 250,000 
	 v = n * m = 500 * 500
총 : 
3. 자료구조
 */

import java.util.*;

public class Picture1926 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		int n = sc.nextInt(); // 세로 크기
		int m = sc.nextInt();
		
		int map[][] = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] = sc.nextInt();
			}
		}*/
		
		int n = 500;
		int m = 500;
		int[][] map = new int[500][500];
        Random rand = new Random();

        // 배열을 0 또는 1로 채우기
        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
            	map[i][j] = rand.nextInt(2); // 0 또는 1 생성
            }
        }
        // 배열을 0 또는 1로 채우기
        for (int i = 0; i < 500; i++) {
            for (int j = 0; j < 500; j++) {
            	System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
		
		boolean chk[][] = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				chk[i][j] = false;
			}
		}
		
		int maxPaint = 0;
		int cntPaint = 0; 
		
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] == 1 && chk[i][j] == false) {
					cntPaint++;
					chk[i][j] = true;
					maxPaint = Math.max(maxPaint, bfs(i, j, n, m, map, chk));
				}
			}
		}
		
		long finishTime = System.currentTimeMillis();
        long elapsedTime = finishTime - startTime;

        System.out.println("elapsedTime(ms) : " + elapsedTime);
		
		System.out.println(cntPaint);
		System.out.println(maxPaint);
		
		sc.close();
	}

	public static int bfs(int x, int y, int n, int m, int[][]map, boolean[][]chk) {
		int[] dx = {0, -1, 0, 1};
		int[] dy = {-1, 0, 1, 0};
		
		Queue<Integer> qx = new ArrayDeque<>();
		Queue<Integer> qy = new ArrayDeque<>();
		qx.add(x);
		qy.add(y);
		
		int cntSize = 1;
		
		while(!qx.isEmpty()) {
			int x1 = qx.poll();
			int y2 = qy.poll();
			
			for(int i=0; i<4; i++) {
				int currX = x1 + dx[i];
				int currY = y2 + dy[i];
				
				if(currX < 0 || currX >= n || currY < 0 || currY >= m) continue;
				if(map[currX][currY]== 1 && !chk[currX][currY]) {
					qx.add(currX);
					qy.add(currY);
					chk[currX][currY] = true;
					cntSize++;
				}
			}
		}
		return cntSize;
	}

}
