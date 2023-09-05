package palin;
import java.util.Scanner;
class Reuse {

    public static int numb;

    public void reuse(Scanner scanner) {
        try {
            System.out.println("ENTER NUMBER");
            numb = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("enter valid number");
            reuse(scanner);
        }
    }
}
class Reverse {
    int rev =0;
    int rem = 0;
    public int rev(int numb) {
        int n = Reuse.numb;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
    return rev;
    }
}
class PalindromeCheck {
    public void check(int a, int b) {
        if (a == b) {
            System.out.println(b + " is palindrome" + a);
        } else
            System.out.println(b + " is not palindrome"+a);
    }
}
class IsPalindrome {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        Reuse obj = new Reuse();
        obj.reuse(scanner);
        scanner.close();
        Reverse obj1 = new Reverse();
        PalindromeCheck obj2 = new PalindromeCheck();
        obj2.check(obj1.rev(Reuse.numb),Reuse.numb);
    }
}
