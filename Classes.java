
class Car {
    String brand;
    String color;
    int year;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

public class Classes {
    public static void main(String[] args) {
        
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.color = "Red";
        car1.year = 2022;

      
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.color = "Blue";
        car2.year = 2021;

        
        System.out.println("Car 1 Details:");
        car1.displayDetails();

        System.out.println("\nCar 2 Details:");
        car2.displayDetails();
    }
}
