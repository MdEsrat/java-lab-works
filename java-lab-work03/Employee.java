public class Employee {
    private int var;
    private float cgpa;
    public Employee(){
        this.var = 10;
        this.cgpa = 3.7f;
    }
    public Employee(int num, float cgpa){
        this.var = num;
        this.cgpa = cgpa;
    }
    public int getValue(){
        return var;
    }
    public float getValue2(){
        return cgpa;
    }
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee(100, 3.72f);
        System.out.println("Id is:"+e1.getValue()+" "+ "cgpa is"+" " +e1.getValue2());
        System.out.println("Id is:"+e2.getValue()+" "+ "cgpa is"+" " +e2.getValue2());
    }
}
