
package first;

import java.util.Scanner;




public class First {


  
    
    public static void main(String[] args)  {
int a[]={1,2,3};
int b[]={3,4,5};
min(a);
max(b);
    
    }
   
public static void min(int arr[])
{
    int min=arr[0];

    for(int i = 0; i<arr.length;i++)
        if(min>arr[i])
            min = arr[i];
   
   
    System.out.println("Minimum:"+min);
}

   public static void max(int arr[])
          
   {
           int max =arr[0];
            for(int i = 0; i<arr.length;i++)
        if(max<arr[i])
            max = arr[i];
             System.out.println("maximu:"+max);
   }
    
    
}


