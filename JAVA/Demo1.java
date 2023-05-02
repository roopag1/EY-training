    class Book{
        Book() {
            super();
            System.out.println(" book constructor");
        }
    }
    
    
    class MathsBook extends Book {
        MathsBook() {
            super();
            System.out.println("math book constructor");
        }
    }
    
    
    
    public class Demo1 {
        
    
        public static void main(String[] args) {
    
            MathsBook mb = new MathsBook();
            
        }
}
