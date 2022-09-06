public class OddOrEven {
    
    static void oddOrEven (int number) {
        if ((number & 1) == 0) // even number & 1 equals 0
            System.out.println(number + " is even");
        else                  // odd number & 1 equals 1
            System.out.println(number + " is odd");
    }
    
    public static void main(String args[]) {
      int a = 10;
      int b = 5;
      
      oddOrEven(a);
      oddOrEven(b);
    }
}