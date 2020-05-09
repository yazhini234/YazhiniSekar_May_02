package Day2;

public class ReverseEvenwords {
	public static void main(String[] args) {
		
		String test="I am a software tester";
		String a[]= test.split(" ");
		String rev="";
		for(int i=0;i<a.length;i++)
		{if(i%2==0)
		{
			rev= rev.concat(" ");
			rev=rev.concat(a[i]);
			
		}
		else
		{
			rev=rev.concat(" ");
		 char [] b=a[i].toCharArray();
		 for(int j=b.length-1;j>=0;j--)
			 rev=rev.concat(String.valueOf(b[j]));
			
			
		}
			
		}
		
		System.out.println(rev);
			
		
	}

}
