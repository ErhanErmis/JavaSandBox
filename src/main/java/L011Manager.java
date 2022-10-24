public class L011Manager extends L011Employee{//subclass, child class
    private int numberOfAssignedStaff;//This is an additional field which not included in parent class

    public L011Manager(String name, int salary, String department, int numberOfAssignedStaff) {
        super(name, salary, department);
        this.numberOfAssignedStaff=numberOfAssignedStaff;
    }//When we say generate constructor in intelliJ it is creating it with super word.
    public void increaseSalary(int amount){
        System.out.println("salary of employees £"+amount+"increased.");
    }
    //We can call this manager's details via showdetailsmethod from the parent class but we can not see the number of assigned employee
    //we can override the showdetails method in here.
    //I copied the method from sperclass and I added the additional field
    public void showDetails(){
//        System.out.println("employee name: "+getName());
//        System.out.println("employee salary: "+getSalary());
//        System.out.println("employee department: "+getDepartment());
//I would like to comment above and I would like to call the methos as super method and adding to top of it additional part
        super.showDetails();
        System.out.println("number of assigned employee :"+this.numberOfAssignedStaff);
    }

    //Normally we can use this method from parent class with super word but this sometimes create some issue because of that overriding the method in here is more preferable.
    public void work(){
        System.out.println("Manager is working.");
    }
    public void newWork(){
        System.out.println("manager changed department");
        work();
    }


}
