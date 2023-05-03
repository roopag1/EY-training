package interfaceDemo;


interface ProcessorVendor {
    void chipDetails();
}

interface Machine extends ProcessorVendor,Vendor {
    void code();
}


interface Vendor {
    void vendorDetails();
}

class Desktop implements Machine, Vendor {
    public void code() {
        System.out.println("code --->compile -->execute --> Desktop");
    }

    @Override
    public void vendorDetails() {
        throw new UnsupportedOperationException("Unimplemented method 'vendorDetails'");
    }

    @Override
    public void chipDetails() {
        throw new UnsupportedOperationException("Unimplemented method 'chipDetails'");
    }
}

class Laptop implements Machine {
    public void code() {
        System.out.println("code --->compile -->execute --> Laptop");
    }
}

class Programmer {
    public void buildApp(Machine machine) {
       machine.code();
    }

}

public class InterfaceSample {
    
    public static void main(String[] args) {
        Machine m = new Laptop();

        Machine m1 = new Desktop();

        Programmer p = new Programmer();
        p.buildApp(m);
    }
}
