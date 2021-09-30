package ch04;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //scan은 래퍼런스 타입
        //new 객체화

        System.out.print("나이를 입력하세요");
        int age = scan.nextInt();
        System.out.println("나이 : "+ age);
    }
}
