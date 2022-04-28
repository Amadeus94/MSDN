		
	package math_expression;
	public class Test33 {
		
		public int a;
		public int b;
		public int c;
		public int d;
		
//	  	private External external;
	  	
//	  	public MathComputation(External external) {
//	    	this.external = external;
//	  	}
		
	  	public void compute() {
	  		a = 40;
	  		b = a * 2;
	  		c = b * 3;
	  		d = c + 4;
//	    	x = 2 + 2;
//	    	y = this.external.sqrt(x);
	  	}
		
	  	interface External {
	    	public int sqrt(int n);
	  	}
}
