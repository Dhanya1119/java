import java.util.Scanner;
class large_three_num
{
    public static void main(String[] args)
    {
       // System.out.print("Enter three numbers:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q:find the largest of the three numbers
        int max = a;
        if (b > max)
        {
            max = b;
        }
        if (c > max)
        {
            max = c;
        }
        System.out.println(max);
    }
}