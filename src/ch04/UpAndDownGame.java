package ch04;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        System.out.println("Up & Down Game~");
        Scanner scan = new Scanner(System.in);

        int target = (int)(Math.random()*100)+1;
        int val = 0, cnt=0; //val은 입력값 cnt는 총 입력한값

        while(true){
            cnt++;
            System.out.print("숫자를 입력하세요");
            val = scan.nextInt();

            if(val == target){
                break;
            }else if (val>target){
                System.out.println("Down");
            }else{
                System.out.println("Up");
            }
        }
        System.out.printf("맞췄습니다! %d번 걸리셨습니다!",cnt);
    }
}
