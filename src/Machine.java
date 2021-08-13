public class Machine {
    protected String name="This 1st type MWF";
    protected int x=34;
    final int y;
    {
        y = 55;
    }
    public void Start(){
        System.out.println("Machine is Start");
    }
    public void Stop(){
        System.out.println("Machine is Stop "+y);
    }
}
