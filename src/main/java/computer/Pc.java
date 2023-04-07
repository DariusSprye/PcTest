package computer;

public class Pc {

    private Case case1;
    private Monitor monitor;
    private MotherBoard motherBoard;

    //parameterized constructor for Pc
    public Pc(Case case1, MotherBoard motherBoard, Monitor monitor){
        this.case1 = case1;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }

    //draw logo method
    private void drawLogo(){

    }

    //description method
    public void description(){
        System.out.println(
        "Welcome to worst buy below is the description of the pc on sale today"
        );
    }

    //power up method
    public void powerUp(){

    }
}
