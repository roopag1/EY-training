public class BufferString {
    public static void main(String[] args){

        BufferString bs = new BufferString();
        bs.append("009");

        bs.insert(0, "abc");

        System.out.println(bs);

        System.out.println(bs.capacity());

        String s1 = bs.toString();
    }
}
