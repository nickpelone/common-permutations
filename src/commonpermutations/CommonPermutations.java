/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commonpermutations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author nick
 */
public class CommonPermutations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] a_array;
        char[] b_array;
        boolean go = true;
        try{
            //setup
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            String a = inputReader.readLine();
            if(a.length() == 0){
                System.exit(0);
            }
            
            String b = inputReader.readLine();
            
            while(go == true){
                a_array = a.toCharArray();
                b_array = b.toCharArray();
                for(char x : a_array){
                    
                }
                
                    
                }
        
                
                
                //handle a blank line, reset, move back to what we have to do
            String finalTest = inputReader.readLine();
            if(finalTest.length() == 0){
                System.exit(0);
            }else{
               a = finalTest;
               b = inputReader.readLine();
            }
            }
        catch (IOException ioe){
            
        }
    }
}
