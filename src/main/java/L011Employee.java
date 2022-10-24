public class L011Employee {//Superclass, parent class, BaseClass
    private String name;
    private int salary;
    private String department;

    public L011Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public void work(){
        System.out.println("Employee is working.");
    }
    public void showDetails(){
        System.out.println("employee name: "+name);
        System.out.println("employee salary: "+salary);
        System.out.println("employee department: "+department);

    }
    public void changeDepartment(String new_department){
        System.out.println("This employee changing department");
        this.department=new_department;
        System.out.println("New department of this employee is: "+this.department);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



}
