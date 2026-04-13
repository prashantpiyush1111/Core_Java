public class MutablevsImmutablestring {
	public static void main(String[] args) 
	{
		String name="HII";
		name=name+"HYY";
		System.out.println("hello"+name);
		
		String s1="HII";
		String s2="HII";
		
		System.out.println(s1==s2);	
		
	}
}