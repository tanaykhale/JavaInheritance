package apps;
import java.util.*;
import java.util.Map.Entry;

public class Practice {
	public static void main(String args[]) {
		 Map<String,Integer> list=new HashMap<>();
	        list.put("I",1);
	        list.put("V",5);
	        list.put("X",10);
	        list.put("L",50);
	        list.put("C",100);
	        list.put("D",500);
	        list.put("M",1000);
	        list.put("IV",4);
	        list.put("IX",9);
	        list.put("XL",40);
	        list.put("XC",90);
	        list.put("CD",400);
	        list.put("CM",900);
		String s = "MCMXCIV";
        List<String> list2 = new ArrayList<>();
       // list2.add(s.substring(i, Math.min(i + 2, s.length()))); // Add substring directly to the list
        List<String> com=new ArrayList<>();
        Set <Entry<String,Integer>> set=list.entrySet();
        for(int i=0;i<s.length();i++) {
        	String a=s.substring(i, Math.min(i + 2, s.length()));
        	for(Entry<String,Integer> val:set) {
        		if(val.getKey()==a) {
        			list2.add(a);
        		}
        		else {
        			list2.add(Character.toString(a.charAt(0)));
        			list2.add(Character.toString(a.charAt(1)));
        		}
        	}
        }
        System.out.println(list2);
}
}