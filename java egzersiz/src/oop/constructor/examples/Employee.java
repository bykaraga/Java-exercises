package oop.constructor.examples;

public class Employee {
    private String name;
    private int workHours,hireYear;
     double salary;

    Employee(String name ,double salary,int workHours,int hireYear ){
        this.name = name;
        this.hireYear = hireYear;
        this.salary = salary;
        this.workHours = workHours;

    }

    public double tax(){
if(this.salary >= 1000){
return salary * 0.03;
}

return 0.0;
}
public double bonus(){
       int exstraHour = this.workHours-40;
       if(exstraHour>0){
           return  30*exstraHour;
       }return 0.0;
    }

public double RaiseSalary(){
    int workYears = 2025 - this.hireYear;
    double raise;
        if(workYears <10){
            return (this.salary * 0.05);

        } else if (workYears <20 && workYears >=10) {
            return(this.salary * 0.1);
        } else if (workYears >19) {
            return(this.salary * 0.15);
        }
    return  this.salary;
}



public void toString(Employee emp){
    System.out.println("--------------------------");
    System.out.println("name : "+emp.name);

        System.out.println("Tax : "+emp.tax());
    System.out.println("Bonus : "+emp.bonus());
    System.out.println("Incrase Salary : "+emp.RaiseSalary());
    double totalSalary = emp.salary - emp.tax()+ emp.bonus();
    System.out.println("salary without tax : "+emp.salary);
    System.out.println("total salary with tax and bonus : "+totalSalary);
    System.out.println("total salary with raise of salary : "+(emp.salary+ emp.RaiseSalary() +emp.bonus()-emp.tax() ) );
    System.out.println("--------------------------");
}

}




