import java.util.*;
import java.util.Random;

public class Normal
{
    int score = 0;
    @SuppressWarnings("resource")
	public int normal() 
    {
        MySecondQuizgame MyObject2 = new MySecondQuizgame();
        Scanner sc = new Scanner(System.in); 
        String choice;
        Hard Hard = new Hard();
        int j , temp, i;
        int[] Normal = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
        Random rand = new Random();
        clearscreen();
        
        for(i = 0; i < 10; i++)
        {
            j = rand.nextInt(i + 1);
            temp = Normal[i];
            Normal[i] = Normal[j];
            Normal[j] = temp;
        }
        for(i = 0; i < 10; i++)
        {
            
            try 
            {
                Thread.sleep(1000); 
            } 
            catch (InterruptedException e) {}
            
            switch(Normal[i])
            {
                case 1:
                    clearscreen();
                    System.out.print("\t\t\t\t          NORMAL MODE");
                    System.out.print("\n\n\n\t\t\t\t Which of the following is NOT a type of Java statement?");
                    System.out.print("\n\n\t\t\t\t a.) Declaration statement \n\n\t\t\t\t b.) Assignment statement \n\n\t\t\t\t c.) Control statement \n\n\t\t\t\t d.) Expression statement");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following is NOT a type of Java statement?");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) Declaration statement\033[0m");
                            System.out.print("\n\n\t\t\t\t b.) Assignment statement ");
                            System.out.print("\n\n\t\t\t\t c.) Control statement ");
                            System.out.print("\n\n\t\t\t\t d.) Expression statement");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following is NOT a type of Java statement?");
                            System.out.print("\n\n\t\t\t\t a.) Declaration statement");
                            System.out.print("\n\n\t\t\t\t b.) Assignment statement ");
                            System.out.print("\n\n\t\t\t\t c.) Control statement ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) Expression statement \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following is NOT a type of Java statement?");
                            System.out.print("\n\n\t\t\t\t a.) Declaration statement");
                            System.out.print("\n\n\t\t\t\t b.) Assignment statement ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) Control statement \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) Expression statement ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following is NOT a type of Java statement?");
                            System.out.print("\n\n\t\t\t\t a.) Declaration statement");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) Assignment statement \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) Control statement");
                            System.out.print("\n\n\t\t\t\t d.) Expression statement");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following is NOT a type of Java statement?");
                            System.out.print("\n\n\t\t\t\t a.) Declaration statement \n\n\t\t\t\t b.) Assignment statement \n\n\t\t\t\t c.) Control statement \n\n\t\t\t\t d.) Expression statement");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 2:
                    clearscreen();
                    System.out.print("\t\t\t\t          NORMAL MODE");
                    System.out.print("\n\n\n\t\t\t\t Which keyword is used to define a new class in Java?");
                    System.out.print("\n\n\t\t\t\t a.) class \n\n\t\t\t\t b.) new \n\n\t\t\t\t c.) void \n\n\t\t\t\t d.) extends");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to define a new class in Java?");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) class \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) new ");
                            System.out.print("\n\n\t\t\t\t c.) void ");
                            System.out.print("\n\n\t\t\t\t d.) extends");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to define a new class in Java?");
                            System.out.print("\n\n\t\t\t\t a.) class");
                            System.out.print("\n\n\t\t\t\t b.) new ");
                            System.out.print("\n\n\t\t\t\t c.) void ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) extends \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to define a new class in Java?");
                            System.out.print("\n\n\t\t\t\t a.) class");
                            System.out.print("\n\n\t\t\t\t b.) new ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) void \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) extends ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to define a new class in Java?");
                            System.out.print("\n\n\t\t\t\t a.) class");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) new \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) void ");
                            System.out.print("\n\n\t\t\t\t d.) extends");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to define a new class in Java?");
                            System.out.print("\n\n\t\t\t\t a.) class \n\n\t\t\t\t b.) new \n\n\t\t\t\t c.) void \n\n\t\t\t\t d.) extends");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                
                case 3:
                    clearscreen();
                    System.out.print("\t\t\t\t          NORMAL MODE");
                    System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to allocate memory for an object in Java?");
                    System.out.print("\n\n\t\t\t\t a.) new \n\n\t\t\t\t b.) allocate \n\n\t\t\t\t c.) malloc \n\n\t\t\t\t d.) create ");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to allocate memory for an object in Java?");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) new \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) allocate");
                            System.out.print("\n\n\t\t\t\t c.) malloc");
                            System.out.print("\n\n\t\t\t\t d.) create");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to allocate memory for an object in Java?");
                            System.out.print("\n\n\t\t\t\t a.) new ");
                            System.out.print("\n\n\t\t\t\t b.) allocate ");
                            System.out.print("\n\n\t\t\t\t c.) malloc");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) create \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to allocate memory for an object in Java?");
                            System.out.print("\n\n\t\t\t\t a.) new ");
                            System.out.print("\n\n\t\t\t\t b.) allocate");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) malloc \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) create");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to allocate memory for an object in Java?");
                            System.out.print("\n\n\t\t\t\t a.) new ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) allocate \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) malloc ");
                            System.out.print("\n\n\t\t\t\t d.) create ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to allocate memory for an object in Java?");
                            System.out.print("\n\n\t\t\t\t a.) new \n\n\t\t\t\t b.) allocate \n\n\t\t\t\t c.) malloc \n\n\t\t\t\t d.) create ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }    
                    }
                    break;
                
                case 4:
                    clearscreen();
                    System.out.print("\t\t\t\t          NORMAL MODE");
                    System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method does not return a value in Java?");
                    System.out.print("\n\n\t\t\t\t a.) void \n\n\t\t\t\t b.) return \n\n\t\t\t\t c.) null \n\n\t\t\t\t d.) none ");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method does not return a value in Java?");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) void \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) return ");
                            System.out.print("\n\n\t\t\t\t c.) null ");
                            System.out.print("\n\n\t\t\t\t d.) none ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method does not return a value in Java?");
                            System.out.print("\n\n\t\t\t\t a.) void ");
                            System.out.print("\n\n\t\t\t\t b.) return ");
                            System.out.print("\n\n\t\t\t\t c.) null ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) none \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method does not return a value in Java?");
                            System.out.print("\n\n\t\t\t\t a.) void ");
                            System.out.print("\n\n\t\t\t\t b.) return ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) null \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) none ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method does not return a value in Java?");
                            System.out.print("\n\n\t\t\t\t a.) void ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) return \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) null ");
                            System.out.print("\n\n\t\t\t\t d.) none ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method does not return a value in Java?");
                            System.out.print("\n\n\t\t\t\t a.) void \n\n\t\t\t\t b.) return \n\n\t\t\t\t c.) null \n\n\t\t\t\t d.) none ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 5:
                    clearscreen();
                    System.out.print("\t\t\t\t          NORMAL MODE");
                    System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to break out of a loop in Java?");
                    System.out.print("\n\n\t\t\t\t a.) return \n\n\t\t\t\t b.) break \n\n\t\t\t\t c.) exit \n\n\t\t\t\t d.) continue ");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to break out of a loop in Java?");
                            System.out.print("\n\n\t\t\t\t a.) return");
                            System.out.print("\033[0;32m\n\n\t\t\t\t b.) break \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) exit ");
                            System.out.print("\n\n\t\t\t\t d.) continue ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to break out of a loop in Java?");
                            System.out.print("\n\n\t\t\t\t a.) return ");
                            System.out.print("\n\n\t\t\t\t b.) break ");
                            System.out.print("\n\n\t\t\t\t c.) exit ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) continue \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to break out of a loop in Java?");
                            System.out.print("\n\n\t\t\t\t a.) return ");
                            System.out.print("\n\n\t\t\t\t b.) break ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) exit \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) continue ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to break out of a loop in Java?");
                            System.out.print("\033[0;31m\n\n\t\t\t\t a.) return \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) break ");
                            System.out.print("\n\n\t\t\t\t c.) exit ");
                            System.out.print("\n\n\t\t\t\t d.) continue ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to break out of a loop in Java?");
                            System.out.print("\n\n\t\t\t\t a.) return \n\n\t\t\t\t b.) break \n\n\t\t\t\t c.) exit \n\n\t\t\t\t d.) continue ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                
                case 6:
                    clearscreen();
                    System.out.print("\t\t\t\t          NORMAL MODE");
                    System.out.print("\n\n\n\t\t\t\t Which keyword is used to declare a variable in Java? ");
                    System.out.print("\n\n\t\t\t\t a.) var \n\n\t\t\t\t b.) declare \n\n\t\t\t\t c.) variable \n\n\t\t\t\t d.) All of the above");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to declare a variable in Java? ");
                            System.out.print("\n\n\t\t\t\t a.) var ");
                            System.out.print("\n\n\t\t\t\t b.) declare ");
                            System.out.print("\n\n\t\t\t\t c.) variable ");
                            System.out.print("\033[0;32m\n\n\t\t\t\t d.) All of the above \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to declare a variable in Java? ");
                            System.out.print("\n\n\t\t\t\t a.) var ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) declare m");
                            System.out.print("\n\n\t\t\t\t c.) variable \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) All of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to declare a variable in Java? ");
                            System.out.print("\n\n\t\t\t\t a.) var ");
                            System.out.print("\n\n\t\t\t\t b.) declare ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) variable \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) All of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to declare a variable in Java? ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t a.) var \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) declare ");
                            System.out.print("\n\n\t\t\t\t c.) variable ");
                            System.out.print("\n\n\t\t\t\t d.) All of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to declare a variable in Java? ");
                            System.out.print("\n\n\t\t\t\t a.) var \n\n\t\t\t\t b.) declare \n\n\t\t\t\t c.) variable \n\n\t\t\t\t d.) All of the above");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                
                case 7:
                    clearscreen();
                    System.out.print("\t\t\t\t          NORMAL MODE");
                    System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to compare two values in Java? ");
                    System.out.print("\n\n\t\t\t\t a.) = \n\n\t\t\t\t b.) == \n\n\t\t\t\t c.) > \n\n\t\t\t\t d.) <");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to compare two values in Java? ");
                            System.out.print("\n\n\t\t\t\t a.) = ");
                            System.out.print("\033[0;32m\n\n\t\t\t\t b.) ==  \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) > ");
                            System.out.print("\n\n\t\t\t\t d.) < ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to compare two values in Java? ");
                            System.out.print("\n\n\t\t\t\t a.) = ");
                            System.out.print("\n\n\t\t\t\t b.) ==  ");
                            System.out.print("\n\n\t\t\t\t c.) > ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) < \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to compare two values in Java? ");
                            System.out.print("\n\n\t\t\t\t a.) = ");
                            System.out.print("\n\n\t\t\t\t b.) ==  ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) > \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) < ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to compare two values in Java? ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t a.) = \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) ==  ");
                            System.out.print("\n\n\t\t\t\t c.) > ");
                            System.out.print("\n\n\t\t\t\t d.) < ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to compare two values in Java? ");
                            System.out.print("\n\n\t\t\t\t a.) = \n\n\t\t\t\t b.) == \n\n\t\t\t\t c.) > \n\n\t\t\t\t d.) <");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                
                case 8:
                    clearscreen();
                    System.out.print("\t\t\t\t          NORMAL MODE");
                    System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method or variable is accessible from anywhere in the program? ");
                    System.out.print("\n\n\t\t\t\t a.) public \n\n\t\t\t\t b.) private \n\n\t\t\t\t c.) protected \n\n\t\t\t\t d.) static ");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method or variable is accessible from anywhere in the program? ");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) public \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) private ");
                            System.out.print("\n\n\t\t\t\t c.) protected ");
                            System.out.print("\n\n\t\t\t\t d.) static ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method or variable is accessible from anywhere in the program? ");
                            System.out.print("\n\n\t\t\t\t a.) public ");
                            System.out.print("\n\n\t\t\t\t b.) private ");
                            System.out.print("\n\n\t\t\t\t c.) protected ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) static \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method or variable is accessible from anywhere in the program? ");
                            System.out.print("\n\n\t\t\t\t a.) public ");
                            System.out.print("\n\n\t\t\t\t b.) private ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) protected \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) static ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method or variable is accessible from anywhere in the program? ");
                            System.out.print("\n\n\t\t\t\t a.) public");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) private \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) protected ");
                            System.out.print("\n\n\t\t\t\t d.) static ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method or variable is accessible from anywhere in the program? ");
                            System.out.print("\n\n\t\t\t\t a.) public \n\n\t\t\t\t b.) private \n\n\t\t\t\t c.) protected \n\n\t\t\t\t d.) static ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 9:
                    clearscreen();
                    System.out.print("\t\t\t\t          NORMAL MODE");
                    System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to declare a constant in Java? ");
                    System.out.print("\n\n\t\t\t\t a.) const \n\n\t\t\t\t b.) static \n\n\t\t\t\t c.) constant \n\n\t\t\t\t d.)  final");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to declare a constant in Java? ");
                            System.out.print("\n\n\t\t\t\t a.) const ");
                            System.out.print("\n\n\t\t\t\t b.) static ");
                            System.out.print("\n\n\t\t\t\t c.) constant ");
                            System.out.print("\033[0;32m\n\n\t\t\t\t d.)  final \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to declare a constant in Java? ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t a.) const \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) static ");
                            System.out.print("\n\n\t\t\t\t c.) constant ");
                            System.out.print("\n\n\t\t\t\t d.)  final ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to declare a constant in Java? ");
                            System.out.print("\n\n\t\t\t\t a.) const ");
                            System.out.print("\n\n\t\t\t\t b.) static ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) constant \033[0m");
                            System.out.print("\n\n\t\t\t\t d.)  final ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to declare a constant in Java? ");
                            System.out.print("\n\n\t\t\t\t a.) const ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) static \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) constant ");
                            System.out.print("\n\n\t\t\t\t d.)  final ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which of the following statements is used to declare a constant in Java? ");
                            System.out.print("\n\n\t\t\t\t a.) const \n\n\t\t\t\t b.) static \n\n\t\t\t\t c.) constant \n\n\t\t\t\t d.)  final");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                
                case 10:
                    clearscreen();
                    System.out.print("\t\t\t\t          NORMAL MODE");
                    System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method or variable belongs to the class, rather than to any specific instance of the class? ");
                    System.out.print("\n\n\t\t\t\t a.) static \n\n\t\t\t\t b.) protected \n\n\t\t\t\t c.) private \n\n\t\t\t\t d.) public ");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method or variable belongs to the class, rather than to any specific instance of the class? ");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) static \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) protected ");
                            System.out.print("\n\n\t\t\t\t c.) private ");
                            System.out.print("\n\n\t\t\t\t d.) public ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method or variable belongs to the class, rather than to any specific instance of the class? ");
                            System.out.print("\n\n\t\t\t\t a.) static ");
                            System.out.print("\n\n\t\t\t\t b.) protected ");
                            System.out.print("\n\n\t\t\t\t c.) private ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) public \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method or variable belongs to the class, rather than to any specific instance of the class? ");
                            System.out.print("\n\n\t\t\t\t a.) static ");
                            System.out.print("\n\n\t\t\t\t b.) protected ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) private \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) public ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method or variable belongs to the class, rather than to any specific instance of the class? ");
                            System.out.print("\n\n\t\t\t\t a.) static ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) protected \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) private ");
                            System.out.print("\n\n\t\t\t\t d.) public");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          NORMAL MODE");
                            System.out.print("\n\n\n\t\t\t\t Which keyword is used to indicate that a method or variable belongs to the class, rather than to any specific instance of the class? ");
                            System.out.print("\n\n\t\t\t\t a.) static \n\n\t\t\t\t b.) protected \n\n\t\t\t\t c.) private \n\n\t\t\t\t d.) public ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: "); 
                        }
                    }
                    break;
                
            }
        
        }
        try {
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
                Hard.hard();
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