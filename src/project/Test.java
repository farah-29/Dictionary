package project;

import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) {
	EmployeeDirectory directory = new EmployeeDirectory();
	String fileName = "src/project/data_for_project.txt";

	try {
	    Scanner data = new Scanner(new File(fileName));
	    directory.readFile(data);
	    
	
	} catch (FileNotFoundException e) {
	    System.out.println("File not found: " + e.getMessage());
	}
	System.out.println(directory.getEmployeeInfo("564446288"));

    }
}
