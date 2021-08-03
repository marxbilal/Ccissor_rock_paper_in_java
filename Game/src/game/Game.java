package game;
import java.util.Scanner;
/**
 *
 * @author BILAWAL ALI
 */
public class Game {

   
    public static void main(String[] args) {
        // TODO code application logic here

                Scanner sc=new Scanner(System.in);
               System.out.println("Welcome to Scissor, Rock , Paper Game ");
               int computer =(int)(Math.random()*3+1);
               System.out.println("Enter your choice As Scissor-1, Rock-2 and paper-3");
               System.out.println("To exit the game write any number greater than 3 or less than 1");
               int me;
               do{
                    me=sc.nextInt();
                    
               
               

               if(computer==1&&me==1)
                System.out.println("The computer is Scissor. You are Scissor too. It is a draw.");

               else if(computer==1&&me==2)
                 System.out.println("The Computer is Scissor. You are Rock. You Won!");

               else if(computer==1&&me==3)
                  System.out.println("The Computer is Scissor. You are Paper. Computer Won.");

               else if(computer==2&&me==1)
                  System.out.println("The computer is Rock. You are Scissor. Computer won.");

               else if(computer==2&&me==2)
                  System.out.println("The computer is Rock. You are Rock.  It is a draw.");

               else if(computer==2&&me==3)
                   System.out.println("The computer is Rock. You are paper. You won.");

               else if(computer==3&&me==1)
                   System.out.println("The computer is Paper. You are Scissor. You Won.");

               else if(computer==3&&me==2)
                   System.out.println("The computer is Paper. You are rock. Computer won.");

               else if(computer==3&&me==3)
                   System.out.println("The Computer is paper. You are paper. It is a draw.");
               
               }while(me<4 &&  me>0);
               System.out.println("Game Ended! We hope you enjoyed It");


              }
}











