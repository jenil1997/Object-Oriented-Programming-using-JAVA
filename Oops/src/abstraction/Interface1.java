package abstraction;

import java.util.Scanner;

public class Interface1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.next();
        System.out.println("Enter the ID");
        int id=sc.nextInt();
        System.out.println("Enter the total");
        int t=sc.nextInt();
        Student s = new Student();
        s.detail(name, id);
        s.total(t);
    }
}
interface rank{
    public  void detail(String name, int id);
}
interface total{
    public  void total(int t);
}
class Student implements rank,total{
    public void detail(String name, int id)
    {
        System.out.println("Name ->"+name);
        System.out.println("Student ID ->"+id);
    }    
    public void total(int t) {
        System.out.println("Total ->"+t);
        
    }
}
