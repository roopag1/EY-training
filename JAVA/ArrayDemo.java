class Employee{

    int eid;
    String name;
    int salary;

}

public class ArrayDemo {
    public static void main(String[] args) {
        
        Employee a1=new Employee();
        a1.eid=1;
        a1.name="Roopa G";
        a1.salary=500000;
        
        Employee a2=new Employee();
        a2.eid=2;
        a2.name="Anu";
        a2.salary=600000;

        Employee a3=new Employee();
        a3.eid=3;
        a3.name="kavya";
        a3.salary=400000;

        Employee empArr[] = new Employee[3];
        empArr[0]=a1;
        empArr[1]=a2;
        empArr[2]=a3;

        for(Employee employee:empArr){
            System.out.println(employee);
            System.out.println(employee.eid+ " "+ employee.name+ " "+ employee.salary);
        }


    }
}