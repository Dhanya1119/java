// Implementation of thread using thread class
class CSE extends Thread
{
   public void run()
    {
        for(int i = 1; i <=5 ; i++){
        System.out.println("Thread one is running");
        }
    }
}
class Rgukt{
    public static void main(String args[]){
        CSE t1 = new CSE();
        t1.start();
    }
}