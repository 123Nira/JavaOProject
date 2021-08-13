public class App {
    public static void main(String[] args) {
        Machine sc=new Machine();
        sc.Start();
        sc.Stop();
        Car sc1=new Car();
        sc1.Start();
        sc1.wipeWindShield();
        sc1.showInfo();
    }
}
