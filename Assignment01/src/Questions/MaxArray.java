package Questions;
//WAP to print maximum of n nos from array using lambda exp
import java.util.*;
interface I
{
	void show();
}
public class MaxArray {

	public static void main(String[] args) {
		/*I obj=()->
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter a length of array");
			int n=sc.nextInt();
			int a[]=new int[100];
			System.out.println("Enter elements are :");
			for(int i=1;i<=n;i++)
			{
				a[i]=sc.nextInt();
			}
			int max=a[1];
			for(int i=1;i<=n;i++)
			{
				if(max<a[i])
				{
					max=a[i];
				}
				
			}
			System.out.println("Max element in array is :"+max);
		};
		obj.show();
		*/
		int i;

		i = 0;
		while( i<10) {
		
		     i = i + 1;
		     if (i == 8) 
		          continue;
		     System.out.println("countinue:"+i);
		    
		}

	}

}
