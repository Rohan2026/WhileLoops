public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        int i = 0;
        while (i < 15)
        {
            System.out.println("i is " + i + " and still less than 10");
            i++;
        }
        int k = 9;
        while (k > 5)
        {
            System.out.println("k is " + k + " and still greater than 5");
            k = k - 1;
        }
        while (a < 10 && b <=20)
        {
            System.out.println("a is " + a + " and still less than 10"); 
            System.out.println(" b is " + b + " and still less that or equal to 20");
            a++;
            b++;
        }
        System.out.println("Hello World!");
    }
    
    
    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}