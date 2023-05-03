package abstract_Demo;

abstract class Car {
   
    public abstract void driveCar();
        

    public void switchOnAC() {
        System.out.println("AC is on");
    }
}

class MarutiCar extends Car {

    @Override
    public void driveCar() {
        System.out.println("maruti drive car");
    }

}

class HyundaiCar extends Car {

    @Override
    public void driveCar() {
        System.out.println("hyundai based drive car");
    }
}


public class Abstractdemo {
    public static void main(String[] args) {
       
        Car obj = new MarutiCar();
        obj.driveCar();
        obj.switchOnAC();
}
}