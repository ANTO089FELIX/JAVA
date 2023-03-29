import java.util.*;
class meanmodemedian
{
    public static void main(String[]args)
    {
        int a[7]{16,18,27,16,23,21,19},sum=0,avg;
        System.out.println("the value size"+a[7]);
        for(int i=0;i<=7;i++)
 	 {
	   sum=sum+a[i];
	   avg=sum/a[7];
	   avg=avg.intfloat(sytem.in);	
	   System.out.println("the mean value is:"+avg);
	 }
int maxVal=0, count=0, maxCount=0;
         for(i=0;i<7;i++) 
          {
           count = 0;
           for(j=0;j<7;j++) 
 	    {
             if(arr[i]==arr[j])
	       {
                count++;
               }
            }
             if (count > maxCount)
	       {
                maxCount = count;
                maxVal = a[i];
               }
         }
	System.out.println("the mode max value is:"+maxvalue);
	System.out.println("the mode max count is:"+maxcount);
int asc=200,t;
	for(int i=0;i<=7;i++)
 	 {
	  if(a[i]<asc)
	   {
	    asc=arr[i];
	   }
	 }
	t=((7+1)/2);
	   System.out.println("the median value is:"+t);
	 }
      
    }
}
