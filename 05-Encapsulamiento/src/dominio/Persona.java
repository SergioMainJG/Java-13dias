package dominio;

public class Persona {

    private String name;
    private Double salary;
    private boolean eliminate;

    public Persona(String name, Double salary, boolean eliminate) {

        this.name = name;
        this.salary = salary;
        this.eliminate = eliminate;

    }

    public String getName() {
        return this.name;
    }

    public Double getSalary() {
        return this.salary;
    }

    public boolean isEliminate() {
        return this.eliminate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setEliminate(boolean eliminate) {
        this.eliminate = eliminate;
    }

}
