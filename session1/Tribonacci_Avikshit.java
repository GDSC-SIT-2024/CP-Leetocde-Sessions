import java.util.Scanner;

class Tribonacci 
{
    public static void main(String[] args) 
   {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the position (n) for the Tribonacci number: ");
        int n = s.nextInt();
        int result = tribonacci(n);
        System.out.println("The " + n + "th Tribonacci number is: " + result);
    }

    public static int tribonacci(int n) 
    {
        if (n == 0) 
        return 0;
        if (n == 1 || n == 2) 
        return 1;
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }
}
