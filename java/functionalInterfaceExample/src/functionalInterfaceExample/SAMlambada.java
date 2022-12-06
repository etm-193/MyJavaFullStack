package functionalInterfaceExample;

import java.util.function.*;

public class SAMlambada {

	public static void main(String[] args) {
		Function<Integer, String> verboseLambda = (Integer x)-> { return Integer.toString(x*x); };
		System.out.println(verboseLambda.apply(3));
	}
	
}
