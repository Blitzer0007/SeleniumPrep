package Java_Basics.Collections;

public class EmpClass_ComparableInterFace implements  Comparable<EmpClass_ComparableInterFace>{

    private int id = 0;
    private String name = null;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmpClass_ComparableInterFace(int id, String name, double salary){

        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    @Override
    public String toString() {
        return "EmpClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(EmpClass_ComparableInterFace emp) {
        return this.salary>emp.salary?-1:this.salary<emp.salary?1:0;
    }
}
