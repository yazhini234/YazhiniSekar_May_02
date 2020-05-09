package Day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int input=13;
		boolean flag=false;
		int i=1;
		while(i<=input/2)
			{if(input%i!=0)
				{flag=true;
				break;
				}
			i++;
			}
		if(flag == true)
			System.out.println("input is  an prime number");
		else
			System.out.println("input is not prime number");
		
	}

}
