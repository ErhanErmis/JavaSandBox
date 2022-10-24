public class TestOfL011 {
    public static void main(String[] args) {
        //is-a
        L011Manager manager=new L011Manager("Jane", 25000,"IT",10);
        manager.work();
        manager.showDetails();
        manager.increaseSalary(250);
        manager.changeDepartment("management");

    }
}
