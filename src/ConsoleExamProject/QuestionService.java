package ConsoleExamProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class QuestionService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Questioning[] quiz = new Questioning[2];

		quiz[0] = new Questioning(1, "Where is Taj Mahal \n", "1.Agra \n", "2. varanasi \n", "3. Kanpur", "4.Kolata \n", 1);
		quiz[1] = new Questioning(2, "What is the size of float variable \n", "1. 8 bit \n", "2. 16 bit \n", "3. 32bit \n", "4. 3 bit \n", 3);
		
		System.out.println("Welcome to examAre you ready?(y-start,n-stop)");
		
		  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		    
				String name = null;
				try {
					name = reader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		   
		    if(name.equals("n")||name.equals("N"))
		    {
		        System.out.println("Stopped");
		    }
		    else   if(name.equals("y")||name.equals("Y"))
		    {
		    	for(int i=0;i<=1;i++)
		    	{
		    		System.out.println(quiz[i].getQuestionId()+"."+quiz[i].getQuestions()+ "\n"+quiz[i].getOption1()+"\n"+quiz[i].getOption2()+"\n"+quiz[i].getOption3()+"\n"+quiz[i].getOption4());
		    		Scanner cin = new Scanner(System.in);
		    		int response=cin.nextInt();
		    		
		    		if(response==quiz[i].getAnswer())
		    		{
		    			System.out.println("Correct!");
		    			continue;
		    		}
		    		else
		    		{
		    			System.out.println("\n Your answer is not correct. Do you want to try again? (y-yes,n-no)");
		                  String name1 = null;
						try {
							name1 = reader.readLine();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		                  if(name1.equals("y")||name1.equals("Y"))
		                  {
		                     i--;
		                  }
		                  else
		                      continue;
		    		}
		    	}
		    	
		    }
		
		

	}

}
