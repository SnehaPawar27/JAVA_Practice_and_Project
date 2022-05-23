import java.util.*;	
import java.lang.*;
import java.io.*;
class FileHandlingTask
{
	static int empID = 101;
	public static void main(String[] args) throws Exception
	{
		
		int ch=0;
		String[] line;		
		String fname,lname,email,mob,data;
		
		
		
		
		System.out.println("Employee Management System");
		while(true)
		{	
			int tmp=0;
			
			Scanner sc = new Scanner(System.in);
			
			try
			{
				System.out.println("\n\n1. New Employee");
				System.out.println("2. Update Employee detail");
				System.out.println("3. View Employees");
				System.out.println("4. Remove Employee");
				System.out.println("5. Sort Employee  according to name");
				System.out.println("6. Close System");
				ch = sc.nextInt();
				switch(ch)
				{
					case 1:
						FileWriter fw = new FileWriter("data.txt",true);  
    						BufferedWriter bw = new BufferedWriter(fw);
						System.out.println("Your employee ID is "+empID);
						System.out.print("First Name : ");
						fname = sc.next();
						System.out.print("Last Name : ");
						lname = sc.next();
						System.out.print("E-mail : ");
						email = sc.next();
						System.out.print("Phone number : ");
						mob = sc.next();
						data = empID+" "+fname+" "+lname+" "+email+" "+mob;
						System.out.println("data is"+ data);
						line = data.split(" ");
						for (String word: line)
						{
						        bw.write(word+" ");
					    	}
						bw.newLine();
						bw.close();	
						empID++;
						break;
					case 2:
						System.out.print("Enter the Employee ID you want to Update :");
						String input= sc.next();
						System.out.print("Update First Name:");
						String updt = sc.next();
						FileReader frr = new FileReader("data.txt");
					        BufferedReader brr = new BufferedReader(frr);
					        String s; 
						String rewrite = "";    
					        int flag=0;  	
					        while((s=brr.readLine())!=null)
					        {
					           System.out.println("S is"+s);
						           rewrite  = (rewrite + s) + "\n" ;
							    System.out.println("rewrite is"+rewrite);
						   line=s.split(" "); 
						    for (String word : line) 
						    {
							    System.out.println("words is"+word);
							    
						  	   if (word.equals(input))  
						  	   {
								
						  	        flag++; 
								break; 
							   }
						    }
					        }
					        if(flag == 1) 
					        {
						   System.out.println("its updated");
					        }
					        else
					        {
						   System.out.println("No such id...");
					        }
						frr.close();
						break;
					case 3:
						FileReader fr = new FileReader("data.txt");
				    		BufferedReader br = new BufferedReader(fr);
						String rline;
						while( (rline = br.readLine() ) != null) 
						{
						    System.out.println(rline);
								
						}
						br.close();
						break;
					case 4:
						System.out.println("No records yet...");
						break;
					case 5:
						System.out.println("No records yet...");
						break;
					case 6:
						
						System.exit(0);
					break;
					default:
						System.out.println("Select appropriate option please....");	
						break;
				}
				
			}
			catch(InputMismatchException ex)
			{
				System.out.println("Selections apart from numbers, NOT ALLOWED....");
			}
			
		}
		
	}
}
