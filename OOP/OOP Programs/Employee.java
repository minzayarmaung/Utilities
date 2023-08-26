package OOP_Practise;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int Salary;

    public Employee(int id, String firstName , String lastName,int Salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.Salary=Salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
    public int AnnunalSalary(){
        return Salary*12;
    }
    public double raiseSalary(){
       int percent =  (int) (getSalary()*0.1);
        return percent;
    }
    
    public static void main(String[] args) {
        Employee e = new Employee(1, "Min", "Zayar", 1200);
        
        System.out.println("Employee" +"[" + "id = "+ e.getId() + "name = "+e.getFirstName()+e.getLastName() +      "Salary = " + e.getSalary());
        
        System.out.println("id is " + e.getId());
        System.out.println("firstname is " + e.getFirstName());
        System.out.println("lastname is " + e.getLastName());
        System.out.println("Salary is " + e.getSalary());
        System.out.println("name is " + e.getFirstName() + e.getLastName());
        System.out.println("Annunal Salary is : " + e.AnnunalSalary());
        System.out.println("percent : " + e.raiseSalary());
        
    }
    
}
