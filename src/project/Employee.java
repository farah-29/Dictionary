package project;



/**
 *
 * @author farah
 */
public class Employee {
    
    String number;
    String name;
    double salary;

    public Employee(String Number, String Name, double Salery) {
        this.number = Number;
        this.name = Name;
        this.salary = Salery;
    }

    @Override
    public String toString() {
        return "\n Employee information\n Employee id:"+number+"\n Name:"+name+"\n Salary:"+salary;
    }

    
}
    