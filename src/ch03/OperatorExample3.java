package ch03;

public class OperatorExample3 {
    public static void main(String[] args){
        int n1=10;
        int n2=10;
        int n3=20;
        int n4=20;

        boolean result1 = n1 >= n2; //true
        boolean result2 = n3 > n4; //false

        System.out.println(result1 && result2); // 둘다 true여야 true
        System.out.println(result1 || result2); // 하나만 true여도 true

        System.out.println(true && true && false && true && true);//false
        System.out.println(n1>=n2 || n3<n4 || n1>n4); //true0
        //배치할때 && 에서 false가 나올확률이 높은걸 앞으로.
        // 나누기가 리소스 많이 잡아먹는다 --> 곱하기로 해결한다. 최적화가 좋다~
    }
}
