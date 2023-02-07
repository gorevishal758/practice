package operation;

import exception.ResultException;

public class TestCustomException{
	
	static void validate (int marks) throws ResultException{    
	       if(marks < 40){  
	  
	        // throw an object of user defined exception  
	        throw new ResultException("SORRY!!! Your failed..");    
	    }  
	       else {   
	        System.out.println("Congratulation Your passed !!!!!!!!");   
	        }   
	     }    

	

}
