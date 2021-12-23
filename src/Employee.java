public class Employee {

    String name;
    int salary;
    double workHours;
    int hireYear;

    public Employee() {
    }
    

    public Employee(String name, int salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {

        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int thisyear = 2021;
        if (thisyear-this.hireYear < 10) {
            return this.salary*0.05;
        }
        else if (thisyear-this.hireYear >=10 && thisyear-this.hireYear<20 ) {
            return this.salary*0.10;
        }
        else{
            return this.salary*0.15;
        }
    }
    public void ShowInformations(){
        System.out.println("Employee's name: "+this.name);
        System.out.println("Employee's normal salary : "+this.salary);
        System.out.println("Employee's workhours : "+this.workHours);
        System.out.println("Employee's first start working year for this company: "+this.hireYear);
        double performancesalary;
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        performancesalary = this.salary+bonus+raise-tax;
        System.out.println("Tax : "+tax);
        System.out.println("Bonus : "+bonus);
        System.out.println("Raise : "+raise);
        System.out.println("Employee's salary with the performance : "+performancesalary);
    }
}
