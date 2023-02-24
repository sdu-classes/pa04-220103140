package Practice4ProblemB;
public class Fish extends Animal implements Pet {    public Fish(){
        super(0);    }
    private String fishName;
    protected Fish(int legs) {
        super(legs);    }
    @Override
    public String getName() {        return fishName;
    }
    @Override    public void setName(String name) {
        fishName = name;
    }
    @Override    public void play() {
        System.out.println("Fish play");
    }    @Override
    public void walk() {        System.out.println("no legs");
    }
    @Override    public void eat() {
        System.out.println("Fish eat ");
    }}
