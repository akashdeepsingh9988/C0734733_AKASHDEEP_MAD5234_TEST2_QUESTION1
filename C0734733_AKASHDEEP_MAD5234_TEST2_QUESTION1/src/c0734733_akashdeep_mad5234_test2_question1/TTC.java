package c0734733_akashdeep_mad5234_test2_question1;

/*
 * STUDENT NAME : AKASHDEEP SINGH
 * STUDENT #ID : C0734733
 */

import java.util.Arrays;

/**
 *
 * @author Akashdeep Singh
 */
public class TTC {
  
    
    public double calculateTotal(String[] from, String[] to)
    {
        // one way trip zone 1 
        if((from[0] ==  "Don Mills" && to[0] == "Leslie") || (from[0] ==  "Leslie" && to[0] == "Don Mills"))
        {
            return 2.50;
        }
        
        // one way trip zone 2
        else if((from[0] ==  "Finch" && to[0] == "Sheppered") || (from[0] ==  "Sheppered" && to[0] == "Finch"))
        {
            return 3.00;
        }
     
       
        
        return 0.0;
    }
    
    
}


