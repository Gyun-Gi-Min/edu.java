package ch04;

public class ForStarTest {

    /*
    if star = 2
    ** **

    if star = 3
    ***
    ***
    ***

    if star = 4
    ****
    ****
    ****
    ****

    */
    public static void main(String[] args){
        int star = (int)(Math.random()*5)+2; // 2~6
        System.out.printf("star : %s",star);

        for(int i = 0; i<star; i++){
            System.out.println();
            for(int z=0; z<star; z++){
                System.out.print("*");

            }
            // 반복되는걸 안에.
        }
    }
}
