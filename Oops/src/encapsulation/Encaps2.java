package encapsulation;

import java.util.Scanner;

public class Encaps2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Regis rg = new Regis();
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
		Display ds=new Display();
		ds.dis(rg.getName(), rg.getAdd(), rg.getCon(), rg.getEmail(), rg.getProof(), rg.getId());

	}

}

class Regis {
	String name;
	String add;
	String con;
	String email;
	String proof;
	String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getCon() {
		return con;
	}

	public void setCon(String con) {
		this.con = con;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProof() {
		return proof;
	}

	public void setProof(String proof) {
		this.proof = proof;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
class Display
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