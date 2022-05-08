class obj{
	private int a, b, c;
	obj(){
		a=b=c=0;
	}
	obj(int a, int b){
		this.a=a;
		this.b=b;
	}
	void addition() {
		c=a+b;
	}
	boolean judge(obj a) {
		return(a.c==c);
	}
}
public class pass_obj {
public static void main(String args[]) {
	obj a=new obj();
	obj b=new obj();
	obj c=new obj();
	a=new obj(91,94);
	a.addition();
	b=new obj(96,89);
	b.addition();
	c=new obj(100,94);
	c.addition();
	System.out.println("The answers of both the sums matches. "+a.judge(b));
	System.out.println("The answers of both the sums matches. "+a.judge(c));
	System.out.print("The answers of both the sums matches. "+b.judge(c));
}
}
