package chap3;

public class CallEmployee {
    public static void main(String[] args) {
        //call static attr & method
        System.out.println("Id ; "+Employee.id);
        Employee.work();
        
        //call non-ststic
        Employee em = new Employee();
        System.out.println("Name : "+em.name);
        System.out.println("Age : "+em.name);
        em.getSalary();  
    }    
}
