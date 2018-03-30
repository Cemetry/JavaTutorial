
package first;

import java.util.Scanner;





public class First {


    
    public static void main(String[] args)  {
        //declaration and instantiation
int a[] = new int[3];
a[0] = 1;
a[1]=2;
a[2] = 200;
for(int i = 0; i<a.length;i++)
{
    System.out.println(a[i]);
}
//printing array with foreach
for(int x:a)
{
    System.out.println(x);
}
    }
    
}

