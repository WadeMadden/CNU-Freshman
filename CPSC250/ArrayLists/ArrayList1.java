package ArrayLists;
import java.util.ArrayList;
public class ArrayList1 {
	
	public static int countNames(ArrayList<String> list,String name){
		int count = 0;
		for(int i = 0;i<list.size();i++){
			String temp = list.get(i);
			if(temp.equals(name)){
				count++;
			}
		}
		return count;
	}
	public static ArrayList<String> getShorterThan(ArrayList<String> list, int length){
		ArrayList<String> newList = new ArrayList<String>();
//		for(int i = 0;i<list.size();i++){
//			String temp = list.get(i);
//			if(temp.length()<length){
//				newList.add(temp);
//			}
//		}
		for(String temp: list){
			if(temp.length()<length){
				newList.add(temp);
			}
		}
		return newList;
	}
}
