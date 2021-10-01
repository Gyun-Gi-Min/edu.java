package ch04;

public class BreakExample2 {
    public static void main(String[] args){
      //이름을 갖게 된다.
        for(int i=0; i<10; i++){
            for(int z=100; z<110; z++){
                if(z == 103){break;}  //안쪽 for문 박살
                System.out.printf("%d - %d\n",i,z);
                //public static final java.io.PrintStream out
                //out은 상수지만 소문자로 쓴다.
                //final이 들어간 설명이면 상수!
            }
        }
        System.out.println("-------------------");
        OUT_FOR: //이름을 갖게 된다. 레이블(label)
        for(int i=0; i<10; i++){
            for(int z=100; z<110; z++){
                if(z == 103){break OUT_FOR;} //바깥쪽 for문 박살
                //continue OUT_FOR; 을 쓴다면 위에 식이랑 결과값이 같게 나온다.
                System.out.printf("%d - %d\n",i,z);
            }
        }
    }
}
