public class Ford extends Car{
    int year;
    int manufacturerDiscount;


    public Ford(int speed, int year, int manufacturerDiscount, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    @Override public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}
