
package Problem_Solving;

public class Problem_Solving_02 {
    
    //sort the array
        
    
    public void sort(){
 
        
        int [] array = {1,0,4,12,3,2};
        
       
        for (int i = 0; i < array.length; i++) {

            for (int j = i+1; j < array.length; j++) {
                 int temp = array[i];
                if(array[i]>array[j]){
                 array[i] = array[j];
                 array[j]=temp;
                }
            }
            
            
             }
        for (int j = 0; j < array.length; j++) {
                System.out.println(array[j]);
            }
}
    
    
}
