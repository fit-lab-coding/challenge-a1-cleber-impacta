package fit.challenge;

public class ImcCalculator {

	public static String calculate(int peso, double altura) {
		String retorno = "";
		double imc = (peso)/Math.pow(altura, 2);
		
		if(imc < 18.5) {
			retorno = "Magreza";
		}else if(imc < 25) {
			retorno = "Normal";
		}else if(imc < 30) {
			retorno = "Sobrepeso";
		}else if (imc < 40) {
			retorno = "Obesidade";
		}else {
			retorno = "Obesidade Gravde";
		}
		
		return retorno;
	}

	public static String calculate(double peso, double altura) {
		String retorno = "";
		double imc = (peso)/Math.pow(altura, 2);
		
		if(imc < 18.5) {
			retorno = "Magreza";
		}else if(imc < 25) {
			retorno = "Normal";
		}else if(imc < 30) {
			retorno = "Sobrepeso";
		}else if (imc < 40) {
			retorno = "Obesidade";
		}else {
			retorno = "Obesidade Gravde";
		}
		
		return retorno;
	}
}
