import java.util.ArrayList;
import java.util.List;


public class Fibonacci {
	
	public static void main(String[] args){
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		for( int i = 1 ; i < list.size(); i++ ){
			list.add(list.get(i) + list.get(i-1));
			System.out.println(list.get(i));
			System.out.println( list.get(i)%2 == 0 ? "even" : "odd");
			if (i == 20) break;
		}
		
	}

}
