//Program  to Display L Star pattern
class NewPattern{
	public static void main(String args[]) {
		for(int i = 0; i < 5; i++) //Loop for number of rows
		{ 
            System.out.printf("*");  
            for(int j=0;j<4;j++) // Loop for columns 
            { 
            	//Condition
                if(i == 4) 
                {  
                    System.out.printf("*"); //Displaying star 
                }
                else 
                	
                {  
                    System.out.printf(" "); 
                }  
            }  
            System.out.printf("\n"); //new line  
        }  
	}
}