package encapsulation;

import java.util.Scanner;

public class Encaps3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Regist rg = new Regist();
		do
		{
			System.out.println("Registration");
		System.out.println("enter the name");
		rg.setName(s.next());
		System.out.println("enter the address");
		rg.setAdd(s.next());
		System.out.println("enter the contact no");
		rg.setCon(s.next());
		System.out.println("email id");
		rg.setEmail(s.next());
		System.out.println("proof type");
		rg.setProof(s.next());
		System.out.println("proof id");
		rg.setId(s.next());
		if(rg.getName()==null)
		{
			System.out.println("invalid name");
		}
		if(rg.getAdd()==null)
		{
			System.out.println("invalid address");
		}
		if(rg.getCon()==null)
		{
			System.out.println("invalid contact no");
		}
		if(rg.getEmail()==null)
		{
			System.out.println("invalid email id");
		}
		if(rg.getProof()==null)
		{
			System.out.println("invalid proof type");
		}
		if(rg.getId()==null)
		{
			System.out.println("invalid proof id");
		}
		}while(rg.getName()==null||rg.getAdd()==null||rg.getCon()==null||rg.getEmail()==null||rg.getProof()==null||rg.getId()==null);
		if(rg.getName()!=null&&rg.getAdd()!=null&&rg.getCon()!=null&&rg.getEmail()!=null&&rg.getProof()!=null&&rg.getId()!=null)
		{
			System.out.println("Registration successfull");
		Display1 ds=new Display1();
		ds.dis(rg.getName(), rg.getAdd(), rg.getCon(), rg.getEmail(), rg.getProof(), rg.getId());
		}

	}

}

class Regist {
	String name;
	String add;
	String con;
	String email;
	String proof;
	String id;

	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		 if (name.matches("[A-Z][a-z]*"))
         {
             this.name=name;
             return true;
         }
         else
         {
             
             return false;
         }
	}

	public String getAdd() {
		return add;
	}

	public boolean setAdd(String add) {
		 if (add.matches("[A-Z][a-z]*"))
         {
             this.add=add;
             return true;
         }
         else
         {
           
             return false;
         }
	}

	public String getCon() {
		return con;
	}

	public boolean setCon(String con) {
		  if (con.matches("^[0-9]*$"))
          {
              this.con=con;
              return true;
          }
          else
          {
             
              return false;
          }
	}

	public String getEmail() {
		return email;
	}

	public boolean setEmail(String email) {
		 if (email.contains("@"))
         {
             this.email=email;
             return true;
         }
         else
         {
            
             return false;
         }
	}

	public String getProof() {
		return proof;
	}

	public boolean setProof(String proof) {
		 if (proof.matches("[A-Z][a-z]*"))
         {
             this.proof=proof;
             return true;
         }
         else
         {
             
             return false;
         }
	}

	public String getId() {
		return id;
	}

	public boolean setId(String id) {
		 if (id.matches("^[0-9]*$"))
         {
             this.id=id;
             return true;
         }
         else
         {
            
             return false;
         }
	}

}
class Display1
{

	public void dis(String name, String add, String con, String email, String proof, String id) {
		System.out.println(name);
		System.out.println(add);
		System.out.println(con);
		System.out.println(email);
		System.out.println(proof);
		System.out.println(id);

}
}