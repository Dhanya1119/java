import java.util.Scanner;
public class nested_switch {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String dept = in.next();
        switch(empID){
            case 1:
                System.out.println("Dhanya");
                break;
            case 2:
                System.out.println("Krupa");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (dept){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "medical":
                        System.out.println("Medical department");
                        break;
                    default:
                        System.out.println("No Department entered");
                }
                break;
            default:
                System.out.println("Enter correct empID");
        }
    }
    
}
