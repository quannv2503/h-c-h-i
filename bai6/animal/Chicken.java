package bai6.animal;

import bai6.edible.Edible;

public  class  Chicken extends Animal implements Edible {
     @Override
     public String makeSound() {
         return "gâu gâu";
     }

     @Override
     public String howToEat() {
         return "ăn ngon qua";
     }
 }
