package project;

import java.util.Iterator;
import java.util.Scanner;

public class EmployeeDirectory {

    private DictionaryInterface<String, Employee> employeeBook;

    public EmployeeDirectory() {

	employeeBook = new DictionaryList<>();

    }

    public void readFile(Scanner data) {
	while (data.hasNext()) {
	    String line = data.nextLine();
	    String[] items = line.split(",");
	    String number = items[0];
	    String name = items[1];
	    double salary = Double.parseDouble(items[2]);
	    Employee emp = new Employee(number, name, salary);
	    System.out.println(emp);
	    employeeBook.add(number, emp);
	} // end while
	data.close();
    } // end readFile

    /**
     * Gets the phone number of a given person.
     */
    public Employee getEmployeeInfo(String number) {
	return employeeBook.getValue(number);
    } // end getPhoneNumber

    /**
     * Adds a person and phone number to the directory.
     */
    public boolean add(String number, Employee emp) {
	boolean result = false;

	if (!employeeBook.contains(number)) {
	    employeeBook.add(number, emp);
	    result = true;
	} // end if

	return result;
    } // end add

    /**
     * Removes a person from the directory.
     */
    public Employee remove(Employee emp) {
	return employeeBook.remove(emp.number);
    } // end remove

    /**
     * Changes a person's phone number or, if not found, adds the person.
     *
     * @return The old phone number or null if person not found but added.
     */
    public Employee changeEmployeeInfo(String number, String name, double salary) {
	return employeeBook.add(number, new Employee(number, name, salary));
    } // end changePhoneNumber

    public int getSize() {
	return employeeBook.getSize();
    } // end getSize

}
