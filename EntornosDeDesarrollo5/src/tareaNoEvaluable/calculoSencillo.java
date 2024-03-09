package tareaNoEvaluable;

public class calculoSencillo {

	public static void main(String[] args) {

		int num1,num2,num3,resultado;
		
		num1 = 4;
		num2 = 12;
		num3 = 7;

		resultado = num1+num2+num3;
		
		System.out.println("La suma de los números 4, 12 y 7 es: "+resultado);
		
		resultado = (num2-num1)+num3;
		
		System.out.println("El resultado de (12 - 4) + 7 es: "+resultado);
		
		resultado = num1*num3 - num2;
		
		System.out.println("El resultado de 4 x 7 - 12 es: "+resultado);

	}

}
