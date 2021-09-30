package ch04;

public class ForTest3 {
    public static void main(String[] args){
        //구구단 찍을겨 2~9
        int name = 10;   //매직넘버엔 이름 지정해주자.
        for(int i =2; i<=name; i++){
            if(i>2){System.out.println("---------------------");}


            for(int z=1; z<=name; z++){
                System.out.printf("%d X %d = %d\n",i,z,i*z);
            }
        }   //if(i<9){ System.out.println("---------------------");}
    }
}
