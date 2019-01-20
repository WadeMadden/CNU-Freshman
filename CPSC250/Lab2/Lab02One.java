package Lab2;
import java.util.Arrays;
public class Lab02One {
	public static void main(String [] args){
		int arrayInt[] = new int[]{80,100,80,92,95,87,82,76,45,76,80,70};
		System.out.println("array : " + arrayToString( arrayInt ));
		System.out.println("sum : " + arraySum( arrayInt ));
		System.out.println("average: " + arrayAverage( arrayInt ));
		Arrays.sort( arrayInt );
		System.out.println("sorted : " + arrayToString( arrayInt ));
	}
	public static String arrayToString(int [] anArray){
		String newArray = Arrays.toString(anArray);
		return newArray;
	}
	public static int arraySum(int[] anArray){
		int sum = 0;
		
		for(int i =0;i<anArray.length;i++){
			sum+=anArray[i];
		}
		return sum;
	}
	public static double arrayAverage(int[] anArray){
		double avg = 0;
		double sum = 0;
		if(anArray.length==0)
		{
			return avg;
		}
		for(int i =0;i<anArray.length;i++){
			sum+=anArray[i];
		}
		avg = sum/anArray.length;
		return avg;
	}
}
