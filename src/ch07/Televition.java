package ch07;

public class Televition implements RemoteControl{
    private  int volume;

    @Override
    public void turnOn() {
        System.out.println("티비를 켜다");
    }

    @Override
    public void turnOff() {

    }

    @Override
    public void volumeUp() {
            if(volume<MAX_VOLUME)
            {volume++;}
    }

    @Override
    public void volumeDown() {
        if(volume>MIN_VOLUME){
        volume--;}
    }
    public void volumeState() {
        System.out.println("Volume : "+volume);
    }
}

