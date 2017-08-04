import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int opcion ;
		int num1;
		int num2;
		int resul ;
		 
	    System.out.println(" Ingrese la operacion que desea");
	    System.out.println("1. Suma");
	    System.out.println("2.Resta");
	    System.out.println("3.Multiplicacion");
	    System.out.println("4.Division");
	    opcion=leer.nextInt();
	    
	    System.out.println(" Ingrese el primer numero");
	    num1=leer.nextInt();
	    System.out.println("Ingrese el segundo numero");
		num2=leer.nextInt();
		
		switch (opcion){
		case 1:
			resul =num1+num2;
			System.out.println("El resultado es"+resul);
			break;
		case 2:
			resul =num1-num2;
			System.out.println("El resultado es"+resul);
			break;
			
		case 3:
			resul =num1*num2;
			System.out.println("El resultado es"+resul);
			break;
			
		case 4:
			resul =num1/num2;
			System.out.println("El resultado es"+resul);
			break;
		
		
		
		}
	}

}