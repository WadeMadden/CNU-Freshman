package ArrayLists;
import java.util.ArrayList;
public class ArrayList2 {
	public static void deleteAtEven(ArrayList<String> list){
		for(int i = list.size()-1;i>=0;i--){
			if(i%2==0){
				list.remove(i);
			}
		}
	}
	public static void deleteDuplicates(ArrayList<String> list){
		ArrayList<String> unique = new ArrayList<String>();
		for(int i = 0;i<list.size();i++){
			String str = list.get(i);
			if(!unique.contains(str)){
				unique.add(str);
			}
		}
		list.clear();
		for(int i = 0;i<unique.size();i++){
			list.add(unique.get(i));
		}
	}
}
