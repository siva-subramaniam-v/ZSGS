public class XorSwap {
    public static void main(String args[]) {
      int a = 10;
      int b = 5;
      
      System.out.println("Before Swap\na = " + a + " b = " + b);
      
      a = a^b;
      b = b^a;
      a = b^a;
      
      System.out.println("\nAfter Swap\na = " + a + " b = " + b);
    }
}