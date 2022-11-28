import java.util.Scanner;

import javax.smartcardio.ATR;

public class q1 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter first number");
        int a = obj.nextInt();
        System.out.println("enter second number");
        int b = obj.nextInt();
        System.out.println("enter 1 for multiplication and 2 for division");
        int c = obj.nextInt();
        try{
        if (c == 1)
        {
            number.multiply(a, b);
        }else if (c ==2)
        {
            number.Divison(a, b);
        }
        }catch (ArithmeticException e)
        {
            System.out.println("exception handeled");
        }

    }
}

public class number
{
    static float Divison(int a , int b)
    {
        if( a == 0 || b == 0)
        {
            throw new ArithmeticException("0/0 ");
        }
        return (float)a/b;
    }

    static float multiply(int a , int b)
    {
        if( a == 0 || b == 0)
        {
            throw new ArithmeticException("0*0");
        }
        return (float)a*b;
    }
}
