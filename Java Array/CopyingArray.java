
package first;

import java.util.Scanner;





public class First {


    
    public static void main(String[] args)  {

      
       char[]copyfrom ={'t','a','s','e','b','a'};
       char []copyto = new char[4];
       System.arraycopy(copyfrom, 2, copyto ,0, 4);
       System.out.println(new String(copyto));
       
       char[]copyfro = {'t','a','n','i'};
               char []copyt= new char[2];
System.arraycopy(copyfro, 0, copyt, 0, 2);
System.out.println(new String(copyt));
               
    }
    
}


