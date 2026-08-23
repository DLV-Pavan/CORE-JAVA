package Strings;

public class stringbuffer {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		sb.append("java");
		System.out.println(sb);
		sb.append("developer");
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.length());
		
		System.out.println(sb.insert(0, "core"));
		
		String s ="java";
		s.concat("developer");
		System.out.println(s);
		
		//capacity
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("core java");
	    System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		//delete
		System.out.println(sb1);
		System.out.println(sb1.delete(2, 5));//cojava
		//setcharAt()
		
		sb1.setCharAt(1, 'k');
		System.out.println(sb1);
	}
}
