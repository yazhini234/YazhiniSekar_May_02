package Day2;

public class ChangeOddIndexToUpperCase {

  public static void main(String[] args) {
	String test= "change me";
	char []arr =test.toCharArray();
	for(int i=1;i<arr.length;i++)
	{if(i%2!=0)
		arr[i]=Character.toUpperCase(arr[i]);
	}
	
	System.out.println(arr);
	  
	 
}


}
