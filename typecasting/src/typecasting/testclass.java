package typecasting;

public class testclass {
	public p testmethod()
	{
		p P=new p();
		q q8=new q();
		
		return q8;
		
		
	}
	
	public r testmethod1()
	{
		r r9=new r();
		return r9;
		
		
		
		
		
	}
	public static void main(String[] args) {
		
		testclass test=new testclass();
		p p8=test.testmethod();
		System.out.println(p8.i);
		p8.m1();
		r r15=test.testmethod1();
		System.out.println(r15.i+" "+r15.j+" "+r15.k);
		r15.m1();
		r15.m2();
		r15.m3();
		
		
	}
	
	
	
	
	
	
	
}
