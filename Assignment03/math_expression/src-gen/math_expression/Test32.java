		
	package math_expression;
	public class Test32 {
		
		public int a;
		public int b;
		public int c;
		public int d;
		public int e;
		
//	  	private External external;
	  	
//	  	public MathComputation(External external) {
//	    	this.external = external;
//	  	}
		
	  	public void compute() {
	  		a = 40;
	  		b = 40 + 2;
	  		c = 40 + 5 - 10 - 8;
	  		d = 40 + 2 * 4 + 80;
	  		e = (40 + 2) * (4 + 80);
//	    	x = 2 + 2;
//	    	y = this.external.sqrt(x);
	  	}
		
	  	interface External {
	    	public int sqrt(int n);
	  	}
}
