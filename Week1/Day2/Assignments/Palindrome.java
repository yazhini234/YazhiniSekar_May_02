package Day2;

public class Palindrome {
 public static void main(String[] args) {
	
	String test ="madam";
	String rev="";
	char []a= test.toCharArray();
	for(int i=a.length-1;i>=0;i--)
	{
		rev= rev.concat(String.valueOf(a[i]));
	}
	
	
	if(rev.equals(test))
		System.out.println("its Palindrome");
	else
		System.out.println("its not a palindrome");
	

}
}
