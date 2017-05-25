import java.util.*;



public class DuplicateElimination {

	   public static void main(String []args){
	         
		   Scanner input = new Scanner(System.in);
	             
		   		 int[] numList = new int[5];
	             int newValue;
	             boolean invalid, invalid2;
	             
	             
	          
	             
	             for (int i = 0; i <=numList.length; i++){
	      
	            	 
	            	 
	            	 
	            	 do{
	            	 
	            	    
	            		 
	            		System.out.print("Please enter number");
                        System.out.println(" ");
                        newValue = input.nextInt();
                        
                      // This index will prevent the arrayIndexexception
                      int index = 0; 
                      
                      //This will search through the Array. While i is greater than the current index and the numList[index] is != to the input the index will raise.
                      //This will only run when int i in the loop is greater than index. so it will do at least one loop allowing me to populate the array with at least 1 value.
                      while (index < i && numList[index] != newValue) {
                       //This will increase the index after it compares
                    	  index++;
                     }
                     
                     invalid = index < i; //True
                       
                        
                      if(newValue < 10 || newValue > 100){
                    	  
                    	  do{
                    		  
                    		  System.out.print("Invalid number, Please enter a number between 10 and 100");
                        	  newValue = input.nextInt();
                        	  invalid2 = newValue < 10 || newValue > 100;
                        	  
                    	  }while(invalid2);
                    	  
                    	
                      
                      	}
                      	else if(invalid){
                      		System.out.println("That number was entered already try again ");
                      		invalid = true;
                      	}
	            	 
	            	 }while(invalid);
	            	 
	            	 insertIntoArray(numList, i, newValue);
	            	 printArray(numList);
                      
	                 
	            }
	            
	            
	     }
	     
	  
	   
	   
	   
	   
	   
	   public static void printArray(int[] list){
	           
	          for(int i = 0; i < list.length; i++){
	                
	        	     System.out.print(list[i] + " ");
	           }
	         
	     }
	     
	     public static void insertIntoArray(int[] array, int insertIndex, int newValue){

	         
	              
	    	 //insert new value
	              array[insertIndex] = newValue;
	      } 
	     
	     
	    }


