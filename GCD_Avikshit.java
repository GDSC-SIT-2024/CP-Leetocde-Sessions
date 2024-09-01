import java.util.Scanner;

class GCD 
{
    public static void main(String[] args) 
  {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = s.nextInt();
        int gcd = findGCD(n1, n2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int findGCD(int a, int b) 
  {
        while (b != 0) 
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
