package hello;

class Java{
	private int a=1;
	private static int b=2;
	public void say() {
		System.out.print(a+" "+b);
	}
	
	public static void main(String[] args) {
		Java[] w=new Java[3];
		for(int i=0;i<w.length;i++) {
			w[i]=new Java();
		}
		w[0].b+=1;
		w[0].a+=1;
		System.out.print(w[1].b);
		System.out.print(w[1].a);
	}
	
	
}
