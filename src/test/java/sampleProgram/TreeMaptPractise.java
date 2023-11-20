package sampleProgram;
import java.util.TreeMap;
public class TreeMaptPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <String , String> map = new TreeMap<String , String>();
		
		map.put("chennai", "Tamilnadu");
		map.put("villupuram", "Tamilnadu");
		map.put("madurai", "Tamilnadu");
		map.put("trichy", "Tamilnadu");
		map.put("salem", "Tamilnadu");
		System.out.println(map);
		System.out.println("All key : " + map.keySet());
		System.out.println("All value : " + map.values());
		
		

	}

}
