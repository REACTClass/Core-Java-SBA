public class Sedan extends Car{
    int length;

    public Sedan(int speed, int length, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.length = length;
    }
    @Override public double getSalePrice() {
        if(length > 20) {
            return regularPrice - (super.getSalePrice() * .05);
        } else {
            return regularPrice - (super.getSalePrice() * .10);
        }
    }
}
