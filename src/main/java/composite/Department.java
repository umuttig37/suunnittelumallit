package composite;

import java.util.ArrayList;
import java.util.List;

public class Department extends OrgComponent {
    private List<OrgComponent> components = new ArrayList<>();
    public Department(String name) {
        super(name);
    }
    @Override
    public void add(OrgComponent component) {
        components.add(component);
    }
    @Override
    public void remove(OrgComponent component) {
        components.remove(component);
    }
    @Override
    public double getSalary() {
        double total = 0;
        for (OrgComponent comp : components) {
            total += comp.getSalary();
        }
        return total;
    }
    @Override
    public void printXml(String indent) {
        System.out.println(indent + "<department name=\"" + name + "\">");
        for (OrgComponent comp : components) {
            comp.printXml(indent + "  ");
        }
        System.out.println(indent + "</department>");
    }
}

