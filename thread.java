class a implements Runnable {
    public void run()
    {
        System.out.println("hello ashraf");
    }
}
public class thread{
    public static void main(String[] args){
        a g = new a();
        g.run();
    
    }
}