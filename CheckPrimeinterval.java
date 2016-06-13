import java.util.Scanner;
class CheckPrimeinterval {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the intervals");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
       for (int k=a;k<=b;k++)
       {
           count=0;
           for (int i = 1; i <= k / 2; i++) {
               if (k % i == 0)
                   count++;
           }

        if (count>1)
            System.out.println(k+" is not a prime number");
        else
            System.out.println(k+" is a prime number");
       }
    }
}