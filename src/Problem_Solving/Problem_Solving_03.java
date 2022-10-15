
package Problem_Solving;



public class Problem_Solving_03{
    
    //بحث في المصفوفة اذا موجود عناصر متتكررة
    public void search_same(){
        
    int[] array = {1, 2, 7, 4, 13, 1, 5,9};
        boolean b=true;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    b = false;
                }
                
                    
            }
        }
        
        System.out.println(b);
    }
    
}
