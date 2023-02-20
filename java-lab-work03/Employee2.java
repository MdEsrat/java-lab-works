public class Employee2 {
    private double salary;
    private String name;
    public Employee2(){
        this.salary = 20000;
        this.name = "John";
    }
    public Employee2(double salary, String name){
        this.salary = salary;
        this.name = name;
    }
    public double getValue(){
        return salary;
    }
    public String getValue2(){
        return name;
    }
    public static void main(String[] args){
        Employee2 e1 = new Employee2();
        Employee2 e2 = new Employee2(10000, "John");
        System.out.println("Employee1 is:"+e1.getValue2()+" & "+"Salary is:"+e1.getValue());
        System.out.println("Employee1 is:"+e2.getValue2()+" & "+"Salary is:"+e2.getValue());
    }
}
