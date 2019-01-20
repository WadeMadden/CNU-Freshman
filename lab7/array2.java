public class array2
{
	public static void main(String [] args)
	{
		int	[]	x	=	{3,45,17,2,-1,44,9,23,67,2,-6,-23,-100,12,5,1212};
		int t = 0;
		
		System.out.println("");
		for	(int i=0;	i<x.length;	i++)
		{	
			System.out.print(x[i]+" ");
		}
		System.out.println("");
		
		for	(int e	:	x)
		{	System.out.print(e+" ");	}
		System.out.println("");
		
		int u = x.length-1;
		while(t<x.length)
		{	
			
			System.out.print(x[u]+" ");
			u--;
			t++;
		}
		System.out.println("");
		
		for	(int i=1;	i<x.length;	i=i+2)
		{	System.out.print(x[i]+" ");	}
		double p = 0;
		System.out.println("");
		for	(double e	:	x)
		{	
			double ans = 0;
			ans = ans + e;
			p = ans/x.length;
		}
		System.out.println("");
		System.out.println(p);
	}
}