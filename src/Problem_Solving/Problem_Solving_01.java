package Problem_Solving;

public class Problem_Solving_01 {

    //جمع على شكل اكس 
    public void re (){
    
    int arry [][] ={ {8,7,8},
                         {8,2,8},
                         {10,7,9}
                       };  
        
        int resul1 =0;
        int resul2 =0;
        
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
                
               resul1 =  arry[0][0] +  arry[1][1] + arry[2][2] ;
               resul2 =  arry[0][2] +  arry[1][1] + arry[2][0] ;
            }
            
        }
        
        System.out.println("sum result1 = "+resul1);
        System.out.println("sum result2 = "+resul2);
        
        if (resul1 > resul2) 
            
           System.out.println("result1 beger "); 
        
        
        else
        System.out.println("result2 beger "); 
       
        
    }
    
}
