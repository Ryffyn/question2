
public class Main {

	public static void main(String[] args) {
	
		brainReads("misspellings","msispeillgns");
	}
	
	
	
	public static boolean brainReads(String x, String y) {
		char[] arrayX = x.toCharArray();
		char[] arrayY = y.toCharArray();
		int count1=0, count2=0;
		
		  if(arrayX[0] == arrayY[0] && arrayX.length == arrayY.length ) {
					
			  
			  for (int i = 0; i < arrayX.length; i++) {
			        if (arrayX[i] == arrayY[i]) { count1++; }else {count2++;  }
			    }
			  
			  
			  if(count2 <= (arrayX.length/3)*2 ) {
				  System.out.println("The word is part-permutation");
				  return true;
				  } else{
					  System.out.println("not equal");
				  return false;
				  		}
		  }else {
			  System.out.println("not equal");
			  return false;
		  }
	      
		 
	}

}
