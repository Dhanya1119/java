import java.util.Scanner;
public class Week {
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the number to get know the weekday or weekend");
        int num = n.nextInt();
        switch(num){
            case 1,2,3,4,5 -> System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
        }

    }
    
}
