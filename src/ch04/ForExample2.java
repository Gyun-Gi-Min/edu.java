package ch04;

public class ForExample2 {
    public static void main(String[] args){
        //중첩for문
        //scope(범위)가 중요(변수)

        for(int i=0; i<5; i++){  //
            for(int z=0; z<5; z++){
                System.out.printf("%d - %d\n", i, z);  // 시계로 활용가능하네~~
            }
        }
        // System.out.println(i); System.out.println(z); 안된다~~~
    }
}
