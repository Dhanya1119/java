class Dhanya
{
    void girl()
    {
        String name = "Girl";
        System.out.println("Dhanya is a "+name);
    }
}
class Angry extends Dhanya
{
    void angry()
    {
        System.out.println("She is very angry");
    }
}
class Jealous extends Angry
{
    void jealous()
    {
        System.out.println("She is very jealous");
    }
}
class Naughty extends Jealous
{
    void naughty()
    {
        System.out.println("she is naughty girl");
    }
}
class M_Inherit
{
    public static void main(String[] args)
    {
        Naughty n = new Naughty();
        n.girl();
        n.angry();
        n.jealous();
        n.naughty();
    }
}