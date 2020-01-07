
public class Hello {

	public static void main(String args[]){
		
		
		float SalarioMin, QtdKW;
		
		SalarioMin = Float.parseFloat(args[0]);
		QtdKW = Float.parseFloat(args[1]);
		
		float CKW = SalarioMin/7;
		float KW = CKW/100;
		float VP = QtdKW*KW;
		float NV = VP-VP/10;
		
		System.out.println("Preço de 100KW = "+ CKW);
		System.out.println("Preço do KW = "+ KW);
		System.out.println("Valor a pagar = "+ VP);
		System.out.println("Valor com desconto = "+ NV);
		
		
	}
}
