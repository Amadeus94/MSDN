		
	package math_expression;
	public class Test14 {
		
		public int x;
		public int y;
		public int z;
		
//	  	private External external;
	  	
//	  	public MathComputation(External external) {
//	    	this.external = external;
//	  	}
		
	  	public void compute() {
	  		x = 42;
	  		y = 100 - 20 + 10 - 3;
	  		z = 100 * 20 / 10 * 3;
//	    	x = 2 + 2;
//	    	y = this.external.sqrt(x);
	  	}
		
	  	interface External {
	    	public int sqrt(int n);
	  	}
}
