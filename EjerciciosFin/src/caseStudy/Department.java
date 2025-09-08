package caseStudy;

import java.util.ArrayList;

public class Department{
    private String name;
    private ArrayList<Employee> employees;
    public Department(String name, ArrayList<Employee> employees) throws NumberEmployeesExceededException{
        this.name = name;
        if(employees.size() <= 10){
            this.employees = employees;
        }
        else {
            throw new NumberEmployeesExceededException("Number of employees exceded");
        }
    }
    public Department(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    @Override
    public String toString(){
        return this.name;
    }
    public void addEmployee(Employee e){
        employees.add(e);
    }
    public void showEmployees() throws NullPointerException{
        for (Employee e : employees){
            System.out.println(e.toString());
        }
    }
    public int numberEmployees(){
        return this.employees.size();
    }
    public Employee getEmployeeById(int id){
        for(Employee e : employees){
            if (e.getId() == id) return e;
        }
        return new Employee();
    }
    public double totalSalary(){
        double total = 0;
        for(Employee e : employees){
            total += e.getSalary();
        }
        return total;
    }
    public double avgSalary(){
        return totalSalary()/employees.size();
    }
}