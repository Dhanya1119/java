import java.util.Random;
class RandomMethods 
{
    public static void main(String args[])
    {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("nextInt:"+num);

        int a = r.nextInt(89);
        System.out.println("nextInt(n):"+a);

        float b = r.nextFloat();
        System.out.println("nextFloat:"+b);

        boolean c = r.nextBoolean();
        System.out.println("nextBoolean():"+c);

        long d = r.nextLong();
        System.out.println("nextLong():"+d);
    }
}
