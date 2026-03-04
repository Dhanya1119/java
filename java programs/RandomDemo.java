import java.util.Random;
class RandomDemo
{
    public static void main(String args[])
    {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println(num);
    }
}
