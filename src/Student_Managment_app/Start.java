package Student_Managment_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

//WE IMPORT JAR FILE FROM RIGHT CLICK-BUILD PATH-CONFIGURE BUIDPATH-LIBRARIES-ADD EXTERNAL JAR

public class Start {

	public static void main(String[] args) throws IOException {
		// we have to read the value from keyboard ths why we write system.in.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("press 1 for add student");
			System.out.println("press 2 for delete student");
			System.out.println("press 3 for display student");
			System.out.println("press 4 for update student");
			System.out.println("press 5 for exit student");
			int c = Integer.parseInt(br.readLine());// it will throws IOexception thats why we throwing in signature
			// readline gives string thats why we have use integerparse.

			if (c == 1) {
				// add student;
				System.out.println("Enter user name: ");
				String name=br.readLine();
				
				System.out.println("Enter user phone:");
				String phone=br.readLine();
				
				System.out.println("Enter user city:");
				String city =br.readLine();
				
				//create student object to store student
				Student st=new Student(name,phone,city);
				boolean answer=StudentDao.insertStudentToDb(st);
				if(answer) {
					System.out.println("student is added succesfully");
				}
				else {
					System.out.println("something went wrong try again....");
				}
				System.out.println(st);
				
				
			} else if (c == 2) {
				// delete student;
				System.out.println("Enter student id to delete:");
				int userId=Integer.parseInt(br.readLine());
				StudentDao.deleteStudent(userId);
				
				boolean f= StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("Deleted...........");
				}
				else {
					System.out.println("something went wrog");
				}
			} 
			else if (c == 3) {
				// display student;
				StudentDao.showAllStudent();
			} 
			else if (c == 4) {
			
				
				// update student
				
			} else if (c == 5) {
				// exit student;
				break;
			}
			else {
				
			}

		}
		System.out.println("Thank u for using my application");
		System.out.println("see you soon...bye bye");

	}

}
