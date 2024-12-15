public class thread3 {

    public static void main(String[] args) {
        Runnable r = ()->System.out.println("IAm new from java ");
        Thread t = new Thread(r);
        t.start();
        System.out.println(t.isAlive());
    }
    
}
