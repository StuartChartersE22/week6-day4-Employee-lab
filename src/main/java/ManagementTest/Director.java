package ManagementTest;

public class Director extends Manager {

    private double budget;

    public Director(String name, int ni, double salary, String deptname, double budget){
        super(name, ni, salary, deptname);
        this.budget = budget;
    }


    public double getBudget() {
        return this.budget;
    }

    @Override
    public double payBonus(){
        return this.salary * 0.02;
    }
}
