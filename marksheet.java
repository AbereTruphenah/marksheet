package marksheet;
import java.util.Scanner;

public class marksheet {
	public static void main(String[] args) {
		
		int i1,i2,i3;
		String a1,a2,a3;
		int b1,b2,b3;
		int c1,c2,c3;
		int d1,d2,d3;
		int e1,e2,e3;
		int f1,f2,f3;
		int g1,g2,g3;
		double h1,h2,h3;
		double p1,p2,p3,p4,p5;
		Scanner input=new Scanner(System.in);
		System.out.println("sNo");
		i1=input.nextInt();
				i2=input.nextInt();
				i3=input.nextInt();
		System.out.println("name");
		a1=input.next();
				a2=input.next();
				a3=input.next();
		System.out.println("sub1");
		b1=input.nextInt();
				b2=input.nextInt();
				b3=input.nextInt();
		System.out.println("sub2");
		c1=input.nextInt();
				c2=input.nextInt();
				c3=input.nextInt();
		System.out.println("sub3");
		d1=input.nextInt();
				d2=input.nextInt();
				d3=input.nextInt();
		System.out.println("sub4");
		e1=input.nextInt();
				e2=input.nextInt();
				e3=input.nextInt();
		System.out.println("sub5");
		f1=input.nextInt();
				f2=input.nextInt();
				f3=input.nextInt();
			System.out.println("Welcome to Student Mark List Application");
			System.out.println("");
		System.out.println("_________________________________________________________________________________");
		System.out.println("SNo     Student Number  Sub1    Sub2    Sub3    Sub4    Sub5    Total   Average");
	System.out.println("_________________________________________________________________________________");
	;
	System.out.print(""+i1);
		System.out.print("\t"+a1);
		System.out.print("\t\t"+b1);
		System.out.print("\t"+c1);
		System.out.print("\t"+d1);
		System.out.print("\t"+e1);
		System.out.print("\t"+f1);
		g1=b1+c1+d1+e1+f1;		
		System.out.print("\t"+g1);
		h1=g1/5;
		System.out.println("\t"+h1);
		System.out.print(""+i2);
		System.out.print("\t"+a2);
		System.out.print("\t\t"+b2);
		System.out.print("\t"+c2);
		System.out.print("\t"+d2);
		System.out.print("\t"+e2);
		System.out.print("\t"+f2);
		g2=b2+c2+d2+e2+f2;
		System.out.print("\t"+g2);
		h2=g2/5;
		System.out.println("\t"+h2);
		System.out.print(""+i3);
		System.out.print("\t"+a3);
		System.out.print("\t"+b3);
		System.out.print("\t"+c3);
		System.out.print("\t"+d3);
		System.out.print("\t"+e3);
		System.out.print("\t"+f3);
		g3=b3+c3+d3+e3+f3;
		System.out.print("\t"+g3);
		h3=g3/5;
		System.out.println("\t"+h3);
		System.out.println("_________________________________________________________________________________");
		p1=(b1+b2+b3)/3;
		p2=(c1+c2+c3)/3;
		p3=(d1+d2+d3)/3;
		p4=(e1+e2+e3)/3;
		p5=(f1+f2+f3)/3;
		System.out.print("               Average ");
		System.out.print(" "+p1);
		System.out.print("\t"+p2);
		System.out.print("\t"+p3);
		System.out.print("\t"+p4);
		System.out.println("\t"+p5);		
		System.out.println("");
		System.out.println("_________________________________________________________________________________");
	
			
	}
}


