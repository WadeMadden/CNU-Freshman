public class ArrayExamples
{
	public static void main(String [] args)
	{
		
		int [] a1 = {1,2,3,4};
		int [] b1= {4,3,2,1};
		int [] c1 = {1,2,3,4};
		
		int a = 2;
		int b = 3;
		int c = 3;
		System.out.println("This is the Swap integers section.");
		System.out.println(a+""+b);
		swapInts(a, b);//swap ints method call
		System.out.println(a+""+b);
		System.out.println("");
		System.out.println("This is the Swap Arrays section.");
		for(int i=0;i<a1.length;i++)//swap array section
		{
			System.out.print(a1[i]);
		}
			System.out.println("");
		for(int i=0;i<b1.length;i++)
		{
			System.out.print(b1[i]);
		}
		System.out.println("");
		swapIntArrays(a1, b1);
		System.out.println("");
			for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]);
		}
			System.out.println("");
		for(int i=0;i<b1.length;i++)
		{
			System.out.print(b1[i]);
		}
		System.out.println("");
		System.out.println("");
		System.out.println("This is the Replace less than section.");
		replaceLessThan(a1, c); //replaceLessThan method call
		System.out.println("");
		System.out.println("");
		System.out.println("This is the copy and replace less than section.");
		for(int i=0;i<c1.length;i++) //Copy and replace section
		{
			System.out.print(c1[i]);
		}
		System.out.println("");
		
		int [] happy = copyAndReplaceLessThan(c1,b);
		for(int i=0;i<happy.length;i++)
		{
			System.out.print(happy[i]);
		}
		System.out.println("");
		for(int i=0;i<c1.length;i++)
		{
			System.out.print(c1[i]);
		}
		
	}
	public static void swapInts(int a, int b) //swap ints method
	{
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a+""+b);
	}
	public static void swapIntArrays(int [] a1, int [] b1) //swap arrays method
	{
		int temp = 0;
		int newArray[] = new int[b1.length];
		
		for(int i=0;i<b1.length;i++)
		{
			newArray[i] = b1[i];
			b1[i] = a1[i];
			a1[i] = newArray[i];
		}
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]);
		}
			System.out.println("");
		for(int i=0;i<b1.length;i++)
		{
			System.out.print(b1[i]);
		}
		
		
	}
	public static void replaceLessThan(int []a, int b)//replace less than method
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<b)
			{
				a[i]=b;
			}
			System.out.print(a[i]);
		}
	}
	public static int [] copyAndReplaceLessThan(int[]a, int b) //copy and replace method
	{
		int Arraya[] = new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			Arraya[i] = a[i];
		}
		for(int i=0;i<Arraya.length;i++)
		{
			if(Arraya[i]<b)
			{
				Arraya[i]=b;
			}
			
		}
		return Arraya;
	}
}

