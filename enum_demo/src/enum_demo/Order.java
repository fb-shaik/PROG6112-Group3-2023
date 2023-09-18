/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enum_demo;
    class Order {
        Enum_demo.Size pizzaSize; //pizzaSize is a variable of the Size type. It can only be assigned with 4 values.

            public Order(Enum_demo.Size pizzaSize) {
              this.pizzaSize = pizzaSize;
                }
    }