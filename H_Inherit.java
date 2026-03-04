class Humans
{
    void display()
    {
        System.out.println("Human characterstics");
        System.out.println("Eating");
        System.out.println("Walking");
        System.out.println("Creativity");
        System.out.println("Thinking");
        System.out.println("Creating new things");
    }
}
class Dhanya extends Humans
{
  
}
class Prince extends Humans
{

}
class H_Inherit
{
    public static void main(String[] args)
    {
        Dhanya d = new Dhanya();
        Prince p = new Prince();

        d.display();
        p.display();
    }
}