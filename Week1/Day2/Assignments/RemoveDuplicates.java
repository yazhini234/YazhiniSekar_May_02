package Day2;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		String test= "We learn java basics as part of java sessions in java week1";
		int count=1;
		String a[] = test.split(" ");
		 for(int i=0;i<a.length;i++) {
		
			  for(int j=i+1;j<a.length;j++) {
				
				    if(a[i].equals(a[j]))
				    {count++;
				    
				    if(count>1)
						  a[j]="";
				    }
				    
				}
			
			  System.out.println(a[i]);
		
			 }
				
				
	}

}
