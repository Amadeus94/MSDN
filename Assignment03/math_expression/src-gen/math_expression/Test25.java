		
	package math_expression;
	public class Test25 {
		
		public int x;
		public int y;
		
//	  	private External external;
	  	
//	  	public MathComputation(External external) {
//	    	this.external = external;
//	  	}
		
	  	public void compute() {
	  		x = 20;
	  		y = 21 * 2;
//	    	x = 2 + 2;
//	    	y = this.external.sqrt(x);
	  	}
		
	  	interface External {
	    	public int sqrt(int n);
	  	}
}
