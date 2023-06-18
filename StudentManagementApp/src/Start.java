
import java.io.*;
import com.student.manage.*;
public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management app");
	    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		while(true) {
	    	System.out.println("press 1 to add student");
	    	System.out.println("press 2 to Delete student");
	    	System.out.println("press 3 to display student");
	    	System.out.println("press 4 to exit student");
	    	int c=Integer.parseInt(br.readLine());
	    	if(c==1) {
	    		//add student
	    		System.out.println("Enter user Name:");
	    		String name=br.readLine();
	    		
	    		System.out.println("Enter user Phone:");
	    		String phone=br.readLine();
	    		
	    		System.out.println("Enter user City:");
	    		String city=br.readLine();
	    		//create student object
	    		student st=new student(name,phone,city);
	    		StudentDao.insertStudentToDB(st);
	    		boolean answer=StudentDao.insertStudentToDB(st);
	    		if(answer) {
	    			System.out.println("Student is addeded successfully...");
	    		}else {
	    			System.out.println("somthing went wrong");
	    		}
	    		System.out.println(st);
	    	}
	    	
	    	else if(c==2) {
	    		//delete student
	    		System.out.println("enter student id to delete");
	    		int userId=Integer.parseInt(br.readLine());
	    		boolean answer=StudentDao.deleteStudent(userId);
	    		if(answer) {
	    			System.out.println("Student is delete successfully...");
	    		}else {
	    			System.out.println("somthing went wrong");
	    		}
	    		
	    	}else if(c==3) {
	    		//display student
	    		StudentDao.showAllStudent();
	    	}else if(c==4) {
	    		//exit
	    		break;
	    	}else {
	    		System.out.println("enter proper input");
	    	}
	    	
		}
		System.out.println("thank you for using this system");
		
		
	
	}

}
