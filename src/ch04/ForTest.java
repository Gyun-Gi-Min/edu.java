package ch04;

public class ForTest {
    public static void main(String[] args){
        //구구단..
        int dan = (int)(Math.random()*8)+2; // 2~9

        for(int i=1; i<10; i++){ //i = index의 약자.
            System.out.printf("%d X %d = %d\n",dan,i,dan*i);
        }
        System.out.println();
        for(int i=10; i<19; i++){ //i = index의 약자.
            System.out.printf("%d X %d = %d\n",dan,i-9,dan*(i-9));
        }
    }
}