package com.example.taschenrechner;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Rechner {

	double zahl1;
	double zahl2;
	double erg;

	
	public double getZahl1() {
		return zahl1;
	}

	public void setZahl1(double zahl1) {
		this.zahl1 = zahl1;
	}

	public double getZahl2() {
		return zahl2;
	}

	public void setZahl2(double zahl2) {
		this.zahl2 = zahl2;
	}

	public double getErg() {
		return erg;
	}

	public void setErg(double erg) {
		this.erg = erg;
	}

//	public double multipliziere(double z1, double z2) {
//
//		this.erg = z1 * z2;
//		return this.erg;
//	}
//
//	public double dividiere(double z1, double z2) {
//		this.erg = z1 / z2;
//		return this.erg;
//	}
//
//	public double addiere(double z1,double z2) {
//		this.erg = z1 + z2;
//		return this.erg;
//	}
//
//	public double subtrahiere(double z1, double z2) {
//		this.erg = z1 - z2;
//		return this.erg;
//	}
	public double zieheWurzel(double z1){
		
		double wurzel = Math.sqrt(z1);
		return wurzel;
		
	}
	public double rechneQuadrat(double z1){
		double quadrat = z1*z1;
		return quadrat;
	}
//	public double rechnemitEval(String string) {
//		ScriptEngineManager manager = new ScriptEngineManager();
//		ScriptEngine engine = manager.getEngineByName("js");        
//	    Object result = null;
//		try {
//			result = engine.eval(string);
//		} catch (ScriptException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    return (double) result;
//		
//	}
	public double rechne(String string) {
		Expression calc = new ExpressionBuilder(string).build();
				double result1=calc.evaluate();
				return result1;
	}
	
	
	
	
	

}
