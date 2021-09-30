package ch01;

public class VariableExample {

    public static void main(String[] args) {
        int score;
        score = 10;
        System.out.println(score);
        System.out.println(10);

        score = 20;
        System.out.println(score);
        System.out.println(20);

        System.out.println(score+score);
        System.out.println(score);

        score= score+score+score;
        System.out.println(score);

        short s1 =-129;
        byte b1=(byte) s1;
        System.out.println(b1);

        final int score2 = 11;
        //score2=12;  // 이거 안된다. 상수는 한번 입력된 값은
        //바꿀 수 없다.

    }
}




