class helloworld 
{ 
    //This program compares two integer arrays and returns the first occurence of  the entire seqence of arr[x] in arr[y]
    public static void main(String args[]) 
    { 
        
        int[] list1 = {1,3,6};
        int[] list2 = {1,3,5,6,12,1,1,17,1,3,6,9,1,3,6,1,1,3,6};
       
       if(list1 == null) {throw new IllegalArgumentException();}
       if(list2 == null) {throw new IllegalArgumentException();}

       if (list1.length == 0) { throw new IllegalArgumentException();}
   	   if (list2.length == 0) {throw new IllegalArgumentException();}
        int val = indexOf(list1,list2); 
        System.out.println("This is the first matching value for the sequence:" + val);
    } 

      

   public static int indexOf(int[] x, int[] y) {
   	  
   	   int sizeOfX = x.length;
   	   int sizeOfY = y.length;

   	 
   	   int found = 0;
       String sizeX = String.valueOf(sizeOfX);
       String sizeY = String.valueOf(sizeOfY);        
   	   System.out.println("This is the size of int[] list 1");
   	  
   	   System.out.println(sizeX);

   	   System.out.println("This is the size of int[] list 2");

       System.out.println(sizeY);


   	   for(int i = 0; i < sizeOfY; i++){
           
           //Stop comparing numbers if the index of the number plus the step count would exceed the maximum units in the list2 array
   	   	   if(i + sizeOfX > sizeOfY) {
   	   	   	break;
   	   	   }
           //System.out.println(y[i]);
           if (y[i] == x[0]) {
           	//System.out.println("Potential Match found");
            for(int j = 0; j < sizeOfX;j++) {
            	


            	//check for out of bounds
                if(i + j < sizeOfY) {
            	//System.out.println(y[i + j]);

                if(y[i + j] == x[j]) {

                	found = 1;
                	

                }
                else {
                	found = 0;
                	break;
                }
                        }

                  }
             if(found == 1) {
             	System.out.println("Found MATCH");
             	System.out.println("FOUND AT " + i);
             	return i; 
             }     

           }

        
        }
        //default return value is we don't find a match
        return -1;
   }
   


} 


