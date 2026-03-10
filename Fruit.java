import java.util.Scanner;
class Fruit
{
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        System.out.print("Enter fruit name:-");
        String fruit = f.next();
        switch(fruit)
        {
            case "Mango":
                System.out.println("King of the fruit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Please enter valid fruit name");
        }
    }
}