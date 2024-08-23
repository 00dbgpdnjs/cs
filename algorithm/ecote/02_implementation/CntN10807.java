/*
1. 아이디어
배열을 순회 -> v와 같으면 카운트
2. 복잡도
for : 100
3. 자료구조
정수 배열 : byte[]
카운트 : byte
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        byte[] nums = new byte[n];

        for(byte i=0; i<n; i++){
            nums[i] = sc.nextByte();
        }

        byte target = sc.nextByte();

        byte cnt = 0;

        for(byte i=0; i<n; i++){
            if(nums[i]==target) cnt++;
        }
        
        System.out.println(cnt);
    }    
}
