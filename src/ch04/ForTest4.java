package ch04;

public class ForTest4 {
    public static void main(String[] args){
        //뒤가 고정     단이 2~9까지가면 바뀜
        //고정되어있는게 바깥 바뀌는게 안.

        int dan = 10;  //매직넘버로 바꿔준다.
        int num = 10;

        for(int z=1; z<num; z++) {
            for (int i = 2; i < dan; i++) {
                System.out.printf("%d X %d = %d\t",i,z,i*z);
            }
            System.out.println();
        }
    }
}
