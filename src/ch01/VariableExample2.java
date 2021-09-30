package ch01;

public class VariableExample2 {
    public static void main (String[] args){
        float f;
        double d;

        int n1;

        //n1=10.1;  //안됩니다~~


        f=(float)10.1; //실수에 d 생략 되어있음. 그래서 float쓰려면 f를 넣거나 (float)을 써주기.
        d=10.1D;

        double d2=f*f; //자동 형변환
        double d3=(double) f*f;
        //double d2=(double) (f*f); //타입이 같아야 계산이 됨. //자동형변환.

        //float f2=d*d; // 자동 형변환 안된다. double이 float보다 크니까..
        float f2=(float)(d*d); // 수동형변환 해줘야한다.
        float f3=(float)d*(float)d;
     }
}
