package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
        int age;
        String name;
        public Employee(int age, String name) {
            this.age = age;
            this.name = name;
        }
        @Override
        public String toString() {
            return "Employee [age=" + age + ", name=" + name + "]";
        }
        @Override
        public int compareTo(Employee o) {
            if(this.age > o.age) {
                return 1;
            } else {
                return -1;
            }
        }
    }
    
    public class ComparatorDemo {
        public static void main(String[] args) {
    
            Comparator<Employee> comp = (o1,  o2) -> o1.age > o2.age ? 1:-1;

            List<Employee> l1 = new ArrayList<>();
            l1.add(new Employee(11, "roopa"));
            l1.add(new Employee(17, "raksha"));
            l1.add(new Employee(41, "manu"));
            l1.add(new Employee(21, "anu"));
            l1.add(new Employee(71, "yash"));
    
          Collections.sort(l1, comp);
           System.out.println(l1);

          Collections.sort(l1);
          for(Employee e: l1) {
            System.out.println(e);
          }
         
        }
}
