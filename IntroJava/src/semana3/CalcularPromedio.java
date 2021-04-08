package semana3;

public class CalcularPromedio{

	public static void main(String[] args) {

		int num1 = Integer.valueOf(args[0]);
		int num2 = Integer.valueOf(args[1]);
		int num3 = Integer.valueOf(args[2]);
		
		int promedio = (num1 + num2 + num3)/3;
		
		if(promedio < 10) {
			System.out.println(promedio);
		}else if(promedio > 10) {
			System.out.println(promedio + num1 + num2 + num3);
		}
		
	}

}