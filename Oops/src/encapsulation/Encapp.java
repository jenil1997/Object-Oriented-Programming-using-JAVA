package encapsulation;
import java.util.Scanner;

public class Encapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Ticket t=new Ticket();
		          System.out.println("price");
		          t.setPrice(s.nextInt());
		          System.out.println("Number of persons");
		          t.setN(s.nextInt());
		          for(int j=0;j<t.getN();j++)
		          {
		         
		          System.out.println("Name");
		          t.setName(s.next());
		          System.out.println("age");
		          t.setAge(s.nextInt());
		          System.out.println(" gender");
		          t.setGen(s.next());
		          t.tik(t.getName(),t.getAge(),t.getGen());
		          }
		         
		         

		}

		}
		class person extends Ticket
		{

		}

		class Ticket
		{
		int price,num,age,n,pr;
		public int getN() {
		return n;
		}
		public void tik(String name2, int age2, String gen2) {
		// TODO Auto-generated method stub
		System.out.println("Name");
		       

		System.out.println(name2);
		System.out.println(age2);
		System.out.println(gen2);




		}
		public void setN(int n) {
		this.n = n;
		}
		String gen,name;
		public int getPrice() {
		return price;
		}
		public void setPrice(int price) {
		this.price = price;
		}
		public int getNum() {
		return num;
		}
		public void setNum(int num) {
		this.num = num;
		}
		public int getAge() {
		return age;
		}
		public void setAge(int age) {
		this.age = age;
		}
		public String getGen() {
		return gen;
		}
		public void setGen(String gen) {
		this.gen = gen;
		}
		public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}

		}



