package ch06;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CalcTest {
    public static void main(String[] args) {
        String str = "10";
        int intStr = Integer.parseInt(str); // 외부에서 들어온것을 전수로 바꿔짐
        System.out.println(intStr+10);

        int result = StaticCalc.sum(10,20);
        System.out.println("static sum : " + result);


        Calc c = new Calc();
        c.n1 = 10;
        c.n2 = 20;

        int result2 = c.sum();
        System.out.println("instance sum : "+result2);

        int result3 =Calc.sum(10,20);
    }
}
