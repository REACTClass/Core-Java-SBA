public class Truck extends Car {
   int weight;

   public Truck(int speed, double regularPrice, String color, int weight) {
      super(speed, regularPrice, color);
      this.weight = weight;
   }


   @Override public double getSalePrice() {
      if(weight > 2000) {
         return regularPrice - (super.getSalePrice() * .10);
      } else {
         return regularPrice - (super.getSalePrice() * .20);
      }
   }
}

