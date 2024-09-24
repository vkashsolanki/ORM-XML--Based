package com.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.StudentDao;
import com.orm.entiry.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/orm/config.xml");
        StudentDao studentDao = (StudentDao)context.getBean("studentDao");
        
        // how to print console base applications or Menu driven program
        // User se input lena hai to
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //for Exit ke boolean type ka value le
        boolean go = true;
        while (go) {
            System.out.println("Press 1 for add new Student");
            System.out.println("Press 2 for display all Student");
            System.out.println("Press 3 for get detail single Student");
            System.out.println("Press 4 for delete Student");
            System.out.println("Press 5 for update Student");
            System.out.println("Press 6 for Exit");
            
            try {
            	int input = Integer.parseInt(bufferedReader.readLine());
            	
            	// ek ke value ko number se print kenr ke liye switch or if else le sake ho
            	switch (input) {
				case 1:
					//add new Student
					System.out.println("enter your id : ");
					int uId = Integer.parseInt(bufferedReader.readLine());
					
					System.out.println("Enter your name : ");
				    String name = bufferedReader.readLine();
				    
					System.out.println("Enter your city : ");
				    String city = bufferedReader.readLine();
					
				    // user ka object le new Studnet(uid, name, city) v pas kar skte h
				    Student student = new Student();
				    student.setId(uId);
				    student.setName(name);
				    student.setCity(city);
				    
				    // data save kare studnedao lke object se insert()method jo class me implemnt h 
				    int insert = studentDao.insert(student);
				    System.out.println(insert+" : Student Added");
				    System.out.println("*********************************************************");
					break;
					
				case 2:
					//display all Student
					List<Student> allStudent = studentDao.getAllStudent();
					for(Student st:allStudent) {
						System.out.println("Id : "+st.getId());
						System.out.println("Name : "+st.getName());
						System.out.println("City : "+st.getCity());
						System.out.println("=======================================================================");
					}
					System.out.println("*********************************************************");
					
					break;
					
				case 3:
					//get single detail 
					System.out.println("Enter your Id : ");
					int id = Integer.parseInt(bufferedReader.readLine());
					Student st1 = studentDao.getStudent(id);
					System.out.println("Id : "+st1.getId());
					System.out.println("Name : "+st1.getName());
					System.out.println("City : "+st1.getCity());
					System.out.println("*********************************************************");
					
					break;
				case 4: 
					//delete data
					System.out.println("Enter You Id : ");
					int uid = Integer.parseInt(bufferedReader.readLine());
					studentDao.deleteStudent(uid);
					System.out.println("Deleted Successfully !...");
					System.out.println("*********************************************************");
					
					
					break;
				case 5:
					// update data
					System.out.println("enter your id : ");
					int uuId = Integer.parseInt(bufferedReader.readLine());
					
					System.out.println("Enter your name : ");
				    String uname = bufferedReader.readLine();
				    
					System.out.println("Enter your city : ");
				    String ucity = bufferedReader.readLine();
					
				    // create object of student becos parameter pass in method delete() in studentDao class
				    Student st2 = new Student();
				    st2.setId(uuId);
				    st2.setName(uname);
				    st2.setCity(ucity);
				    
				    Student update = studentDao.updateStudent(st2);
				    System.out.println(update);
					System.out.println("Updated Successfully !...");
					System.out.println("*********************************************************");
					
					break;
				case 6:
					//for Exit
					go=false;
					break;

				}
            					
			} catch (Exception e) {
				System.out.println("invalid input try with another one");
				e.getMessage();
			}
			
		}
        System.out.println("Thank You for Using Menu Driven Program");
        System.out.println("See You Soon!!!!...");
         
    }
}
