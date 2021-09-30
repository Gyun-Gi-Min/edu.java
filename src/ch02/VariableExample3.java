package ch02;

public class VariableExample3 {
    public static void main(String [] args){
        char c = 'A';
        System.out.printf("%c:%d/n",c,(int)c);

        int i =69;
        System.out.printf("%c:%d\n",(char)i,i);

        boolean bl= true;
        System.out.println(bl);
    }
}

//,boolean,
//byte <short< char,<int< long< float <double <String (이게 제일커서 자동변환)    이거 제외하고 다음전수
