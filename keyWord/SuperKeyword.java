package keyWord;

class Vehicle{           //super class
    int maxSpeed = 120;
}
class Car extends Vehicle {
    int maxSpeed = 100;
}
  class main{
   public static void main (String [] args){
        Car c = new Car();
        System.out.println(c.maxSpeed);
    }
  }


