import java.util.Scanner;

import javax.smartcardio.ATR;

public class q2 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter first number");
        int a = obj.nextInt();
        System.out.println("enter second number");
        int b = obj.nextInt();
        System.out.println("enter 1 for add and 2 for subtract");
        int c = obj.nextInt();
        try{
        if (c == 1)
        {
            number.Add(a, b);
        }else if (c ==2)
        {
            number.subtract(a, b);
        }
        }catch (Exception ArithmeticException)
        {
            System.out.println("exception handeled");
        }

    }
}

public class number
{
    static int Add(int a , int b)
    {
        if( a < 0 || b < 0)
        {
            throw new ArithmeticException("");
        }
        return a+b;
    }

    static int subtract(int a , int b)
    {
        if( a < 0 || b < 0)
        {
            throw new ArithmeticException("");
        }
        return a-b;
    }
}
