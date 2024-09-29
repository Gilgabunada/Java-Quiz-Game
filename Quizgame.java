import java.util.*;

public class Quizgame {
    static Scanner sc = new Scanner(System.in); 
    static int attempt;
    static String name;
    
    public static void main(String[] args)
    {
        MySecondQuizgame MyObject2 = new MySecondQuizgame();
        clearscreen();
        System.out.print("\n\t  _____________________________________________________________________________________________________________");
	    System.out.print("\n\n\t                                 ''Welcome to the Java Quiz Game!");
	    System.out.print("\n\t  This program is designed to test your knowledge of the Java programming language in a fun and interactive way");
	    System.out.print("\n\t                         Whether you're a beginner or an advanced programmer,");
	    System.out.print("\n\t  this quiz game is an excellent way to challenge yourself and improve your Java programming skills.''");
	    System.out.print("\n\t  _____________________________________________________________________________________________________________");
	    System.out.print("\n\n\t                                      NAME: ");
        name = sc.nextLine();
        
        MyObject2.start();
        
    }


public void totalscore()
{
    MySecondQuizgame MyObject2 = new MySecondQuizgame();
    Easy Easy = new Easy();
    Normal Normal = new Normal();
    Hard Hard = new Hard();
    clearscreen();
    int total;
    String choice;
    total = Easy.score + Normal.score + Hard.score;
    
    if(total == 30)
    {
        attempt++;
        clearscreen();
        System.out.print("\n\n\t\tCONGRATULATION, " + name + " YOU HAVE DEMONSTRATED EXEPTIONAL PROFINCIENCY WITH JUST " + attempt +" ATTEMTPS.");
        System.out.print("\n\n\n\t\t                      PRESS ANY BUTTON TO CONTINUE");
        System.out.print("\n\n\t\t                                   : ");
        choice = sc.nextLine();
        MyObject2.start();
    }
    else
    {
        clearscreen();
        System.out.print("\n\n\t''SUCCESS IS NOT FINAL, FAILURE IS NOT FATAL: IT IS THE COURAGE TO CONTINUE THAT COUNTS''");
        System.out.print("\n\n\t                                                                    - Winston Churchill");
        System.out.print("\n\n\n\t I APOLOGIZE," + name + ". YOUR PERFORMANCE ON QUIZ GAME YIELDED A SCORE OF " + total +" OUT OF 30.");
        System.out.print("\n\n\t\t\t\t             PRESS 'R' TO RETAKE");
        System.out.print("\n\t\t\t\t           PRESS 'M' TO RETURN MENU");
        System.out.print("\n\n\t\t\t\t                     : ");
        
        while(true)
        {
            choice = sc.nextLine();
            if(choice.equalsIgnoreCase("R"))
            {
                attempt++;
                if(attempt == 5 )
                {
                    clearscreen();
                    System.out.print("\n\n\n\t\t\t        YOU HAVE REACHED THE MAXIMUM NUMBER OF ATTEMPTS");
                    System.out.print("\n\n\t\t\t                   PRESS ANY BUTTON TO CONTINUE");
                    System.out.print("\n\t\t\t                                :");
                    choice = sc.nextLine();
                    main();
                }
                Easy.easy();
                break;
            }
            else if(choice.equalsIgnoreCase("M"))
            {
                MyObject2.start();
                break;
            }
            else
            {
                clearscreen();
                System.out.print("\n\n\t''SUCCESS IS NOT FINAL, FAILURE IS NOT FATAL: IT IS THE COURAGE TO CONTINUE THAT COUNTS''");
                System.out.print("\n\n\t                                                                    - Winston Churchill");
                System.out.print("\n\n\n\t I APOLOGIZE, " + name + ". YOUR PERFORMANCE ON QUIZ GAME YIELDED A SCORE OF " + total +" OUT OF 30.");
                System.out.print("\n\n\t\t\t\t             PRESS 'R' TO RETAKE");
                System.out.print("\n\t\t\t\t           PRESS 'M' TO RETURN MENU");
                System.out.print("\n\n\t\t\t\t                     : "); 
            }
        }
    }
}
    

    public void main()
    {
        MySecondQuizgame MyObject2 = new MySecondQuizgame();
        clearscreen();
        System.out.print("\n  _____________________________________________________________________________________________________________");
    	System.out.print("\n\n                                 ''Welcome to the Java Quiz Game!");
    	System.out.print("\n  This program is designed to test your knowledge of the Java programming language in a fun and interactive way");
    	System.out.print("\n                         Whether you're a beginner or an advanced programmer,");
    	System.out.print("\n  this quiz game is an excellent way to challenge yourself and improve your Java programming skills.''");
    	System.out.print("\n  _____________________________________________________________________________________________________________");
    	System.out.print("\n\n                                      NAME: ");
        name = sc.nextLine();
        MyObject2.start(); 
    }
    
    static void clearscreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}