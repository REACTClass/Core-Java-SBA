public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(80,15, 20000, "metallic grey");
        Ford ford1 = new Ford(70,2015, 1500,  15000, "black");
        Ford ford2 = new Ford(70,2018, 2000,  20000, "red");
        Car car = new Car(60, 15000, "Black");
        Truck truck = new Truck(60,50000, "green",6000);

        System.out.println("Sedan On Sale For $" + sedan.getSalePrice());
        System.out.println("Ford1 On Sale For $" + ford1.getSalePrice());
        System.out.println("Ford2 On Sale For $" + ford2.getSalePrice());
        System.out.println("Car On Sale For $" + car.getSalePrice());
        System.out.println("Truck On Sale For $" + truck.getSalePrice());
    }
}
