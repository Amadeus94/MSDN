		
	package math_expression;
	public class Test04 {
		
		public int x;
		public int y;
		
//	  	private External external;
	  	
//	  	public MathComputation(External external) {
//	    	this.external = external;
//	  	}
		
	  	public void compute() {
	  		x = 46 - 4;
	  		y = 23 - 4;
//	    	x = 2 + 2;
//	    	y = this.external.sqrt(x);
	  	}
		
	  	interface External {
	    	public int sqrt(int n);
	  	}
}
