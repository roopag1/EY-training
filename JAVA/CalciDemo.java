import com.demo.core.Calci;
public class CalciDemo {

    public static void main(String[] args) {
        Calci c1 = new Calci();
        System.out.println(c1.add(15,5,2));
        System.out.println(c1.sub(15,5,2));
      

   
   
            AdvanceCalci ac = new AdvanceCalci();
        System.out.println(ac.mul(15,5,2));
        System.out.println(ac.div(15,5));
        System.out.println(c1.sub(12,5,3));
        
       ac.display();
        
    }
}
