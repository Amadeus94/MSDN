		
	package math_expression;
	public class Test26 {
		
		public int x;
		public int y;
		
//	  	private External external;
	  	
//	  	public MathComputation(External external) {
//	    	this.external = external;
//	  	}
		
	  	public void compute() {
	  		x = 21;
	  		y = x + 1 * 2;
//	    	x = 2 + 2;
//	    	y = this.external.sqrt(x);
	  	}
		
	  	interface External {
	    	public int sqrt(int n);
	  	}
}
