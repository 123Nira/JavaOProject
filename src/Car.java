public class Car extends Machine{
    @Override
    public void Start(){
        System.out.println("Car is start");
    }
    public void wipeWindShield() {
        System.out.println("Wiping windshield");
    }
    public void showInfo(){
        System.out.println("Car name :"+name+x);
    }
}
