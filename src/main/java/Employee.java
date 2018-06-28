public abstract class Employee {

    private String name;
    private int ni;
    protected double salary;

    public Employee(String name, int ni, double salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getNi() {
        return this.ni;
    }

    public double getSalary() {
        return this.salary;
    }

    public void riaiseSalary(double amount){
        this.salary += amount;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
