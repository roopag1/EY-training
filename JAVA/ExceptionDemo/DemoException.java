package ExceptionDemo;

class Demo {

    public void test() {
        System.out.println("pqexs");
    }
}
public class DemoException {
    public static void main(String[] args)  {
        int a = 50;
        int b = 0;

        
        Demo d = new Demo();

        // d = null;
        int arr[] = new int[10];

        try
        {
         // b = a/0;
         // arr[11] = 9;
          d.test();
        }

        catch(ArithmeticException e) {
            System.out.println("arithmeticexception handled............."+e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(" arrayindexoutofboundsexception  handled............."+ e);
        }
        catch(NullPointerException e) {
            System.out.println(" nullpointerexception HANDLED........"+ e);
        }
        catch(Exception e) {
            System.out.println("exception handled"+e);
        }
        finally {
            System.out.println("xyz");
        }       
    }
}