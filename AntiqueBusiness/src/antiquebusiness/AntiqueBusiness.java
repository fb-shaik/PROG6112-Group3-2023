/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antiquebusiness;
public class AntiqueBusiness {
    public static void main(String[] args) {
        // Creating two objects of ItemSold class
        ItemSold item1 = new ItemSold();
        item1.setInvoiceNumber(101);
        item1.setDescription("Vintage Vase");
        item1.setPrice(150.0);

        ItemSold item2 = new ItemSold();
        item2.setInvoiceNumber(102);
        item2.setDescription("Antique Clock");
        item2.setPrice(300.0);

        // Creating two objects of LampSold class
        LampSold lamp1 = new LampSold();
        lamp1.setInvoiceNumber(201);
        lamp1.setDescription("Brass Table Lamp");
        lamp1.setPrice(200.0);
        lamp1.setCondition(true);
        lamp1.setAge(50);

        LampSold lamp2 = new LampSold();
        lamp2.setInvoiceNumber(202);
        lamp2.setDescription("Stained Glass Floor Lamp");
        lamp2.setPrice(400.0);
        lamp2.setCondition(false);
        lamp2.setAge(80);

        // Displaying information about the items
        System.out.println("Item 1: " + item1.getDescription() + ", Price: $" + item1.getPrice());
        System.out.println("Item 2: " + item2.getDescription() + ", Price: $" + item2.getPrice());

        System.out.println("Lamp 1: " + lamp1.getDescription() + ", Price: $" + lamp1.getPrice() +
                           ", Condition: " + (lamp1.isCondition() ? "Good" : "Damaged") + ", Age: " + lamp1.getAge() + " years");
        System.out.println("Lamp 2: " + lamp2.getDescription() + ", Price: $" + lamp2.getPrice() +
                           ", Condition: " + (lamp2.isCondition() ? "Good" : "Damaged") + ", Age: " + lamp2.getAge() + " years");
    }
}