package internship;

/*TASK 3:Student Management System
 * 
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Student{
	private String name;
	private int rollNumber;
	private String grade;
	public Student(String name,int rollNumber,String grade)
	{
		this.name=name;
		this.rollNumber=rollNumber;
		this.grade=grade;
	}
	public String getName()
	{
		return name;
	}
	public int getRollNumber()
	{
		return rollNumber;
	}
	public String getGrade()
	{
		return grade;
	}
	@Override
	public String toString()
	{
		return "Name:"+name+",Roll Number:"+rollNumber+",Grade:"+grade;
	}
}
 class StudentManagementSystem
{
	private List<Student> students=new ArrayList<>();
	public void addStudent(Student student) {
		students.add(student);
	}
	public void removeStudent(int rollNumber)
	{
		students.removeIf(student-> student.getRollNumber()==rollNumber);
	}
	public Student findStudent(int rollNumber)
	{
		for(Student student:students)
		{
			if(student.getRollNumber()==rollNumber)
			{
				return student;
			}
		}
		return null;
	}
	public List<Student> getAllStudents()
	{
		return students;
	}
	
}

	public class Task3 {
	    public static void main(String[] args) {
	    	StudentManagementSystem sms=new StudentManagementSystem();
	    	Scanner sc=new Scanner(System.in);
	    	
	    	while(true)
	    	{
	    		System.out.println("Student Management System");
	    		System.out.println("1.Add Student");
	    		System.out.println("2.Remove Student");
	    		System.out.println("3.Search Student");
	    		System.out.println("4.Display All Students");
	    		System.out.println("5.Exit");
	    		System.out.print("Select an option:");
	    		int choice=sc.nextInt();
	    		sc.nextLine();
	    		
	    		switch(choice)
	    		{
	    		case 1:System.out.print("Enter name:");
	    		String name=sc.nextLine();
	    		System.out.print("Enter rollnumber:");
	    		int rollNumber=sc.nextInt();
	    		sc.nextLine();
	    		System.out.print("Enter grade:");
	    		String grade=sc.nextLine();
	    		Student student=new Student(name,rollNumber,grade);
	    		sms.addStudent(student);
	    		break;
	    		case 2:System.out.print("Enter roll number to remove:");
	    		int rollToRemove=sc.nextInt();
	    		sc.nextLine();
	    		sms.removeStudent(rollToRemove);
	    		System.out.println("Student Removed");
	    		break;
	    		case 3:System.out.print("Enter rollnumber to search:");
	    		int rollToSearch=sc.nextInt();
	    		sc.nextLine();
	    		Student foundStudent=sms.findStudent(rollToSearch);
	    		if(foundStudent!=null)
	    		{
	    			System.out.println("Student found:"+foundStudent);
	    		}
	    		else {
	    			System.out.println("Student not found.");
	    		}
	    		break;
	    		case 4:
	    			List<Student> allStudents=sms.getAllStudents();
	    			if(allStudents.isEmpty()) {
	    				System.out.println("No students in the system.");
	    			}
	    			else
	    			{
	    				for(Student s:allStudents)
	    				{
	    					System.out.println(s);
	    				}
	    			}
	    			break;
	    		case 5:
	    			System.out.println("Exiting application.");
	    			sc.close();
	    			System.exit(0);
	    			break;
	    			default:
	    				System.out.println("Invalid option.please try again.");
	    		}
	    	}
	    }
	}

