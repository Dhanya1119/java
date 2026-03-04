class Marks
{
        int m = 100;
}
class Got_marks extends Marks
{ 
    int m = 88;
    
    void show()
    {
        System.out.println(m); // access the child variable
        System.out.println(super.m); //access the parent variable
    }
}
class P_A_V
{
    public static void main(String[] args)
    {
        Got_marks g = new Got_marks();
        g.show();
    }
}