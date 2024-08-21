/*
1. 아이디어
입력 순회 -> 값에 따라 위치 변환

2. 시간 복잡도
입력 순회 : 50

3. 자료구조
입력 : String or Char[50]
현재 위치 : int
 */

 import java.util.*;

 public class ChangYung3028{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pos = 1;

        String input = sc.nextLine();
        System.out.println(input);
        System.out.println(input.length());

        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == 'A' && pos!=3){
                pos = pos==1? 2:1;
            }
            else if(input.charAt(i) == 'B' && pos!=1){
                pos = pos==2? 3:2;
            } 
            else if(input.charAt(i) == 'C' && pos!=2){
                pos = pos==1? 3:1;
            } 
        }

        System.out.println(pos);

        sc.close();
    }
 }