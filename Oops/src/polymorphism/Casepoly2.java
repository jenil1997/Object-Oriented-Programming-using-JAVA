package polymorphism;

import java.util.Scanner;

public class Casepoly2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Currentbill cb = new Currentbill();
		Telebill tb = new Telebill();
		System.out.println("Enter the telephone bill number");
		tb.setPb(s.nextInt());
		System.out.println("Enter the customer name");
		tb.setName(s.next());
		System.out.println("Enter the no of calls made");
		tb.setNcm(s.nextInt());
		System.out.println("Enter the cost per call");
		tb.setCpc(s.nextFloat());
		System.out.println("Enter the current bill number");
		cb.setCb(s.nextInt());
		System.out.println("Enter the customer name");
		cb.setName1(s.next());
		System.out.println("Enter the no of units consumed");
		cb.setNuc(s.nextInt());
		System.out.println("Enter the cost per unit");
		cb.setCpu(s.nextFloat());
		tb.generatebill(tb.getPb(), tb.getName(), tb.getNcm(), tb.getCpc());
		cb.generatebill(cb.getCb(), cb.getName1(), cb.getNuc(), cb.getCpu());

	}

}

class Bill {
	String name, name1;

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	int cb, pb, ncm, nuc;
	float cpc, cpu;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCb() {
		return cb;
	}

	public void setCb(int cb) {
		this.cb = cb;
	}

	public int getPb() {
		return pb;
	}

	public void setPb(int pb) {
		this.pb = pb;
	}

	public int getNcm() {
		return ncm;
	}

	public void setNcm(int ncm) {
		this.ncm = ncm;
	}

	public int getNuc() {
		return nuc;
	}

	public void setNuc(int nuc) {
		this.nuc = nuc;
	}

	public float getCpc() {
		return cpc;
	}

	public void setCpc(float cpc) {
		this.cpc = cpc;
	}

	public float getCpu() {
		return cpu;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

}

class Telebill extends Bill {

	public void generatebill(int pb, String name, int ncm, float cpc) {
		System.out.println("Telephone bill number :" + pb);
		System.out.println("customer name :" + name);
		float t = ncm * cpc;
		System.out.println("Telephone bill amount :" + t);

	}
}

class Currentbill extends Bill {
	public void generatebill(int cb, String name1, int nuc, float cpu) {
		System.out.println("Current bill number :" + cb);
		System.out.println("customer name :" + name1);
		float t1 = nuc * cpu;
		System.out.println("Current bill amount :" + t1);

	}
}