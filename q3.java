import java.util.Scanner;

public class q3 {
    public static void main(String args[]){
        try{
        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator();
        Calculator obj3 = new Calculator();
        Calculator obj4 = new Calculator();
        System.out.println("addition "+ obj1.addition());
        System.out.println("subtraction "+ obj2.subtraction());
        System.out.println("multiply "+ obj3.multiply());
        System.out.println("division "+ obj4.division());
        }
        catch(NumberFormatException e)
        {
            System.out.println("exception handeled");
        }
    }}


public class Calculator 
{
    int num1;
    int num2;
    Calculator()
    {
        System.out.println("enter Number1");
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        num1 = Integer.parseInt(str);
        System.out.println("enter Number2");
        str = obj.nextLine();
        num2 = Integer.parseInt(str);
        
    }
    public int addition() {  
        int ans = num1 + num2;
       return ans;
   }
   
    public int subtraction() { 
       int ans = num1 - num2;
       return ans;
   }
   
    public double division() {
       double ans = (double) num1 / num2;
       return ans;
   }
   
    public int multiply() {
       int ans = num1 * num2; 
       return ans;
   }


}