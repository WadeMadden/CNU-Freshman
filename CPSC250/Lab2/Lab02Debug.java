package Lab2;

public class Lab02Debug {
	
	public static int findMaximum(int[] anArray) {
		int result = Integer.MIN_VALUE;
		
		for (int i = 0; i < anArray.length; i++) {
			if(anArray[i]>result)
			{
				result = anArray[i];
			}
			
			
		}
		return result;
	}
}