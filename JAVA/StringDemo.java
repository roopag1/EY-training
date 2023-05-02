public class StringDemo {
    public static void main(String[]args){

        
        String n =" roopa ";
        System.out.println(n.hashCode());


        n=n+"123";
        System.out.println(n.hashCode());


        String s1 = new String("apple");
        String s2 = new String("apple");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = "apple";
        String s4 = "apple";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        String s5 = new String("apple");
        String s6 = new String("banana");
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));


        System.out.println( s1.charAt(3));
        System.out.println( s1.substring(4));


    }
}
    
