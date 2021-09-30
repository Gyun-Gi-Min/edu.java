package ch04;

public class BreakExample2 {
    public static void main(String[] args){
      //이름을 갖게 된다.
        for(int i=0; i<10; i++){
            for(int z=100; z<110; z++){
                if(z == 103){break;}  //안쪽 for문 박살
                System.out.printf("%d - %d\n",i,z);
            }
        }
        System.out.println("-------------------");
        OUT_FOR: //이름을 갖게 된다.
        for(int i=0; i<10; i++){
            for(int z=100; z<110; z++){
                if(z == 103){break OUT_FOR;} //바깥쪽 for문 박살
                System.out.printf("%d - %d\n",i,z);
            }
        }
    }
}
