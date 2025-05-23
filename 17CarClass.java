public class CarClass {
    String make,model; int year;
    void displayDetails(){System.out.println(make+" "+model+" "+year);}
    public static void main(String[] args) {
        CarClass car = new CarClass();
        car.make = "Toyota"; car.model = "Camry"; car.year = 2020;
        car.displayDetails();
    }
}
