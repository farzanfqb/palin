package palin;
import java.util.Scanner;
class Reuse {

    public static int numb;

    public void reuse() {
        try {
            System.out.println("ENTER NUMBER");
            Scanner num = new Scanner(System.in);
            numb = num.nextInt();
        } catch (Exception e) {
            System.out.println("enter valid number");
            reuse();
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
        Reuse obj = new Reuse();
        obj.reuse();
        Reverse obj1 = new Reverse();
        PalindromeCheck obj2 = new PalindromeCheck();
        obj2.check(obj1.rev(Reuse.numb),Reuse.numb);
    }
}
