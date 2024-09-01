import java.util.Scanner;

class LCM 
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = scanner.nextInt();

        int lcm = findLCM(n1, n2);

        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);
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

    public static int findLCM(int a, int b) 
    {
        return (a * b) / findGCD(a, b);
    }
}
