// print numbers from i to n
import java.util.Scanner;
public class loops_2 {
    public static void main(String[] args)
    {
        System.out.print("Enter the number:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int num = 1; num<=n; num++){
            System.out.println(num+" ");
        }
    }
    
}
