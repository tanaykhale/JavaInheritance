package Alphabet;

public class Charmain {

	public static void main(String[] args) {
		CharList c=new CharList();
		String ch="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<ch.length();i++) {
			c.add(ch.charAt(i));
		}
		c.display();

	}

}
