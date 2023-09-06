package pettamagotchi_demo_g3;
//SuperClass: Pet (Parent Class)
public class Pet {
    private String name;
    private int age;
    private String colour;
    private int hunger; //Scale: 0 (full) to 5 (starving)
    private int happiness; //Scale: 0 (unhappy) to 10 (ecstatic)
    private int tiredness; //Scale: 0 (rested) to 10 (exhausted)
    private boolean isClean; //Indicates if the pet is clean or dirty
 
    //parameterized constructor to initialize the above fields for any instance of a pet object
    //as well as any child object created
    //Below represents the parent fields that all child classes will inherit
    public Pet(String name, int age, String colour, int hunger, int happiness, int tiredness, boolean isClean) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.hunger = hunger;
        this.happiness = happiness;
        this.tiredness = tiredness;
        this.isClean = isClean;
    }

    
    //Feed the pet if the pet's hunger level is below 2 & hunger scale is between 0 & 5
    public void feed(){
    if(hunger<2){
            System.out.println(name + " is being fed. ");
               hunger=0; //change the status of hunger level after pet has been fed 
    } else{
            System.out.println(name + " doesn't need to be fed right now. ");
    }
    }
    
    //Put the pet to sleep if tiredness level & hunger level are both at 8 & happiness level is below level 4
    public void sleep(){
    if(tiredness == 8 &&  hunger ==3 && happiness < 4){
            System.out.println(name + " is going to sleep.");
            tiredness = 0; 
            hunger = 0;
}else{
            System.out.println(name + " doesn't want to sleep right now. ");
}
    }
    //Give the pet a bath to make it clean
    public void bath(){
    if(!isClean){
            System.out.println(name + " is taking a bath. ");
            isClean = true;
    }else{
        System.out.println(name + " is already clean. ");
    }
    }
    
    //Display all the pet's levels for hunger, happiness, tiredness & cleanliness
    public void printStatus(){
        System.out.println("Hunger Level: " + hunger);
        System.out.println("Happiness Level: " + happiness);
        System.out.println("Tiredness Level: " + tiredness);
        System.out.println("Is Clean: " + isClean);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getTiredness() {
        return tiredness;
    }

    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    public boolean isIsClean() {
        return isClean;
    }

    public void setIsClean(boolean isClean) {
        this.isClean = isClean;
    }
    
    
}
