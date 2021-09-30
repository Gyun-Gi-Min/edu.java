package ch01;

public class VariableTest {
    public static void  main(String[] args){
        //1. 정수는 실수를 저장할수없다
        //2. 작은 타입에서 큰 타입으로는 자동형변환이 이뤄진다.,(물론 수동도된다,)
        //3. 큰타입에서 작은타입으로는 자동형변환이 안 된다.(무조건 수동으로 해야한다)

        int n1 = 10;

        int n2 = 3;

        double result=(double) n1/n2;
        System.out.println("결과:" + result);
    }
}
