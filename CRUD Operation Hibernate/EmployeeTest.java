package HiberCRUD;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;



public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		AnnotationConfiguration con	=new AnnotationConfiguration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf;
		Session session;
		Transaction t= null;
		
		//List<EmpPOJO> al=new ArrayList<EmpPOJO>();
		while(true)
		{
			
				
				
				Scanner sc=new Scanner(System.in);
				System.out.println("*  Employee Portal  *");
				System.out.println("----------------------");
				System.out.println("Please select option : ");
				System.out.println("1. Insert Employee Records : ");
				System.out.println("2. To view all Employee Records : ");
				System.out.println("3. Update Employee Record : ");
				System.out.println("4. Delete Employee Record.");
				System.out.println("6. Exit ");
				int ch=sc.nextInt();
				switch(ch)
				{
				
				case 1:
					
					Employee e1=new Employee();
					System.out.println("Insert Data...!");
					System.out.println("Enter Employee's Name : ");
					e1.setName(sc.next());
					System.out.println("Enter Employee's Age : ");
					e1.setAge(sc.nextInt());
					System.out.println("Enter Employee's Salary : ");
					e1.setSalary(sc.nextDouble());
					//al.add(e1);
					
					sf=con.buildSessionFactory();
					session=sf.openSession();
					t = session.beginTransaction();
					session.save(e1);
					t.commit();  
				    System.out.println("successfully saved");    
				   
				    sf.close();  
					session.close();
					
					  
					break;
				case 2:
					Employee student;
					SessionFactory sessionFactory =con.buildSessionFactory();
					  
					  Session session1 = sessionFactory.openSession();
					  //getting transaction object from session object
					  session1.beginTransaction();
					  Query query = session1.createQuery("from Employee");
					  
					  List<Employee> em1 = query.list();
					  for(Employee student1 : em1)
					  {
					System.out.println("Name: "+student1.getName()+", Age: "+student1.getAge()+", Salary: "+student1.getSalary());
					  }
					  session1.getTransaction().commit();
					  sessionFactory.close();
				case 3:
					SessionFactory sessionFactory1 = con.buildSessionFactory();
					  //getting session object from session factory
					  Session session11 = sessionFactory1.openSession();
					  //getting transaction object from session object
					  session11.beginTransaction();
					  System.out.println("Enter ID to update its Record : ");
					  Employee student1 = (Employee)session11.get(Employee.class, sc.nextInt());
					  System.out.println("Please select Choice :");
					  System.out.println("Select What you want to change :");
						System.out.println("1. To Change Name.");
						System.out.println("2. To Change Age.");
						System.out.println("3. To Change Salary.");

					  int ch1=sc.nextInt();
					  switch(ch1)
					  {
					  case 1:
						  System.out.println("Enter Updated Name :");
						  student1.setName(sc.next());
						  break;
					  case 2:
						  System.out.println("Enter Updated Age :");
						  student1.setAge(sc.nextInt());
						  break;
					  case 3:
						  System.out.println("Enter Updated Salary ");
						  student1.setSalary(sc.nextDouble());
					  }
					  System.out.println("Updated Successfully");
					  session11.getTransaction().commit();
					  sessionFactory1.close();
				case 4:
					SessionFactory sessionFactory11 = con.buildSessionFactory();
					  //getting session object from session factory
					  Session session111 = sessionFactory11.openSession();
					  //getting transaction object from session object
					  session111.beginTransaction();
					  System.out.println("Enter ID to Delete :");
					  Employee student11 = (Employee)session111.load(Employee.class, sc.nextInt());
					  session111.delete(student11);
					  System.out.println("Deleted Successfully");
					  session111.getTransaction().commit();
					  sessionFactory11.close();
					  break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Please select proper choice.");
					break;
				}
		
			
		 
		
		}
	}

}
