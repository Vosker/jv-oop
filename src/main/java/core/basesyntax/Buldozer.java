package core.basesyntax;

public class Buldozer extends Machine {

    public Buldozer(String brand, int yearOfProduction, int carMileage) {
        super(brand, yearOfProduction, carMileage);
    }

    void test(){
        brand = "Mercedes";
        yearOfProduction = 1965;
        carMileage = 1213;
    }
    @Override
    void doWork() {
        System.out.println("Buldozer starts working");
    }

    void stopWork() {
        System.out.println("Buldozer stops working");
    }
}
