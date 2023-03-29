import java.util.*;
class meanmodemedian
{
    public static void main(String[]args)
    {
	int r,c;
	System.out.println("the row value is:"+r);
	System.out.println("the column value is:"+c);
	int one[r][c],sec[r][c],add[r][c];
	System.out.println("please enter the value for first matrix");
	for(int i=0;i<r;i++)
	{ 
	 for(int j=0;j<c;j++)
	 {
	 Scanner S=new Scanner(System.in);
         one[i]=S.nextInt();
	 Scanner S=new Scanner(System.in);
 	 one[j]=S.nextInt();
	 }
	}
	System.out.println("please enter the value for sceond matrix");
	for(int i=0;i<r;i++)
	{
	 for(int j=0;j<c;j++)
	 {
	 Scanner S=new Scanner(System.in);
         one[i]=S.nextInt();
	 Scanner S=new Scanner(System.in);
 	 one[j]=S.nextInt();
	 }
	}
     System.out.println("addition matrix");
	for(int i=0;i<r;i++)
	{
	 for(int j=0;j<c;j++)
	 {
	   add[i][j]=one[i][j]+sec[i][j];
	   System.out.println("addition matrix"+add[i][j]);
	 }
	}
    }
} 
