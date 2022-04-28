/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.math.Div
import dk.sdu.mmmi.mdsd.math.LetBinding
import dk.sdu.mmmi.mdsd.math.MathExp
import dk.sdu.mmmi.mdsd.math.MathNumber
import dk.sdu.mmmi.mdsd.math.Minus
import dk.sdu.mmmi.mdsd.math.Mult
import dk.sdu.mmmi.mdsd.math.Plus
import dk.sdu.mmmi.mdsd.math.VarBinding
import dk.sdu.mmmi.mdsd.math.VariableUse
//import java.util.HashMap
//import java.util.Map
//import javax.swing.JOptionPane
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mmmi.mdsd.math.Paranthesis

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MathGenerator extends AbstractGenerator {	

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		/*==========	Added 	================ */

		val math = resource.allContents.filter(MathExp).next	
//		fsa.generateFile("MathExpression.java", math.compile)		
	//	fsa.generateFile("math_expression/" + math.name+".java", math.compile)
		 fsa.generateFile('''math_expression/«math.name.toFirstUpper».java''', math.compile)		
//	 	fsa.generateFile(e.fullyQualifiedName.toString("/")+".java", math.compile)		

		/*==========	Added 	================ */
		
		
//		val math = resource.allContents.filter(MathExp).next			
//		val result = math.compute
//		result.displayPanel
//		
	}
	

	def compile(MathExp math)'''
		
	package math_expression;
	public class «math.name» {
		
		«FOR variable:math.variables»
			public int «variable.name»;
		«ENDFOR»
		
		«FOR variable:math.functions»
					public int «variable.name»;
		«ENDFOR»
				
//	  	private External external;
	  	//	  	public MathComputation(External external) {
	  	//	    	this.external = external;
	  	//	  	}
	  	
	  	«FOR function:math.functions»
	  		private «function.name» «function.name»2	
	  	«ENDFOR»
	  	
	  	
	  	«FOR variable:math.variables»
	  		mahthpublic int «variable.name»;
	  	«ENDFOR»
	  	
	  	
		
	  	public void compute() {
	  		«FOR variable:math.variables»
	  		«variable.name» = «variable.expression.compileExpression»;
	  		«ENDFOR»

//	    	y = this.external.sqrt(x);
	  	}
		
	  	interface External {
	    	public int sqrt(int n);
	  	}
}
'''
	

	
	
	
	
	// Very smart - Just overload it instead of switch case
	def static dispatch String compileExpression(MathNumber exp) {
		exp.value.toString // not sure if correct way of doing it	
	}

	def static dispatch String compileExpression(Plus exp) {
		return exp.left.compileExpression + ' + ' + exp.right.compileExpression
	}
	
	def static dispatch String compileExpression(Minus exp) {
		return exp.left.compileExpression + ' - ' + exp.right.compileExpression
	}
	
	def static dispatch String compileExpression(Mult exp) {
		return  exp.left.compileExpression + ' * ' + exp.right.compileExpression
	}
	
	def static dispatch String compileExpression(Div exp) {
		return exp.left.compileExpression + ' / ' + exp.right.compileExpression
	}
	
		
	def static dispatch String compileExpression(Paranthesis expr) {
		return '(' + expr.exp.compileExpression + ')' 
	}
	
	
	def static dispatch String compileExpression(LetBinding exp) {
		return exp.body.compileExpression // No idea
	}
	
	
	
	def static dispatch String compileExpression(VariableUse varUse) {
		val ref = varUse.ref
		switch ref{
			VarBinding: return varUse.ref.name
		    LetBinding: return ref.binding.compileExpression 

		    //		    LetBinding: return "let " + ref.name + " = " + ref.binding.compileExpression + " in " 
		    	//+ ref.body.compileExpression//+ varUse.ref.name + " + " +varUse.compileExpression +" in " //+ varUse.ref.body.compileExpression
		}
		
//		exp.ref.computeBinding
		//""
	}





	//static Map<String, Integer> variables;
	

//		
//	def void displayPanel(Map<String, Integer> result) {
//		var resultString = ""
//		for (entry : result.entrySet()) {
//         	resultString += "var " + entry.getKey() + " = " + entry.getValue() + "\n"
//        }
//		
//		JOptionPane.showMessageDialog(null, resultString ,"Math Language", JOptionPane.INFORMATION_MESSAGE)
//	}
	
//	def static compute(MathExp math) {
//		variables = new HashMap()
//		for(varBinding: math.variables)
//			varBinding.computeExpression()
//		variables
//	}
//	
	
	
	//	def static dispatch int computeExpression(VarBinding binding) {
//		variables.put(binding.name, binding.expression.computeExpression())
//		return variables.get(binding.name)
//	}
	
	
	
	// Very smart - Just overload it instead of switch case
//	def static dispatch int computeExpression(MathNumber exp) {
//		exp.value
//	}
//
//	def static dispatch int computeExpression(Plus exp) {
//		exp.left.computeExpression + exp.right.computeExpression
//	}
//	
//	def static dispatch int computeExpression(Minus exp) {
//		exp.left.computeExpression - exp.right.computeExpression
//	}
//	
//	def static dispatch int computeExpression(Mult exp) {
//		exp.left.computeExpression * exp.right.computeExpression
//	}
//	
//	def static dispatch int computeExpression(Div exp) {
//		exp.left.computeExpression / exp.right.computeExpression
//	}
//	
	
	
	
	

//	def static dispatch int computeExpression(LetBinding exp) {
//		exp.body.computeExpression
//	}
//	
//	def static dispatch int computeExpression(VariableUse exp) {
//		exp.ref.computeBinding
//	}
//
//	def static dispatch int computeBinding(VarBinding binding){
//		if(!variables.containsKey(binding.name))
//			binding.computeExpression()			
//		variables.get(binding.name)
//	}
//	
//	def static dispatch int computeBinding(LetBinding binding){
//		binding.binding.computeExpression
//	}
	
	
	
}

