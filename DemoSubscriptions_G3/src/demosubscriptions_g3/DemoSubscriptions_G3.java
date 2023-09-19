package demosubscriptions_g3;
public class DemoSubscriptions_G3 {

    public static void main(String[] args) {
//create 2 objects for each of the child classes
//use the objects to test the setAddress validation

PhysicalNewspaperSubscription pnsGood = new PhysicalNewspaperSubscription();
PhysicalNewspaperSubscription pnsBad = new PhysicalNewspaperSubscription();

OnlineNewspaperSubscription onsGood = new OnlineNewspaperSubscription();
OnlineNewspaperSubscription onsBad = new OnlineNewspaperSubscription();

pnsGood.setName("Joe Blog");
pnsGood.setAddress("23 Oak Avenue");
display(pnsGood);

pnsBad.setName("Jake the Pirate");
pnsBad.setAddress("The Ocean");
display(pnsBad);

onsGood.setName("Carter");
onsGood.setAddress("carter@gamil.com");
display(onsGood);

onsBad.setName("Mike");
onsBad.setAddress("mike-gmail.com");
display(onsBad);
    }
    
    //this is an example of Static Binding (early binding) 
    public static void display(NewspaperSubscription name) //Subclass Objects are being passed through as the method parameter
    {
            System.out.println("Name: " + name.getName());
            System.out.println("Address: " + name.getAddress());
            System.out.println("Rate: " + name.getRate());
            System.out.println();
    }
}
