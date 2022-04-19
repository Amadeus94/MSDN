		
	package math_expression;
	public class MathComputation {
		
		public int i;
		public int j;
		public int dog;
		
	  	private External external;
	  	
	  	public MathComputation(External external) {
	    	this.external = external
	  	}
		
	  	public void compute() {
	  		i = 20 + 30;
	  		j = 30;
	  		dog = 5;
	    	x = 2 + 2;
	    	y = this.external.sqrt(x);
	  	}
		
	  	interface External {
	    	public int sqrt(int n);
	  	}
}
