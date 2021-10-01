package ch05;

public class MethodTest3 {
    public static void main(String[] args) {
        int rVal = getRandom(30, 40); //30~40 랜덤한 값을 리턴하는 메소드구현
        System.out.println(rVal);

        int absVal1 = getABS(10);
        int absVal2 = getABS(-10);
        System.out.println(absVal1);
        System.out.println(absVal2);

    }
    public static int getABS(int val){
        if(val < 0){
            return -val;
        }return val;
        //return val <0? -val : val;  똑같다.
    }


    public static int getRandom(int n1, int n2) {
        //(n2-n1)+1 은 곱하기.
        //n1은 더하기
        return (int)(Math.random() * (n2-n1)+1) + n1; // 30~40
    }
}
