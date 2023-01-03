import java.util.Scanner;
public class MaximumFinder
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Entre com 3 Numeros de ponto flutuantes separados por espaços");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		double result = maximum(num1, num2, num3);
		System.out.println("O Maior é:" + result);
	}
	public static double maximum(double x, double y, double z) 
	{
	double max= x;
	
	if(y > max)
		max = y;
	if(z > max)
		max = z;
	return max;
}
}