//Example 1 multidimensional Array
package first;

import java.util.Scanner;





public class First {


    
    public static void main(String[] args)  {
 //multidimensioanl array 
 int a[][] = new int[2][2];
 a[0][0] =1;
 a[0][1] = 2;
 a[1][0] =3;
 a[1][1] = 4;
 for(int i = 0; i<a.length;i++)
 {
     for(int j = 0 ;j<a.length;j++)
     {
         System.out.print(a[i][j]+" ");
         
      
     }
       System.out.println(""); 
 }
    }
    
}

//Example 2 for two dimensional array


package first;

import java.util.Scanner;





public class First {


    
    public static void main(String[] args)  {

        //2d array
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0 ; i<a.length;i++)
        {
            for(int j = 0 ;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
               System.out.println();
        }
     
    }
    
}




