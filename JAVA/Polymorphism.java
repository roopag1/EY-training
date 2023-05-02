
    
 class Sample {
    public  void show() {
        System.out.println("show method in P1");
    }
}

class Demo extends Sample {
    public void show() {
        System.out.println("show method in P2");
    }
}

public class Polymorphism {
   
   public static void main(String[] args) {
        Sample p = new Demo();
        p.show();

        

        Demo p1 = (Demo)p;

         int num = 19;
        num = 21;
        System.out.println(num);

        Integer i1 = num;
        int num1 = i1; 
        Integer i = Integer.parseInt("10");
   }
}

