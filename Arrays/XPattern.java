import java.util.Scanner;

class XPattern {
    static void pattern (String word) {
        for (int i=0; i<word.length(); i++) {
            for (int j=0; j<word.length(); j++) {
                if (j == i)
                    System.out.print(word.charAt(i));
                else if (j == (word.length()-1 - i))
                System.out.print(word.charAt(j));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = input.next();
        input.close();
        
        System.out.println();
        if (str.length() %2 != 0)
            pattern(str);
        else
            System.out.print(0);
    }
}