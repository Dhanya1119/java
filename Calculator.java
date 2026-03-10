import java.util.Scanner;
class Calculator{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        int ans = 0;
        while(true)
        {
            System.out.println("Enter the Operator:");
            char op = n.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
                System.out.print("Enter the number:");
                int num1 = n.nextInt();
                int num2 = n.nextInt();
            
                if (op == '+')
                {
                    ans = num1+num2;
                }
                if (op == '-')
                {
                    ans = num1 - num2;
                }
                if (op == '*')
                {
                    ans = num1 * num2;
                }
                if (op == '/')
                {
                    if(num2!=0)
                    {
                        ans = num1 / num2;
                    }
                }
                if (op == '%')
                {
                    ans = num1 % num2;
                }
            }
            else if (op == 'X' || op == 'x')
            {
                break;
            }
            else
            {
                System.out.println("Invalid");
            }
            System.out.println(ans);
        }
    }
}