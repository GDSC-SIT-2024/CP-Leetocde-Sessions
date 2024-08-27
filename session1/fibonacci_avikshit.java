import java.util.*;
class Fibonacci 
{
    Scanner s = new Scanner(System.in);
    public static int fibonacci(int n) 
{
        if (n <= 1) 
{
            return n; //Base case
} 
else 
{
            // Recursive case
            return fibonacci(n - 1) + fibonacci(n - 2);
        
}
}

    public static void main(String[] args) 
{
        int num;
        System.out.println("Input number of terms till which fibonacci series has to be printed - ");
        num=s.nextInt();
        System.out.println("Fibonacci Series up to " + num + " terms:");
        for (int i = 0; i < numTerms; i++) 
{
            System.out.print(fibonacci(i) + " ");
}
}
}
