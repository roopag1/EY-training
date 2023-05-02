class B {
    public B() {
        System.out.println("constructor");
    }
    public void show() {
        System.out.println("in show method");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        new B().show(); 
        new B().show(); 
}
}
