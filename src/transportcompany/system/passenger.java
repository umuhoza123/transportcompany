/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportcompany.system;

/**
 *
 * @author brand
 */
public class passenger {
    
    
    public int Id;
    public String name;
    public int am;
    public String place;
    
    public void payment(int am){
        
           if (am == 3200){
        System.out.println("thank for being with us  ");  
        System.out.println("safe journey  in Huye ");
        }
         else  if (am == 1800){
        System.out.println("thank for being with us  "); 
        System.out.println("safe journey  in muhanga ");
        }
         else  if (am == 600){
        System.out.println("thank for being with us  "); 
        System.out.println("safe journey  in kamonyi ");
        }
        else  if (am == 1200){
        System.out.println("thank for being with us  "); 
        System.out.println("safe journey  in muhanga ");
        }
        else {
           
            System.err.println("insufficient amount");
            System.err.println("PLEASE VERIFY AMOUNT THAT IS NEED FOR YOUR TRAVEL");
            System.err.println("Try again");
            
        }
    }
    

}
