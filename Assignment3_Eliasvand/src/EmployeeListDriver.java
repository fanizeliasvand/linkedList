

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeListDriver {
	
	//static LinkedList<Employee> empList = new LinkedList<Employee>();

	public static void main(String[] args) {
		LinkedList<Employee> empList = new LinkedList<Employee>();
	
		
		String line = null;
		String[] lineContents=null;
		Employee e =null;
		try {
			InputStream fileStream = new FileInputStream("employee-2.txt");
			Scanner fileContent = new Scanner(fileStream);
			while(fileContent.hasNextLine()) {
				line=null;
				line=fileContent.nextLine();
				lineContents = line.split(" ");
//				System.out.println(lineContents[0]);
//				System.out.println(lineContents[1]);
//				System.out.println(lineContents[2]);
//				System.out.println(lineContents.length);
				e= new Employee();
				e.setFirstName(lineContents[0]);
				e.setLastName(lineContents[1]);
				e.setZipCode(lineContents[2]);
				//add the employee into the linkedlist of employees
				empList.add(e);
			}
			fileContent.close();
			
		} catch (FileNotFoundException ex) {
			// TODO Auto-generated catch block
			System.out.println("Error reading the file using the scanner"+ex);
			ex.printStackTrace();
		}

		for(Employee emp:empList)
			System.out.println(emp);
       	}
 
}
