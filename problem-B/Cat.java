public class Cat extends Animal implements Pet {    
    private String catName;
    public Cat(){        
        this("");
    }
    public Cat(String name) {
        super(4);        
        catName = name;
    }
    @Override    
    public String getName() {
       return catName;    
    }
    @Override
    public void setName(String name) {        
        String setName = name;
    }
    @Override
    public void play() {        
        System.out.println("Cat play");
    }
    @Override
    public void eat() {        
        System.out.println("Cat eat ");
    }
}
