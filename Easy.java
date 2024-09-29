import java.util.*;
import java.util.Random;

public class Easy
{
    int score = 0;
    public int easy() 
    {
        MySecondQuizgame MyObject2 = new MySecondQuizgame();
        String choice;
        Normal Normal = new Normal();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int j , temp, i;
        int[] Easy = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
        Random rand = new Random();
        clearscreen();
        
        for(i = 0; i < 10; i++)
        {
            j = rand.nextInt(i + 1);
            temp = Easy[i];
            Easy[i] = Easy[j];
            Easy[j] = temp;
        }
        for(i = 0; i < 10; i++ )
        {
            try
            {
                Thread.sleep(1000); 
            } 
            catch (InterruptedException e) {}
            
            switch(Easy[i])
            {
                case 1:
                    clearscreen();
                    System.out.print("\t\t\t\t        EASY MODE");
                    System.out.print("\n\n\t\t\t\t When was Java first released? ");
                    System.out.print("\n\n\t\t\t\t a.) 1993  \n\n\t\t\t\t b.) 1997 \n\n\t\t\t\t c.) 1991 \n\n\t\t\t\t d.) 1995");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t When was Java first released? ");
                            System.out.print("\n\n\t\t\t\t a.) 1993");
                            System.out.print("\n\n\t\t\t\t b.) 1997");
                            System.out.print("\n\n\t\t\t\t c.) 1991");
                            System.out.print("\033[0;32m\n\n\t\t\t\t d.) 1995\033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t When was Java first released? ");
                            System.out.print("\n\n\t\t\t\t a.) 1993");
                            System.out.print("\n\n\t\t\t\t b.) 1997");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) 1991\033[0m");
                            System.out.print("\n\n\t\t\t\t d.) 1995");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t When was Java first released? ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t a.) 1993\033[0m");
                            System.out.print("\n\n\t\t\t\t b.) 1997");
                            System.out.print("\n\n\t\t\t\t c.) 1991");
                            System.out.print("\n\n\t\t\t\t d.) 1995");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t When was Java first released? ");
                            System.out.print("\n\n\t\t\t\t a.) 1993");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) 1997\033[0m");
                            System.out.print("\n\n\t\t\t\t c.) 1991");
                            System.out.print("\n\n\t\t\t\t d.) 1995");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t When was Java first released? ");
                            System.out.print("\n\n\t\t\t\t a.) 1993  \n\n\t\t\t\t b.) 1997 \n\n\t\t\t\t c.) 1991 \n\n\t\t\t\t d.) 1995");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 2:
                    clearscreen();
                    System.out.print("\t\t\t\t        EASY MODE");
                    System.out.print("\n\n\t\t\t\t Who created Java?");
                    System.out.print("\n\n\t\t\t\t a.) Bill Gates \n\n\t\t\t\t b.) Linus Torvalds \n\n\t\t\t\t c.) James Gosling \n\n\t\t\t\t d.) Steve Jobs");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Who created Java?");
                            System.out.print("\n\n\t\t\t\t a.) Bill Gates");
                            System.out.print("\n\n\t\t\t\t b.) Linus Torvalds");
                            System.out.print("\033[0;32m\n\n\t\t\t\t c.) James Gosling\033[0m");
                            System.out.print("\n\n\t\t\t\t d.) Steve Jobs");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Who created Java?");
                            System.out.print("\n\n\t\t\t\t a.) Bill Gates ");
                            System.out.print("\n\n\t\t\t\t b.) Linus Torvalds ");
                            System.out.print("\n\n\t\t\t\t c.) James Gosling ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) Steve Jobs \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Who created Java?");
                            System.out.print("\033[0;31m\n\n\t\t\t\t a.) Bill Gates \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) Linus Torvalds");
                            System.out.print("\n\n\t\t\t\t c.) James Gosling");
                            System.out.print("\n\n\t\t\t\t d.) Steve Jobs");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        } 
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Who created Java?");
                            System.out.print("\n\n\t\t\t\t a.) Bill Gates");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) Linus Torvalds \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) James Gosling ");
                            System.out.print("\n\n\t\t\t\t d.) Steve Jobs");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Who created Java?");
                            System.out.print("\n\n\t\t\t\t a.) Bill Gates b.) Linus Torvalds \n\n\t\t\t\t c.) James Gosling \n\n\t\t\t\t d.) Steve Jobs");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 3:
                    clearscreen();
                    System.out.print("\t\t\t\t        EASY MODE");
                    System.out.print("\n\n\t\t\t\t Which company originally developed Java?");
                    System.out.print("\n\n\t\t\t\t a.) Sun Microsystems \n\n\t\t\t\t b.) Microsoft \n\n\t\t\t\t c.) Apple \n\n\t\t\t\t d.) IBM");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which company originally developed Java?");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) Sun Microsystems\033[0m");
                            System.out.print("\n\n\t\t\t\t b.) Microsoft");
                            System.out.print("\n\n\t\t\t\t c.) Apple");
                            System.out.print("\n\n\t\t\t\t d.) IBM");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which company originally developed Java?");
                            System.out.print("\n\n\t\t\t\t a.) Sun Microsystems");
                            System.out.print("\n\n\t\t\t\t b.) Microsoft");
                            System.out.print("\n\n\t\t\t\t c.) Apple ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) IBM \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which company originally developed Java?");
                            System.out.print("\n\n\t\t\t\t a.) Sun Microsystems");
                            System.out.print("\n\n\t\t\t\t b.) Microsoft ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) Apple \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) IBM ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break; 
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which company originally developed Java?");
                            System.out.print("\n\n\t\t\t\t a.) Sun Microsystems");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) Microsoft ");
                            System.out.print("\n\n\t\t\t\t c.) Apple");
                            System.out.print("\n\n\t\t\t\t d.) IBM");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which company originally developed Java?");
                            System.out.print("\n\n\t\t\t\t a.) Sun Microsystems \n\n\t\t\t\t b.) Microsoft \n\n\t\t\t\t c.) Apple \n\n\t\t\t\t d.) IBM");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 4:
                    clearscreen();
                    System.out.print("\t\t\t\t        EASY MODE");
                    System.out.print("\n\n\t\t\t\t What was the original name of Java?");
                    System.out.print("\n\n\t\t\t\t a.) Oak  \n\n\t\t\t\t b.) Maple \n\n\t\t\t\t c.) Cedar \n\n\t\t\t\t d.) Pine");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t What was the original name of Java?");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) Oak \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) Maple");
                            System.out.print("\n\n\t\t\t\t c.) Cedar ");
                            System.out.print("\n\n\t\t\t\t d.) Pine");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {   
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t What was the original name of Java?");
                            System.out.print("\n\n\t\t\t\t a.) Oak");
                            System.out.print("\n\n\t\t\t\t b.) Maple ");
                            System.out.print("\n\n\t\t\t\t c.) Cedar ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) Pine \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t What was the original name of Java?");
                            System.out.print("\n\n\t\t\t\t a.) Oak ");
                            System.out.print("\n\n\t\t\t\t b.) Maple ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) Cedar \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) Pine ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if (choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t What was the original name of Java?");
                            System.out.print("\n\n\t\t\t\t a.) Oak");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) Maple \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) Cedar ");
                            System.out.print("\n\n\t\t\t\t d.) Pine ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t What was the original name of Java?");
                            System.out.print("\n\n\t\t\t\t a.) Oak  \n\n\t\t\t\t b.) Maple \n\n\t\t\t\t c.) Cedar \n\n\t\t\t\t d.) Pine");
                            System.out.print("\n\n\t\t\t\t Your Answer?: "); 
                        }
                    }
                    break;
                    
                case 5:
                    clearscreen();
                    System.out.print("\t\t\t\t        EASY MODE");
                    System.out.print("\n\n\t\t\t\t Which programming language was Java initially designed to be an alternative to?");
                    System.out.print("\n\n\t\t\t\t a.) C++ \n\n\t\t\t\t b.) Pascal \n\n\t\t\t\t c.) COBOL \n\n\t\t\t\t d.) Fortran");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which programming language was Java initially designed to be an alternative to?");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) C++\033[0m");
                            System.out.print("\n\n\t\t\t\t b.) Pascal");
                            System.out.print("\n\n\t\t\t\t c.) COBOL");
                            System.out.print("\n\n\t\t\t\t d.) Fortran");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which programming language was Java initially designed to be an alternative to?");
                            System.out.print("\n\n\t\t\t\t a.) C++");
                            System.out.print("\n\n\t\t\t\t b.) Pascal ");
                            System.out.print("\n\n\t\t\t\t c.) COBOL ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) Fortran \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which programming language was Java initially designed to be an alternative to?");
                            System.out.print("\n\n\t\t\t\t a.) C++");
                            System.out.print("\n\n\t\t\t\t b.) Pascal ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) COBOL \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) Fortran ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which programming language was Java initially designed to be an alternative to?");
                            System.out.print("\n\n\t\t\t\t a.) C++");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) Pascal \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) COBOL ");
                            System.out.print("\n\n\t\t\t\t d.) Fortran");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which programming language was Java initially designed to be an alternative to?");
                            System.out.print("\n\n\t\t\t\t a.)  C++ \n\n\t\t\t\t b.) Pascal \n\n\t\t\t\t c.) COBOL \n\n\t\t\t\t d.) Fortran");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 6:
                    clearscreen();
                    System.out.print("\t\t\t\t        EASY MODE");
                    System.out.print("\n\n\t\t\t\t What was the main goal of Java's design?");
                    System.out.print("\n\n\t\t\t\t a.) To be portable across different platforms \n\n\t\t\t\t b.) To be easy to learn and use \n\n\t\t\t\t c.) To be fast and efficient \n\n\t\t\t\t d.) To be visually appealing");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t What was the main goal of Java's design?");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) To be portable across different platforms\033[0m");
                            System.out.print("\n\n\t\t\t\t b.) To be easy to learn and use");
                            System.out.print("\n\n\t\t\t\t c.) To be fast and efficient");
                            System.out.print("\n\n\t\t\t\t d.) To be visually appealing");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t What was the main goal of Java's design?");
                            System.out.print("\n\n\t\t\t\t a.) To be portable across different platforms");
                            System.out.print("\n\n\t\t\t\t b.) To be easy to learn and use");
                            System.out.print("\n\n\t\t\t\t c.) To be fast and efficient");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) To be visually appealing \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t What was the main goal of Java's design?");
                            System.out.print("\n\n\t\t\t\t a.) To be portable across different platforms");
                            System.out.print("\n\n\t\t\t\t b.) To be easy to learn and use");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) To be fast and efficient \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) To be visually appealing");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t What was the main goal of Java's design?");
                            System.out.print("\n\n\t\t\t\t a.) To be portable across different platforms");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) To be easy to learn and use \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) To be fast and efficient");
                            System.out.print("\n\n\t\t\t\t d.) To be visually appealing ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t What was the main goal of Java's design?");
                            System.out.print("\n\n\t\t\t\t a.) To be portable across different platforms \n\n\t\t\t\t b.) To be easy to learn and use \n\n\t\t\t\t c.) To be fast and efficient \n\n\t\t\t\t d.) To be visually appealing");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 7:
                    clearscreen();
                    System.out.print("\t\t\t\t        EASY MODE");
                    System.out.print("\n\n\t\t\t\t What is the JVM?");
                    System.out.print("\n\n\t\t\t\t a.) Java Virtual Machine \n\n\t\t\t\t b.) Java Virtual Memory \n\n\t\t\t\t c.) Java Visual Model \n\n\t\t\t\t d.) Java Virtual Monitor ");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t What is the JVM?");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) Java Virtual Machine\033[0m");
                            System.out.print("\n\n\t\t\t\t b.) Java Virtual Memory");
                            System.out.print("\n\n\t\t\t\t c.) Java Visual Model");
                            System.out.print("\n\n\t\t\t\t d.) Java Virtual Monitor ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t What is the JVM?");
                            System.out.print("\n\n\t\t\t\t a.) Java Virtual Machine");
                            System.out.print("\n\n\t\t\t\t b.) Java Virtual Memory");
                            System.out.print("\n\n\t\t\t\t c.) Java Visual Model ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) Java Virtual Monitor \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        } 
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t What is the JVM?");
                            System.out.print("\n\n\t\t\t\t a.) Java Virtual Machine");
                            System.out.print("\n\n\t\t\t\t b.) Java Virtual Memory ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) Java Visual Model \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) Java Virtual Monitor");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t What is the JVM?");
                            System.out.print("\n\n\t\t\t\t a.) Java Virtual Machine");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) Java Virtual Memory \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) Java Visual Model");
                            System.out.print("\n\n\t\t\t\t d.) Java Virtual Monitor ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t What is the JVM?");
                            System.out.print("\n\n\t\t\t\t a.) Java Virtual Machine \n\n\t\t\t\t b.) Java Virtual Memory \n\n\t\t\t\t c.) Java Visual Model \n\n\t\t\t\t d.) Java Virtual Monitor ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 8:
                    clearscreen();
                    System.out.print("\t\t\t\t        EASY MODE");
                    System.out.print("\n\n\t\t\t\t Which version of Java introduced support for lambda expressions?");
                    System.out.print("\n\n\t\t\t\t a.) Java 8 \n\n\t\t\t\t b.) Java 7 \n\n\t\t\t\t c.) Java 9 \n\n\t\t\t\t d.) Java 10 ");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                       choice = sc.nextLine();
                       if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which version of Java introduced support for lambda expressions?");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) Java 8\033[0m");
                            System.out.print("\n\n\t\t\t\t b.) Java 7");
                            System.out.print("\n\n\t\t\t\t c.) Java 9");
                            System.out.print("\n\n\t\t\t\t d.) Java 10 ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which version of Java introduced support for lambda expressions?");
                            System.out.print("\n\n\t\t\t\t a.) Java 8");
                            System.out.print("\n\n\t\t\t\t b.) Java 7 ");
                            System.out.print("\n\n\t\t\t\t c.) Java 9");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) Java 10 \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which version of Java introduced support for lambda expressions?");
                            System.out.print("\n\n\t\t\t\t a.) Java 8");
                            System.out.print("\n\n\t\t\t\t b.) Java 7 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) Java 9 \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) Java 10 ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which version of Java introduced support for lambda expressions?");
                            System.out.print("\n\n\t\t\t\t a.) Java 8");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) Java 7 \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) Java 9 ");
                            System.out.print("\n\n\t\t\t\t d.) Java 10 ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which version of Java introduced support for lambda expressions?");
                            System.out.print("\n\n\t\t\t\t a.) Java 8 \n\n\t\t\t\t b.) Java 7 \n\n\t\t\t\t c.) Java 9 \n\n\t\t\t\t d.) Java 10 ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 9:
                    clearscreen();
                    System.out.print("\t\t\t\t        EASY MODE");
                    System.out.print("\n\n\t\t\t\t Which company acquired Sun Microsystems, the original developer of Java, in 2010?");
                    System.out.print("\n\n\t\t\t\t a.) Oracle \n\n\t\t\t\t b.) Google \n\n\t\t\t\t c.) Microsoft \n\n\t\t\t\t d.) IBM");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                       if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which company acquired Sun Microsystems, the original developer of Java, in 2010?");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) Oracle\033[0m");
                            System.out.print("\n\n\t\t\t\t b.) Google");
                            System.out.print("\n\n\t\t\t\t c.) Microsoft");
                            System.out.print("\n\n\t\t\t\t d.) IBM");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which company acquired Sun Microsystems, the original developer of Java, in 2010?");
                            System.out.print("\n\n\t\t\t\t a.) Oracle");
                            System.out.print("\n\n\t\t\t\t b.) Google ");
                            System.out.print("\n\n\t\t\t\t c.) Microsoft");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) IBM \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which company acquired Sun Microsystems, the original developer of Java, in 2010?");
                            System.out.print("\n\n\t\t\t\t a.) Oracle");
                            System.out.print("\n\n\t\t\t\t b.) Google ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) Microsoft \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) IBM ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        } 
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which company acquired Sun Microsystems, the original developer of Java, in 2010?");
                            System.out.print("\n\n\t\t\t\t a.) Oracle");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) Google \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) Microsoft");
                            System.out.print("\n\n\t\t\t\t d.) IBM ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which company acquired Sun Microsystems, the original developer of Java, in 2010?");
                            System.out.print("\n\n\t\t\t\t a.) Oracle \n\n\t\t\t\t b.) Google \n\n\t\t\t\t c.) Microsoft \n\n\t\t\t\t d.) IBM");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 10:
                    clearscreen();
                    System.out.print("\t\t\t\t        EASY MODE");
                    System.out.print("\n\n\t\t\t\t Which of the following is not a Java development tool?");
                    System.out.print("\n\n\t\t\t\t a.) Visual Studio \n\n\t\t\t\t b.) IntelliJ IDEA \n\n\t\t\t\t c.) NetBeans \n\n\t\t\t\t d.) Eclipse");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A")) 
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which of the following is not a Java development tool?");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) Visual Studio\033[0m");
                            System.out.print("\n\n\t\t\t\t b.) IntelliJ IDEA");
                            System.out.print("\n\n\t\t\t\t c.) NetBeans ");
                            System.out.print("\n\n\t\t\t\t d.) Eclipse");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which of the following is not a Java development tool?");
                            System.out.print("\n\n\t\t\t\t a.) Visual Studio");
                            System.out.print("\n\n\t\t\t\t b.) IntelliJ IDEA ");
                            System.out.print("\n\n\t\t\t\t c.) NetBeans ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) Eclipse \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which of the following is not a Java development tool?");
                            System.out.print("\n\n\t\t\t\t a.) Visual Studio");
                            System.out.print("\n\n\t\t\t\t b.) IntelliJ IDEA m");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) NetBeans \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) Eclipse ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which of the following is not a Java development tool?");
                            System.out.print("\n\n\t\t\t\t a.) Visual Studio");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) IntelliJ IDEA \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) NetBeans ");
                            System.out.print("\n\n\t\t\t\t d.) Eclipse");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t        EASY MODE");
                            System.out.print("\n\n\t\t\t\t Which of the following is not a Java development tool?");
                            System.out.print("\n\n\t\t\t\t a.) Visual Studio \n\n\t\t\t\t b.) IntelliJ IDEA \n\n\t\t\t\t c.) NetBeans \n\n\t\t\t\t d.) Eclipse");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
            }
        }
        try
            {
                Thread.sleep(1000); 
            } 
            catch (InterruptedException e) {}
        clearscreen();
        System.out.print("\n\t\t _____________________________________________________________________");
        System.out.print("\n\n\t\t\t\t YOU GOT " + score + " OUT OF 10 QUESTIONS ON EASY MODE");
        System.out.print("\n\t\t _____________________________________________________________________");
        System.out.print("\n\n\t\t\t\t           PRESS 'M' TO MENU");
        System.out.print("\n\t\t\t\t         PRESS 'C' TO CONTINUE");
        System.out.print("\n\n\t\t\t\t                : ");
        while(true)
        {
            choice = sc.nextLine();
            if(choice.equalsIgnoreCase("C"))
            {
                Normal.normal();
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
                System.out.print("\n\t\t _____________________________________________________________________");
                System.out.print("\n\n\t\t\t\t YOU GOT " + score + " OUT OF 10 QUESTIONS ON EASY MODE");
                System.out.print("\n\t\t _____________________________________________________________________");
                System.out.print("\n\n\t\t\t\t           PRESS 'M' TO MENU");
                System.out.print("\n\t\t\t\t         PRESS 'C' TO CONTINUE");
                System.out.print("\n\n\t\t\t\t                : ");
            }
        }
        
        return score;
    }

    public static void clearscreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}