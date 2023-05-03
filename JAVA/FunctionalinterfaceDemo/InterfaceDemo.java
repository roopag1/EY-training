package FunctionalinterfaceDemo;

interface Demo{
    int display(int i,int j);
}

public class InterfaceDemo {
   public static void main(String[] args) {

  Demo p1 = new Demo()
{
    public int display(int i, int j) {
            return i+j;
    }
};
Demo p2 = (int i, int j) ->  i+j;
int res = p1.display(10, 34 );
System.out.println(res);
int res1 = p2.display(9, 1 );
System.out.println(res1);

}
}
   

