package ch07;

public class TelevisionTest {
    public static void main(String[] args) {
         Televition tv =new Televition();
         RemoteControl rc = tv; // 자동 형변환
         // rc.volumeState(); // 호출할 수 없다.
         tv.volumeState();

         for(int i=0; i<100; i++){
             tv.volumeUp();
         }
        tv.volumeState();
        for(int i=0; i<100; i++){
            tv.volumeDown();
        }

         tv.volumeState();
    }
}
