package sample;
import java.util.*;
public class MinMax1
{
    public void y()
    {
    
    int n,a[],i,min,max;
    Scanner num=new Scanner(System.in);
    System.out.println("enter the array size");
    n=num.nextInt();
    a=new int[n];
    System.out.println("enter the array elements");
    for(i=0;i<n;i++)
        a[i]=num.nextInt();
        min=max=a[0];
for(i=1;i<n;i++){
    if(a[i]>max)
    max=a[i];
    if(a[i]<min)
    min=a[i];
}
System.out.println("MAX is"+max);
System.out.println("MIN is"+min);
    }
}
