package ch04;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args){
        /*
            숫자를 입력하세요(정지:0) : 14
            숫자를 입력하세요(정지:0) : 10
            숫자를 입력하세요(정지:0) : 0

            더한수 : 24
         */


        Scanner scan = new Scanner(System.in);
        int sum = 0, val =0;  //초기값을 정해줘야함. 입력하는 값 : val, 합계 :sum

        System.out.print("숫자를 입력하세요(정지:0)");
        val = scan.nextInt();
        sum=sum+val;  //숫자 입력되면 합한다.
        while(val !=0){  //0이 아니라면 더하고 0이라면 sum값을 출력한다.
            System.out.print("숫자를 입력하세요(정지:0)");
            val = scan.nextInt();
            sum=sum+val;
        }
        System.out.println("더한 수 : "+sum);

    }
}
