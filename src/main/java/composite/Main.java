package composite;

public class Main {
    public static void main(String[] args) {
        Department root = new Department("Head Office");
        Employee e1 = new Employee("Alice", 70000);
        Employee e2 = new Employee("Bob", 80000);
        root.add(e1);
        root.add(e2);

        Department subDept = new Department("R&D");
        subDept.add(new Employee("Charlie", 90000));
        subDept.add(new Employee("Diana", 95000));
        root.add(subDept);

        System.out.println("Total salary: " + root.getSalary());
        System.out.println("Organization Structure in XML:");
        root.printXml("");
    }
}
