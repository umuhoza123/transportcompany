/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportcompany.system;

import java.util.Scanner;

/**
 *
 * @author brand
 */
public class TransportcompanySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // System.out.println() ==>   display valuee in double quoutation
        System.out.println("                    Welcome to our transport company");
        System.out.println("\n");
        System.out.println("Enter your name");
        // scanner used to store value   and we create value that store that value  e.g: name
         Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.print("============================================="); 
        System.out.println("\n");
        // we can display store value by used concatenation(+)  WHEN WE HAVE ANOTHER WORD THAT  YOU WANT TO DISPAY 
        // AND DISPLAYED BY PASSED THE NAME THAT STORE THOSE VALUE
        System.out.println("Dear " + name);
          int ch;
  
           do{
            System.out.println("enter CHOOOSE WHERE TO GO ");
            //  System.out.println("\n"); USED TO DISPLAY  SPACE BETWEEN TWO LINE
            System.out.println("\n");
            System.out.println(" 1. muhanga \n 2. kamonyi \n 3.RUHANGO \n "
                    + "4. HUYE\n 0. Exit");
       System.out.println("Plz "+" "+name+ "Enter your choice ");
        System.out.println("\n");
       //ch=sc.nextInt(); STORE VALUE OF YOUR CHOICE 
     ch=sc.nextInt();
      System.out.println("\n");
      // DISPLAYED CHOICE ACCORDING TO CHOICE YOU MADE OR ACCORDING TO WHICH MOVEMENT DO YOU WANT TO MADE
      
       switch(ch){
           
           case 1:
               System.out.println("amount of payment in muhanaga is 1200");
                System.out.println("\n");
               break;
           case 2:
               System.out.println("amount of payment in kamonyi is 600");
                System.out.println("\n");
               break;
           case 3:
              System.out.println("amount of payment in Ruhango is 1800");
               break;
           case 4:
               System.out.println("amount of payment in huye is 3200");
               break;
           default:
               System.out.println("Wrong Choice!!");
               break;
           case 0:
               System.exit(0);
               System.out.println("Thank you!"+" "+name);
               break;
               
       }
      
     
        }while(ch!=0&&ch!=1&&ch!=2&&ch!=3&&ch!=0);
        
     System.out.print("=============================================");  
     System.out.println("\n");
     System.out.print("PAY AMOUNT THAT IS NEED FOR THIS TRAVEL");
       System.out.println("\n");
     Scanner sca=new Scanner(System.in);
         int am =sca.nextInt();
         
// call OTHER MEHOD THAT COMMES FROM ANOTHER CLASS CALLED PASSENGER 
passenger one= new passenger(); 
        one.payment(am);
        

     
    }
      
      // TODO code application logic here
    }
    

