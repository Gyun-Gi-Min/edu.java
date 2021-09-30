package ch04;

public class ForExample {
    public static void main(String[] args){
        /*
        for( A ; B ; C){
        조건이 되는동안 계속 반복.
        A:초기화 시키는 항목
        B:조건식 (계속 할래? 말래?)
        C:증감식
        }

        for(;;)
        { // 무한 루프
        }
        */

        for(int i=0; i<10; i++){
            System.out.println("i : "+ i);
        }
    }
}
