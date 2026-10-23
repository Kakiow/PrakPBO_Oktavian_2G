package Jobsheet9;

public class InternshipEmployee extends Employee {
    private int length;

    public InternshipEmployee(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override 
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registeres as internship employhee for " + length + " month/s\n";
        return info;
    }
}
