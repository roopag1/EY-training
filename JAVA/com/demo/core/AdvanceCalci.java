public class AdvanceCalci extends Calci {
    public int mul(int n1, int n2,int n3) {
        return n1*n2*n3;
    }

    public int div(int n1, int n2) {
        return n1/n2;
    }

    // override
    public void display() {
        System.out.println("in AdvanceCalculator ");
    }
}
