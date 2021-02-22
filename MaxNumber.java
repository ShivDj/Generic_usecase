package generic;

	import java.util.Arrays;

	public class MaxNumber {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			 int[]     arrayOfInteger= {10,20,30,40,50};
			 float[]   arrayOfFloat= {1f,1f,3f,9f};
		     double[]  arrayOfDouble= {1.1,1.2,1.3,1.4,3.8};
		     String[]  arrayOfString= { "Shiv","Singh","Pranil","Ankita876"};
		     
		     System.out.println("your array is of arrayOfInteger of type integer : ");
		     //print array a1
		     for(int i=0 ; i<arrayOfInteger.length ; i++) {
		    	
		    	 System.out.print(arrayOfInteger[i]+ " ");
		     }
		     
		     System.out.println();
		     System.out.println("your array is of type float : ");
		     //print array b1
		     for(int i=1 ; i<arrayOfFloat.length ; i++) {
		    	
		    	 System.out.print(arrayOfFloat[i]+ "  ");
		     }
		     
		     System.out.println();
		     System.out.println("your array is d1 of type double : ");
		     //print array d1
		     for(int i=1 ; i<arrayOfDouble.length ; i++) {
		    	
		    	 System.out.print(arrayOfDouble[i]+ "  ");
		     }
		     
		     System.out.println();
		     System.out.println("your array is d1 of type String type : ");
		     //print array s1
		     for(int i=1 ; i<arrayOfString.length ; i++) {
		    	
		    	 System.out.print(arrayOfString[i]+ "  ");
		     }
		     System.out.println();
		     System.out.println();
	         System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
              System.out.println();
	         //for finding the max value in array a1
	         int max=0;
	         for(int i=0 ;i<arrayOfInteger.length; i++)
	         {
	        	 if(arrayOfInteger[i]>max) {
	        		 max=arrayOfInteger[i];
	        	 }
	         }
	         System.out.println("maximum element in Integer array= "+max);
		    

		
		    //for finding the max value in array b1
	       float max1=0f;
	       for(int i=0 ;i<arrayOfFloat.length; i++)
	         {
	   	        if(arrayOfFloat[i]>max1) {
	   		       max1=arrayOfFloat[i];
	   	      }
	         }
	        System.out.println("maximum element in float array= "+max1);
	        
	        double max3=0.0;
	        
	        

	        for(int i=0 ;i<arrayOfDouble.length; i++)
	          {
	    	        if(arrayOfDouble[i]>max3) {
	    		       max3=arrayOfDouble[i];
	    	      }
	          }
	         System.out.println("maximum element in Double array=  "+max3);
	         
	         int max5 = 0;
	         String maxs=arrayOfString[0];
	         
	         
	       int stringlength=arrayOfString[0].length();
	   	  for(int i=0 ;i<arrayOfString.length; i++)
	             {
	   	        if(arrayOfString[i].length() > stringlength) {
	   		       max5=i;
	   		       stringlength=arrayOfString[i].length();
	   		       maxs=arrayOfString[i];
	   	      }
	         }
	       
	   	  System.out.println("maximum element in String array "+maxs+ " whose length is "+stringlength+ " unit");
	   	  
	   	  
	    }
	     
	   

	}

