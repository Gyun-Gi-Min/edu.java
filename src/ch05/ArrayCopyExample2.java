package ch05;

public class ArrayCopyExample2 {
    public static void main(String[] args) {
        int[] arr1={10,20,30,100};
        int[] arr2 = new int[arr1.length];
        System.out.println(arr1.hashCode());
        System.out.println(arr2.hashCode());

        //깊은 복사 (deep copy) 값을 복사하는것
        //객체를 만들어서 주소값이 다른 객체의 값만 가져와서 복사.
        System.out.println(arr1==arr2);

        for(int i = 0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }

        //시도

        for(int i=0; i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }

}
