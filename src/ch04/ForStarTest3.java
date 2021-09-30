package ch04;

public class ForStarTest3 {
    public static void main(String[] agrs){
        int star = (int)(Math.random()*5)+2; //2~6
        System.out.println("star : "+star);

        for(int i = 0; i<star; i++){
            for(int z = 0; z<star; z++){
                System.out.print("_");
                for(int s=0; s<=z; s++){
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
