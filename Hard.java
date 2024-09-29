import java.util.*;
import java.util.Random;

public class Hard
{
    int score = 0;
    @SuppressWarnings("resource")
    public int hard() 
    {
        MySecondQuizgame MyObject2 = new MySecondQuizgame();
        Scanner sc = new Scanner(System.in); 
        Quizgame MyObject = new Quizgame();
        String choice;
        int j , temp, i;
        int[] Hard = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
        Random rand = new Random();
        clearscreen();
        
        for(i = 0; i < 10; i++)
        {
            j = rand.nextInt(i + 1);
            temp = Hard[i];
            Hard[i] = Hard[j];
            Hard[j] = temp;
        }
        for(i = 0; i < 10; i++ )
        {
            try {
                Thread.sleep(1000); 
            } 
            catch (InterruptedException e) {}
            
            switch(Hard[i])
            {
                case 1:
                    clearscreen();
                    System.out.print("\t\t\t\t          HARD MODE");
                    System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                    System.out.print("\n\n\t\t\t\t int a = 10;");
                    System.out.print("\n\t\t\t\t int b = 20;");
                    System.out.print("\n\n\t\t\t\t System.out.println(''The sum of '' + a + '' and '' + b + '' is '' + a + b);");
                    System.out.print("\n\n\t\t\t\t a.) The sum of 10 and 20 is 1020 \n\n\t\t\t\t b.) The sum of 10 and 20 is 30 \n\n\t\t\t\t c.) The sum of 10 and 20 is ''10 + 20'' \n\n\t\t\t\t d.) None of the above ");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t int a = 10;");
                            System.out.print("\n\t\t\t\t int b = 20;");
                            System.out.print("\n\n\t\t\t\t System.out.println(''The sum of '' + a + '' and '' + b + '' is '' + a + b);");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) The sum of 10 and 20 is 1020 \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) The sum of 10 and 20 is 30 ");
                            System.out.print("\n\n\t\t\t\t c.) The sum of 10 and 20 is ''10 + 20'' ");
                            System.out.print("\n\n\t\t\t\t d.) None of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t int a = 10;");
                            System.out.print("\n\t\t\t\t int b = 20;");
                            System.out.print("\n\n\t\t\t\t System.out.println(''The sum of '' + a + '' and '' + b + '' is '' + a + b);");
                            System.out.print("\n\n\t\t\t\t a.) The sum of 10 and 20 is 1020 ");
                            System.out.print("\n\n\t\t\t\t b.) The sum of 10 and 20 is 30 ");
                            System.out.print("\n\n\t\t\t\t c.) The sum of 10 and 20 is ''10 + 20'' ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) None of the above \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t int a = 10;");
                            System.out.print("\n\t\t\t\t int b = 20;");
                            System.out.print("\n\n\t\t\t\t System.out.println(''The sum of '' + a + '' and '' + b + '' is '' + a + b);");
                            System.out.print("\n\n\t\t\t\t a.) The sum of 10 and 20 is 1020 ");
                            System.out.print("\\n\n\t\t\t\t b.) The sum of 10 and 20 is 30 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) The sum of 10 and 20 is ''10 + 20'' \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) None of the above");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t int a = 10;");
                            System.out.print("\n\t\t\t\t int b = 20;");
                            System.out.print("\n\n\t\t\t\t System.out.println(''The sum of '' + a + '' and '' + b + '' is '' + a + b);");
                            System.out.print("\n\n\t\t\t\t a.) The sum of 10 and 20 is 1020 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) The sum of 10 and 20 is 30 \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) The sum of 10 and 20 is ''10 + 20'' ");
                            System.out.print("\n\n\t\t\t\t d.) None of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t int a = 10;");
                            System.out.print("\n\t\t\t\t int b = 20;");
                            System.out.print("\n\n\t\t\t\t System.out.println(''The sum of '' + a + '' and '' + b + '' is '' + a + b);");
                            System.out.print("\n\n\t\t\t\t a.) The sum of 10 and 20 is 1020 \n\n\t\t\t\t b.) The sum of 10 and 20 is 30 \n\n\t\t\t\t c.) The sum of 10 and 20 is ''10 + 20'' \n\n\t\t\t\t d.) None of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 2:
                    clearscreen();
                    System.out.print("\t\t\t\t          HARD MODE");
                    System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                    System.out.print("\n\n\t\t\t\t String s = ''Hello'';");
                    System.out.print("\n\t\t\t\t s.concat('' World'');");
                    System.out.print("\n\n\t\t\t\t System.out.println(s);");
                    System.out.print("\n\n\t\t\t\t a.) Hello \n\n\t\t\t\t b.) Hello World \n\n\t\t\t\t c.) World \n\n\t\t\t\t d.) None of the above ");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t String s = ''Hello'';");
                            System.out.print("\n\t\t\t\t s.concat('' World'');");
                            System.out.print("\n\n\t\t\t\t System.out.println(s);");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) Hello \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) Hello World ");
                            System.out.print("\n\n\t\t\t\t c.) World ");
                            System.out.print("\n\n\t\t\t\t d.) None of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                           clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t String s = ''Hello'';");
                            System.out.print("\n\t\t\t\t s.concat('' World'');");
                            System.out.print("\n\n\t\t\t\t System.out.println(s);");
                            System.out.print("\n\n\t\t\t\t a.) Hello ");
                            System.out.print("\n\n\t\t\t\t b.) Hello World ");
                            System.out.print("\n\n\t\t\t\t c.) World ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) None of the above  \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break; 
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t String s = ''Hello'';");
                            System.out.print("\n\t\t\t\t s.concat('' World'');");
                            System.out.print("\n\n\t\t\t\t System.out.println(s);");
                            System.out.print("\n\n\t\t\t\t a.) Hello ");
                            System.out.print("\n\n\t\t\t\t b.) Hello World ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) World \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) None of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t String s = ''Hello'';");
                            System.out.print("\n\t\t\t\t s.concat('' World'');");
                            System.out.print("\n\n\t\t\t\t System.out.println(s);");
                            System.out.print("\n\n\t\t\t\t a.) Hello ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) Hello World \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) World ");
                            System.out.print("\n\n\t\t\t\t d.) None of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t String s = ''Hello'';");
                            System.out.print("\n\t\t\t\t s.concat('' World'');");
                            System.out.print("\n\n\t\t\t\t System.out.println(s);");
                            System.out.print("\n\n\t\t\t\t a.) Hello \n\n\t\t\t\t b.) Hello World \n\n\t\t\t\t c.) World \n\n\t\t\t\t d.) None of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 3:
                    clearscreen();
                    System.out.print("\t\t\t\t          HARD MODE");
                    System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                    System.out.print("\n\n\t\t\t\t int i = 1;");
                    System.out.print("\n\t\t\t\t while(i <= 10) {");
                    System.out.print("\n\t\t\t\t    System.out.print(i + '' ''); ");
                    System.out.print("\n\t\t\t\t    i += 2;");
                    System.out.print("\n\t\t\t\t }");
                    System.out.print("\n\n\t\t\t\t a.) 1 3 5 7 9 \n\n\t\t\t\t b.) 1 2 3 4 5 6 7 8 9 10 \n\n\t\t\t\t c.) 2 4 6 8 10 \n\n\t\t\t\t d.) None of the above ");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t int i = 1;");
                            System.out.print("\n\t\t\t\t while(i <= 10) {");
                            System.out.print("\n\t\t\t\t    System.out.print(i + '' ''); ");
                            System.out.print("\n\t\t\t\t    i += 2;");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) 1 3 5 7 9  \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) 1 2 3 4 5 6 7 8 9 10");
                            System.out.print("\n\n\t\t\t\t c.) 2 4 6 8 10 ");
                            System.out.print("\n\n\t\t\t\t d.) None of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t int i = 1;");
                            System.out.print("\n\t\t\t\t while(i <= 10) {");
                            System.out.print("\n\t\t\t\t    System.out.print(i + '' ''); ");
                            System.out.print("\n\t\t\t\t    i += 2;");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) 1 3 5 7 9 ");
                            System.out.print("\n\n\t\t\t\t b.) 1 2 3 4 5 6 7 8 9 10");
                            System.out.print("\n\n\t\t\t\t c.) 2 4 6 8 10 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) None of the above \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t int i = 1;");
                            System.out.print("\n\t\t\t\t while(i <= 10) {");
                            System.out.print("\n\t\t\t\t    System.out.print(i + '' ''); ");
                            System.out.print("\n\t\t\t\t    i += 2;");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) 1 3 5 7 9 ");
                            System.out.print("\n\n\t\t\t\t b.) 1 2 3 4 5 6 7 8 9 10");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) 2 4 6 8 10 ");
                            System.out.print("\n\n\t\t\t\t d.) None of the above");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t int i = 1;");
                            System.out.print("\n\t\t\t\t while(i <= 10) {");
                            System.out.print("\n\t\t\t\t    System.out.print(i + '' ''); ");
                            System.out.print("\n\t\t\t\t    i += 2;");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) 1 3 5 7 9 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) 1 2 3 4 5 6 7 8 9 10\033[0m");
                            System.out.print("\n\n\t\t\t\t c.) 2 4 6 8 10 ");
                            System.out.print("\n\n\t\t\t\t d.) None of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t int i = 1;");
                            System.out.print("\n\t\t\t\t while(i <= 10) {");
                            System.out.print("\n\t\t\t\t    System.out.print(i + '' '');");
                            System.out.print("\n\t\t\t\t    i += 2;");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) 1 3 5 7 9 \n\n\t\t\t\t b.) 1 2 3 4 5 6 7 8 9 10 \n\n\t\t\t\t c.) 2 4 6 8 10 \n\n\t\t\t\t d.) None of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 4:
                    clearscreen();
                    System.out.print("\t\t\t\t          HARD MODE");
                    System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                    System.out.print("\n\n\t\t\t\t int[] arr = {1, 2, 3, 4, 5};");
                    System.out.print("\n\t\t\t\t for(int i : arr) {");
                    System.out.print("\n\t\t\t\t    if(i % 2 == 0) {");
                    System.out.print("\n\t\t\t\t        continue;");
                    System.out.print("\n\t\t\t\t    } ");
                    System.out.print("\n\t\t\t\t    System.out.print(i + '' '');");
                    System.out.print("\n\t\t\t\t }");
                    System.out.print("\n\n\t\t\t\t a.) 1 3 5 \n\n\t\t\t\t b.)  2 4 \n\n\t\t\t\t c.) 1 2 3 4 5 \n\n\t\t\t\t d.) None of the above ");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t int[] arr = {1, 2, 3, 4, 5};");
                            System.out.print("\n\t\t\t\t for(int i : arr) {");
                            System.out.print("\n\t\t\t\t    if(i % 2 == 0) {");
                            System.out.print("\n\t\t\t\t        continue;");
                            System.out.print("\n\t\t\t\t    } ");
                            System.out.print("\n\t\t\t\t    System.out.print(i + '' '');");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) 1 3 5  \033[0m");
                            System.out.print("\n\n\t\t\t\t b.)  2 4 ");
                            System.out.print("\n\n\t\t\t\t c.) 1 2 3 4 5 ");
                            System.out.print("\n\n\t\t\t\t d.) None of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t int[] arr = {1, 2, 3, 4, 5};");
                            System.out.print("\n\t\t\t\t for(int i : arr) {");
                            System.out.print("\n\t\t\t\t    if(i % 2 == 0) {");
                            System.out.print("\n\t\t\t\t        continue;");
                            System.out.print("\n\t\t\t\t    } ");
                            System.out.print("\n\t\t\t\t    System.out.print(i + '' '');");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) 1 3 5 ");
                            System.out.print("\n\n\t\t\t\t b.)  2 4 ");
                            System.out.print("\n\n\t\t\t\t c.) 1 2 3 4 5 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) None of the above \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t int[] arr = {1, 2, 3, 4, 5};");
                            System.out.print("\n\t\t\t\t for(int i : arr) {");
                            System.out.print("\n\t\t\t\t    if(i % 2 == 0) {");
                            System.out.print("\n\t\t\t\t        continue;");
                            System.out.print("\n\t\t\t\t    } ");
                            System.out.print("\n\t\t\t\t    System.out.print(i + '' '');");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) 1 3 5 ");
                            System.out.print("\n\n\t\t\t\t b.)  2 4 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) 1 2 3 4 5 \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) None of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t int[] arr = {1, 2, 3, 4, 5};");
                            System.out.print("\n\t\t\t\t for(int i : arr) {");
                            System.out.print("\n\t\t\t\t    if(i % 2 == 0) {");
                            System.out.print("\n\t\t\t\t        continue;");
                            System.out.print("\n\t\t\t\t    } ");
                            System.out.print("\n\t\t\t\t    System.out.print(i + '' '');");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) 1 3 5 ");
                            System.out.print("\n\n\t\t\t\t b.)  2 4 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) 1 2 3 4 5   \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) None of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t int[] arr = {1, 2, 3, 4, 5};");
                            System.out.print("\n\t\t\t\t for(int i : arr) {");
                            System.out.print("\n\t\t\t\t    if(i % 2 == 0) {");
                            System.out.print("\n\t\t\t\t        continue;");
                            System.out.print("\n\t\t\t\t    } ");
                            System.out.print("\n\t\t\t\t    System.out.print(i + '' '');");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) 1 3 5 \n\n\t\t\t\t b.)  2 4 \n\n\t\t\t\t c.) 1 2 3 4 5 \n\n\t\t\t\t d.) None of the above ");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");  
                        }
                    }
                    break;
                    
                case 5:
                    clearscreen();
                    System.out.print("\t\t\t\t          HARD MODE");
                    System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                    System.out.print("\n\n\n\t\t\t\t public class MyClass { ");
                    System.out.print("\n\t\t\t\t    private int x;");
                    System.out.print("\n\n\t\t\t\t    public MyClass() {");
                    System.out.print("\n\t\t\t\t        this(0);");
                    System.out.print("\n\t\t\t\t    }");
                    System.out.print("\n\n\t\t\t\t      public MyClass(int x) {");
                    System.out.print("\n\t\t\t\t        this.x = x;");
                    System.out.print("\n\t\t\t\t     }");
                    System.out.print("\n\n\t\t\t\t      public int getX() {");
                    System.out.print("\n\t\t\t\t        return x;");
                    System.out.print("\n\t\t\t\t        }");
                    System.out.print("\n\t\t\t\t    }");
                    System.out.print("\n\t\t\t\t MyClass obj = new MyClass();");
                    System.out.print("\n\t\t\t\t System.out.println(obj.getX());");
                    System.out.print("\n\n\t\t\t\t a.) 0 \n\n\t\t\t\t b.) 1 \n\n\t\t\t\t c.) null \n\n\t\t\t\t d.) NULL");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\n\t\t\t\t public class MyClass { ");
                            System.out.print("\n\t\t\t\t    private int x;");
                            System.out.print("\n\n\t\t\t\t    public MyClass() {");
                            System.out.print("\n\t\t\t\t        this(0);");
                            System.out.print("\n\t\t\t\t    }");
                            System.out.print("\n\n\t\t\t\t      public MyClass(int x) {");
                            System.out.print("\n\t\t\t\t        this.x = x;");
                            System.out.print("\n\t\t\t\t     }");
                            System.out.print("\n\n\t\t\t\t      public int getX() {");
                            System.out.print("\n\t\t\t\t        return x;");
                            System.out.print("\n\t\t\t\t        }");
                            System.out.print("\n\t\t\t\t    }");
                            System.out.print("\n\t\t\t\t MyClass obj = new MyClass();");
                            System.out.print("\n\t\t\t\t System.out.println(obj.getX());");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) 0   \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) 1 ");
                            System.out.print("\n\n\t\t\t\t c.) null ");
                            System.out.print("\n\n\t\t\t\t d.) NULL");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\n\t\t\t\t public class MyClass { ");
                            System.out.print("\n\t\t\t\t    private int x;");
                            System.out.print("\n\n\t\t\t\t    public MyClass() {");
                            System.out.print("\n\t\t\t\t        this(0);");
                            System.out.print("\n\t\t\t\t    }");
                            System.out.print("\n\n\t\t\t\t      public MyClass(int x) {");
                            System.out.print("\n\t\t\t\t        this.x = x;");
                            System.out.print("\n\t\t\t\t     }");
                            System.out.print("\n\n\t\t\t\t      public int getX() {");
                            System.out.print("\n\t\t\t\t        return x;");
                            System.out.print("\n\t\t\t\t        }");
                            System.out.print("\n\t\t\t\t    }");
                            System.out.print("\n\t\t\t\t MyClass obj = new MyClass();");
                            System.out.print("\n\t\t\t\t System.out.println(obj.getX());");
                            System.out.print("\n\n\t\t\t\t a.) 0  ");
                            System.out.print("\n\n\t\t\t\t b.) 1 ");
                            System.out.print("\n\n\t\t\t\t c.) null ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) NULL  \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\n\t\t\t\t public class MyClass { ");
                            System.out.print("\n\t\t\t\t    private int x;");
                            System.out.print("\n\n\t\t\t\t    public MyClass() {");
                            System.out.print("\n\t\t\t\t        this(0);");
                            System.out.print("\n\t\t\t\t    }");
                            System.out.print("\n\n\t\t\t\t      public MyClass(int x) {");
                            System.out.print("\n\t\t\t\t        this.x = x;");
                            System.out.print("\n\t\t\t\t     }");
                            System.out.print("\n\n\t\t\t\t      public int getX() {");
                            System.out.print("\n\t\t\t\t        return x;");
                            System.out.print("\n\t\t\t\t        }");
                            System.out.print("\n\t\t\t\t    }");
                            System.out.print("\n\t\t\t\t MyClass obj = new MyClass();");
                            System.out.print("\n\t\t\t\t System.out.println(obj.getX());");
                            System.out.print("\n\n\t\t\t\t a.) 0  ");
                            System.out.print("\n\n\t\t\t\t b.) 1 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) null  \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) NULL");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\n\t\t\t\t public class MyClass { ");
                            System.out.print("\n\t\t\t\t    private int x;");
                            System.out.print("\n\n\t\t\t\t    public MyClass() {");
                            System.out.print("\n\t\t\t\t        this(0);");
                            System.out.print("\n\t\t\t\t    }");
                            System.out.print("\n\n\t\t\t\t      public MyClass(int x) {");
                            System.out.print("\n\t\t\t\t        this.x = x;");
                            System.out.print("\n\t\t\t\t     }");
                            System.out.print("\n\n\t\t\t\t      public int getX() {");
                            System.out.print("\n\t\t\t\t        return x;");
                            System.out.print("\n\t\t\t\t        }");
                            System.out.print("\n\t\t\t\t    }");
                            System.out.print("\n\t\t\t\t MyClass obj = new MyClass();");
                            System.out.print("\n\t\t\t\t System.out.println(obj.getX());");
                            System.out.print("\n\n\t\t\t\t a.) 0 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) 1   \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) null ");
                            System.out.print("\n\n\t\t\t\t d.) NULL");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\n\t\t\t\t public class MyClass { ");
                            System.out.print("\n\t\t\t\t    private int x;");
                            System.out.print("\n\n\t\t\t\t    public MyClass() {");
                            System.out.print("\n\t\t\t\t        this(0);");
                            System.out.print("\n\t\t\t\t    }");
                            System.out.print("\n\n\t\t\t\t     public MyClass(int x) {");
                            System.out.print("\n\t\t\t\t        this.x = x;");
                            System.out.print("\n\t\t\t\t     }");
                            System.out.print("\n\n\t\t\t\t     public int getX() {");
                            System.out.print("\n\t\t\t\t        return x;");
                            System.out.print("\n\t\t\t\t        }");
                            System.out.print("\n\t\t\t\t    }");
                            System.out.print("\n\n\t\t\t\t MyClass obj = new MyClass();");
                            System.out.print("\n\t\t\t\t System.out.println(obj.getX());");
                            System.out.print("\n\n\t\t\t\t a.) 0 \n\n\t\t\t\t b.) 1 \n\n\t\t\t\t c.) null \n\n\t\t\t\t d.) NULL");
                            System.out.print("\n\n\t\t\t\t Your Answer?: "); 
                        }
                    }
                    break;
                    
                case 6:
                    clearscreen();
                    System.out.print("\t\t\t\t          HARD MODE");
                    System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                    System.out.print("\n\n\t\t\t\t public static void main(String[] args) { ");
                    System.out.print("\n\t\t\t\t    String s = ''Hello World''; ");
                    System.out.print("\n\t\t\t\t    System.out.println(s.indexOf(''l'', 4)); ");
                    System.out.print("\n\t\t\t\t } ");
                    System.out.print("\n\n\t\t\t\t a.) 9 \n\n\t\t\t\t b.) 2 \n\n\t\t\t\t c.) 3 \n\n\t\t\t\t d.) None of the above");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) { ");
                            System.out.print("\n\t\t\t\t    String s = ''Hello World''; ");
                            System.out.print("\n\t\t\t\t    System.out.println(s.indexOf(''l'', 4)); ");
                            System.out.print("\n\t\t\t\t } ");
                            System.out.print("\033[0;32m \n\n\t\t\t\t a.) 9 \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) 2 ");
                            System.out.print("\n\n\t\t\t\t c.) 3 ");
                            System.out.print("\n\n\t\t\t\t d.) None of the above");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) { ");
                            System.out.print("\n\t\t\t\t    String s = ''Hello World''; ");
                            System.out.print("\n\t\t\t\t    System.out.println(s.indexOf(''l'', 4)); ");
                            System.out.print("\n\t\t\t\t } ");
                            System.out.print("\n\n\t\t\t\t a.) 9 ");
                            System.out.print("\n\n\t\t\t\t b.) 2 ");
                            System.out.print("\n\n\t\t\t\t c.) 3 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) None of the above \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) { ");
                            System.out.print("\n\t\t\t\t    String s = ''Hello World''; ");
                            System.out.print("\n\t\t\t\t    System.out.println(s.indexOf(''l'', 4)); ");
                            System.out.print("\n\t\t\t\t } ");
                            System.out.print("\n\n\t\t\t\t a.) 9 ");
                            System.out.print("\n\n\t\t\t\t b.) 2 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) 3  \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) None of the above");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) { ");
                            System.out.print("\n\t\t\t\t    String s = ''Hello World''; ");
                            System.out.print("\n\t\t\t\t    System.out.println(s.indexOf(''l'', 4)); ");
                            System.out.print("\n\t\t\t\t } ");
                            System.out.print("\n\n\t\t\t\t a.) 9 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) 2   \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) 3 ");
                            System.out.print("\n\n\t\t\t\t d.) None of the above");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) { ");
                            System.out.print("\n\t\t\t\t    String s = ''Hello World''; ");
                            System.out.print("\n\t\t\t\t    System.out.println(s.indexOf(''l'', 4)); ");
                            System.out.print("\n\t\t\t\t } ");
                            System.out.print("\n\n\t\t\t\t a.) 9 \n\n\t\t\t\t b.) 2 \n\n\t\t\t\t c.) 3 \n\n\t\t\t\t d.) None of the above");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 7:
                    clearscreen();
                    System.out.print("\t\t\t\t          HARD MODE");
                    System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                    System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                    System.out.print("\n\t\t\t\t    int[][] arr = {{1, 2}, {3, 4}}; ");
                    System.out.print("\n\t\t\t\t    System.out.println(arr[1][0]); ");
                    System.out.print("\n\t\t\t\t } ");
                    System.out.print("\n\n\t\t\t\t a.) 3 \n\n\t\t\t\t b.) 2  \n\n\t\t\t\t c.) 1 \n\n\t\t\t\t d.) 4");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();;
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                            System.out.print("\n\t\t\t\t    int[][] arr = {{1, 2}, {3, 4}}; ");
                            System.out.print("\n\t\t\t\t    System.out.println(arr[1][0]); ");
                            System.out.print("\n\t\t\t\t } ");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) 3  \033[0m");
                            System.out.print("\n\n\t\t\t\t a.) 3 ");
                            System.out.print("\n\n\t\t\t\t b.) 2 ");
                            System.out.print("\n\n\t\t\t\t c.) 1 ");
                            System.out.print("\n\n\t\t\t\t d.) 4");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();;
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                            System.out.print("\n\t\t\t\t    int[][] arr = {{1, 2}, {3, 4}}; ");
                            System.out.print("\n\t\t\t\t    System.out.println(arr[1][0]); ");
                            System.out.print("\n\t\t\t\t } ");
                            System.out.print("\n\n\t\t\t\t a.) 3 ");
                            System.out.print("\n\n\t\t\t\t b.) 2 ");
                            System.out.print("\n\n\t\t\t\t c.) 1 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) 4  \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();;
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                            System.out.print("\n\t\t\t\t    int[][] arr = {{1, 2}, {3, 4}}; ");
                            System.out.print("\n\t\t\t\t    System.out.println(arr[1][0]); ");
                            System.out.print("\n\t\t\t\t } ");
                            System.out.print("\n\n\t\t\t\t a.) 3 ");
                            System.out.print("\n\n\t\t\t\t b.) 2 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) 1  \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) 4");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();;
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                            System.out.print("\n\t\t\t\t    int[][] arr = {{1, 2}, {3, 4}}; ");
                            System.out.print("\n\t\t\t\t    System.out.println(arr[1][0]); ");
                            System.out.print("\n\t\t\t\t } ");
                            System.out.print("\n\n\t\t\t\t a.) 3 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) 2  \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) 1 ");
                            System.out.print("\n\n\t\t\t\t d.) 4");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();;
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                            System.out.print("\n\t\t\t\t    int[][] arr = {{1, 2}, {3, 4}}; ");
                            System.out.print("\n\t\t\t\t    System.out.println(arr[1][0]); ");
                            System.out.print("\n\t\t\t\t } ");
                            System.out.print("\n\n\t\t\t\t a.) 3 \n\n\t\t\t\t b.) 2  \n\n\t\t\t\t c.) 1 \n\n\t\t\t\t d.) 4");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 8:
                    clearscreen();;
                    System.out.print("\t\t\t\t          HARD MODE");
                    System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                    System.out.print("\n\n\t\t\t\t public static void main(String[] args) { ");
                    System.out.print("\n\t\t\t\t      int i = 5;");
                    System.out.print("\n\t\t\t\t       System.out.println(i-- + ++i);");
                    System.out.print("\n\t\t\t\t }");
                    System.out.print("\n\n\t\t\t\t a.) 11 \n\n\t\t\t\t b.) 12 \n\n\t\t\t\t c.) 13 \n\n\t\t\t\t d.) 14");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();;
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) { ");
                            System.out.print("\n\t\t\t\t      int i = 5;");
                            System.out.print("\n\t\t\t\t       System.out.println(i-- + ++i);");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) 11   \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) 12 ");
                            System.out.print("\n\n\t\t\t\t c.) 13 ");
                            System.out.print("\n\n\t\t\t\t d.) 14");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();;
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) { ");
                            System.out.print("\n\t\t\t\t      int i = 5;");
                            System.out.print("\n\t\t\t\t       System.out.println(i-- + ++i);");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) 11 ");
                            System.out.print("\n\n\t\t\t\t b.) 12 ");
                            System.out.print("\n\n\t\t\t\t c.) 13 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) 14  \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            
                        }   
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();;
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) { ");
                            System.out.print("\n\t\t\t\t      int i = 5;");
                            System.out.print("\n\t\t\t\t       System.out.println(i-- + ++i);");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) 11 ");
                            System.out.print("\n\n\t\t\t\t b.) 12 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) 13  \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) 14");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                        else if(choice.equalsIgnoreCase("B")){System.out.print("\n\n\t\t\t\t INCORRECT");break;}
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code? ");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) { ");
                            System.out.print("\n\t\t\t\t      int i = 5;");
                            System.out.print("\n\t\t\t\t       System.out.println(i-- + ++i);");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) 11 \n\n\t\t\t\t b.) 12 \n\n\t\t\t\t c.) 13 \n\n\t\t\t\t d.) 14");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 9:
                    clearscreen();
                    System.out.print("\t\t\t\t          HARD MODE");
                    System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                    System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                    System.out.print("\n\t\t\t\t    int x = 5;");
                    System.out.print("\n\t\t\t\t    int y = x++ + ++x;");
                    System.out.print("\n\t\t\t\t    System.out.println(y);");
                    System.out.print("\n\n\t\t\t\t }");
                    System.out.print("\n\n\t\t\t\t a.) 12 \n\n\t\t\t\t b.) 13 \n\n\t\t\t\t c.) 14 \n\n\t\t\t\t d.) 15");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                            System.out.print("\n\t\t\t\t    int x = 5;");
                            System.out.print("\n\t\t\t\t    int y = x++ + ++x;");
                            System.out.print("\n\t\t\t\t    System.out.println(y);");
                            System.out.print("\n\n\t\t\t\t }");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) 12 \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) 13 ");
                            System.out.print("\n\n\t\t\t\t c.) 14 ");
                            System.out.print("\n\n\t\t\t\t d.) 15");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                            System.out.print("\n\t\t\t\t    int x = 5;");
                            System.out.print("\n\t\t\t\t    int y = x++ + ++x;");
                            System.out.print("\n\t\t\t\t    System.out.println(y);");
                            System.out.print("\n\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) 12 ");
                            System.out.print("\n\n\t\t\t\t b.) 13 ");
                            System.out.print("\n\n\t\t\t\t c.) 14 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) 15  \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                            System.out.print("\n\t\t\t\t    int x = 5;");
                            System.out.print("\n\t\t\t\t    int y = x++ + ++x;");
                            System.out.print("\n\t\t\t\t    System.out.println(y);");
                            System.out.print("\n\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) 12 ");
                            System.out.print("\n\n\t\t\t\t b.) 13 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) 14 \033[0m");
                            System.out.print("\n\n\t\t\t\t d.) 15");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                            System.out.print("\n\t\t\t\t    int x = 5;");
                            System.out.print("\n\t\t\t\t    int y = x++ + ++x;");
                            System.out.print("\n\t\t\t\t    System.out.println(y);");
                            System.out.print("\n\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) 12 ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) 13 \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) 14 ");
                            System.out.print("\n\n\t\t\t\t d.) 15");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                            
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                            System.out.print("\n\t\t\t\t    int x = 5;");
                            System.out.print("\n\t\t\t\t    int y = x++ + ++x;");
                            System.out.print("\n\t\t\t\t    System.out.println(y);");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) 12 \n\n\t\t\t\t b.) 13 \n\n\t\t\t\t c.) 14 \n\n\t\t\t\t d.) 15");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                        }
                    }
                    break;
                    
                case 10:
                    clearscreen();
                    System.out.print("\t\t\t\t          HARD MODE");
                    System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                    System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                    System.out.print("\n\t\t\t\t    String s1 = ''hello'';");
                    System.out.print("\n\t\t\t\t    String s2 = ''world'';");
                    System.out.print("\n\t\t\t\t    String s3 = s1 + s2;");
                    System.out.print("\n\t\t\t\t    String s4 = ''helloworld'';");
                    System.out.print("\n\t\t\t\t    System.out.println(s3 == s4);");
                    System.out.print("\n\t\t\t\t }");
                    System.out.print("\n\n\t\t\t\t a.) false \n\n\t\t\t\t b.) true \n\n\t\t\t\t c.) compilation error \n\n\t\t\t\t d.) hotdog nga pink");
                    System.out.print("\n\n\t\t\t\t Your Answer?: ");
                    while(true)
                    {
                        choice = sc.nextLine();
                        if(choice.equalsIgnoreCase("A"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                            System.out.print("\n\t\t\t\t    String s1 = ''hello'';");
                            System.out.print("\n\t\t\t\t    String s2 = ''world'';");
                            System.out.print("\n\t\t\t\t    String s3 = s1 + s2;");
                            System.out.print("\n\t\t\t\t    String s4 = ''helloworld'';");
                            System.out.print("\n\t\t\t\t    System.out.println(s3 == s4);");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\033[0;32m\n\n\t\t\t\t a.) false  \033[0m");
                            System.out.print("\n\n\t\t\t\t b.) true ");
                            System.out.print("\n\n\t\t\t\t c.) compilation error ");
                            System.out.print("\n\n\t\t\t\t d.) hotdog nga pink");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            score++;
                            break;
                        }
                        else if(choice.equalsIgnoreCase("D"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                            System.out.print("\n\t\t\t\t    String s1 = ''hello'';");
                            System.out.print("\n\t\t\t\t    String s2 = ''world'';");
                            System.out.print("\n\t\t\t\t    String s3 = s1 + s2;");
                            System.out.print("\n\t\t\t\t    String s4 = ''helloworld'';");
                            System.out.print("\n\t\t\t\t    System.out.println(s3 == s4);");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) false ");
                            System.out.print("\n\n\t\t\t\t b.) true ");
                            System.out.print("\n\n\t\t\t\t c.) compilation error ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t d.) hotdog nga pink  \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("C"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                            System.out.print("\n\t\t\t\t    String s1 = ''hello'';");
                            System.out.print("\n\t\t\t\t    String s2 = ''world'';");
                            System.out.print("\n\t\t\t\t    String s3 = s1 + s2;");
                            System.out.print("\n\t\t\t\t    String s4 = ''helloworld'';");
                            System.out.print("\n\t\t\t\t    System.out.println(s3 == s4);");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) false ");
                            System.out.print("\n\n\t\t\t\t b.) true ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t c.) compilation error  \033[0m");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else if(choice.equalsIgnoreCase("B"))
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                            System.out.print("\n\t\t\t\t    String s1 = ''hello'';");
                            System.out.print("\n\t\t\t\t    String s2 = ''world'';");
                            System.out.print("\n\t\t\t\t    String s3 = s1 + s2;");
                            System.out.print("\n\t\t\t\t    String s4 = ''helloworld'';");
                            System.out.print("\n\t\t\t\t    System.out.println(s3 == s4);");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) false ");
                            System.out.print("\033[0;31m\n\n\t\t\t\t b.) true  \033[0m");
                            System.out.print("\n\n\t\t\t\t c.) compilation error ");
                            System.out.print("\n\n\t\t\t\t d.) hotdog nga pink");
                            System.out.print("\n\n\t\t\t\t Your Answer?: ");
                            break;
                        }
                        else
                        {
                            clearscreen();
                            System.out.print("\t\t\t\t          HARD MODE");
                            System.out.print("\n\n\n\t\t\t\t What is the output of the following Java code?");
                            System.out.print("\n\n\t\t\t\t public static void main(String[] args) {");
                            System.out.print("\n\t\t\t\t    String s1 = ''hello'';");
                            System.out.print("\n\t\t\t\t    String s2 = ''world'';");
                            System.out.print("\n\t\t\t\t    String s3 = s1 + s2;");
                            System.out.print("\n\t\t\t\t    String s4 = ''helloworld'';");
                            System.out.print("\n\t\t\t\t    System.out.println(s3 == s4);");
                            System.out.print("\n\t\t\t\t }");
                            System.out.print("\n\n\t\t\t\t a.) false \n\n\t\t\t\t b.) true \n\n\t\t\t\t c.) compilation error \n\n\t\t\t\t d.) hotdog nga pink");
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
                MyObject.totalscore();
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
                System.out.print("\n\n\t\t\t\t YOU GOT " + score+ " OUT OF 10 QUESTIONS ON EASY MODE");
                System.out.print("\t\t _____________________________________________________________________");
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