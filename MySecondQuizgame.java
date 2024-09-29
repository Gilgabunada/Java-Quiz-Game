import java.util.*;

public class MySecondQuizgame
{
    static Scanner sc = new Scanner(System.in); 
    static MySecondQuizgame game = new MySecondQuizgame();
        static String choice;
        static Quizgame MyObject = new Quizgame();
        static Easy Easy = new Easy();
        static Normal Normal = new Normal();
        static Hard Hard = new Hard();
        
        public static void quit()
        {
            clearscreen();
            System.out.print("\n\n\t\t\t\t   ARE YOU SURE YOU WANT TO QUIT?");
            System.out.print("\n\n\t\t\t\t\t PRESS 'Y' FOR YES");
            System.out.print("\n\n\t\t\t\t\t PRESS 'N' FOR NO");
            System.out.print("\n\n\t\t\t\t\t       :");
                    
            while(true){
                choice = sc.nextLine();
                if(choice.equalsIgnoreCase("Y"))
                {
                    clearscreen();
                    System.out.print("\n\n\t\t\t\t\t   THANK YOU ");
                    System.exit(0);
                }
                else if(choice.equalsIgnoreCase("N"))
                {
                    game.start();
                break;
            }
            else
            {
                clearscreen();
                System.out.print("\n\n\t\t\t\t   ARE YOU SURE YOU WANT TO QUIT?");
                System.out.print("\n\n\t\t\t\t\t PRESS 'Y' FOR YES");
                System.out.print("\n\n\t\t\t\t\t PRESS 'N' FOR NO");
                System.out.print("\n\n\t\t\t\t\t       :");
            }
        }
    }    

    static void help()
    {
        clearscreen();
        System.out.print("\n\t\t           ''THIS GAME IS FOR PROJECT PURPOSES ONLY'' ");
        System.out.print("\n\t\t______________________________________________________________");
        System.out.print("\n\t\t          PREPARED BY: GABUNADA, GUELBERT G. JR   BSCPE 1");
        System.out.print("\n\t\t______________________________________________________________");
        System.out.print("\n\n\t\t              ANSWER ALL THE QUESTIONS CORRECTLY");
        System.out.print("\n\n\t\t        THERE ARE 3 DIFFICULTY MODES EASY, NORMAL, HARD  ");
        System.out.print("\n\t\t         YOU CAN START IN ANY OF THE 3 DIFFICULTY MODES\n\t\t  IN ORDER TO WIN THE GAME ANSWER ALL QUESTIONS IN ALL MODES");
        System.out.print("\n\t\t         A GREEN RESPONSE MEANS YOUR ANSWER IS ACCURATE, \n\t\tWHILE A RED RESPONSE INDICATES THAT YOUR ANSWER IS INCORRECT");
        System.out.print("\n\t\t\t          MAXIMUM OF 5 ATTEMPTS");
        System.out.print("\n\t\t_____________________________________________________________");
        System.out.print("\n\n\t\t                 PRESS 'M' TO RETURN MENU");
        System.out.print("\n\t\t                    PRESS 'Q' TO QUIT");
        System.out.print("\n\t\t\t\t\t  : ");
            
        while(true)
        {
            
            choice = sc.nextLine();
            if(choice.equalsIgnoreCase("M"))
            {
            game.start();
                break;
            }
            else if(choice.equalsIgnoreCase("Q"))
            {
                quit();
                break;
            }
            else
            {
                clearscreen();
                System.out.print("\n\t\t           ''THIS GAME IS FOR PROJECT PURPOSES ONLY'' ");
                System.out.print("\n\t\t______________________________________________________________");
                System.out.print("\n\t\t          PREPARED BY: GABUNADA, GUELBERT G. JR   BSCPE 1");
                System.out.print("\n\t\t______________________________________________________________");
                System.out.print("\n\n\t\t              ANSWER ALL THE QUESTIONS CORRECTLY");
                System.out.print("\n\n\t\t        THERE ARE 3 DIFFICULTY MODES EASY, NORMAL, HARD  ");
                System.out.print("\n\t\t         YOU CAN START IN ANY OF THE 3 DIFFICULTY MODES\n\t\t  IN ORDER TO WIN THE GAME ANSWER ALL QUESTIONS IN ALL MODES");
                System.out.print("\n\t\t         A GREEN RESPONSE MEANS YOUR ANSWER IS ACCURATE, \n\t\tWHILE A RED RESPONSE INDICATES THAT YOUR ANSWER IS INCORRECT");
                System.out.print("\n\t\t\t          MAXIMUM OF 5 ATTEMPTS");
                System.out.print("\n\t\t_____________________________________________________________");
                System.out.print("\n\n\t\t                 PRESS 'M' TO RETURN MENU");
                System.out.print("\n\t\t\t\t\t  :");
            }
        }
    }

    static void difficulty()
    {
        clearscreen();
        System.out.print("\n\n\n\t\t\t\t  Press 'E' for [EASY]");
        System.out.print("\n\n\t\t\t\t  Press 'N' for [NORMAL]");
        System.out.print("\n\n\t\t\t\t  Press 'H' for [HARD]");
        System.out.print("\n\n\n\t\t\t\t       Mode: ");
        while(true)
        {
            choice = sc.nextLine();
            if(choice.equalsIgnoreCase("E"))
            {
                Easy.easy();
                break;
            }
            else if(choice.equalsIgnoreCase("N"))
            {
                Normal.normal();
                break;
            }
            else if(choice.equalsIgnoreCase("H"))
            {
                Hard.hard();
                break;
            }
            else
            {
                clearscreen();
                System.out.print("\n\n\n\t\t\t\t   Press 'E' for [EASY]");
                System.out.print("\n\n\t\t\t\t   Press 'N' for [NORMAL]");
                System.out.print("\n\n\t\t\t\t   Press 'H' for [HARD]");
                System.out.print("\n\n\n\t\t\t\t       Mode: ");
            }
        }
    }    
    
    
    void start()
    {
        
        clearscreen();
        System.out.print("\n\n\n\t\t\t\t      Press 'S' to START");
        System.out.print("\n\t\t\t\t   Press 'I' for INSTRUCTION");
        System.out.print("\n\t\t\t\t      Press 'Q' to Quit");
        System.out.print("\n\n\t\t\t\t\t : ");
        
        while(true)
        {
            choice = sc.nextLine();
            if(choice.equalsIgnoreCase("S"))
            {
                difficulty();
                break;
            }
            else if (choice.equalsIgnoreCase("I"))
            {
                help();
                break;
            }
            else if (choice.equalsIgnoreCase("Q"))
            {
                quit();
                break;
            }
            else
            {
                clearscreen();
                System.out.print("\n\n\n\t\t\t\t      Press 'S' to START");
                System.out.print("\n\t\t\t\t   Press 'I' for INSTRUCTION");
                System.out.print("\n\t\t\t\t      Press 'Q' to Quit");
                System.out.print("\n\n\t\t\t\t\t : ");
            }
        }
    }
    
    static void clearscreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}