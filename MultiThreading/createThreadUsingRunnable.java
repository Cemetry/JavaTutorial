
package first;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;




public class First {


    
    public static void main(String[] args)   {
        
        mythread t1 = new mythread();
      Thread t2 = new Thread(t1);
      t2.start();//thread

    
    }
    
}

class mythread extends A implements Runnable
{
    public void run()
    {
        for(int i = 0;i<10;i++)
        {
            System.out.println("1");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class A 
{
    
}