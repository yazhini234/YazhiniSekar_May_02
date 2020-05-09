package Day1;

public class Fibonacci {
	public static void main(String[] args) {
		int sum=0;
		int first=0;
		int next=1;
		for(int range=0;range<8;range++)
		{ 
			System.out.println(first);
			sum=first+next;
			first=next;
			next=sum;
			
		}
		
		
	}

}
