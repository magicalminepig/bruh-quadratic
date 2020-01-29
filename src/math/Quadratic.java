package math;

public class Quadratic
{
	private double A;
	private double B;
	private double C;

	public Quadratic(double a,double b,double c)
	{
		A = a;
		B = b;
		C = c;
	}
	
	public String getans1()
	{
		double X = (4*A*C);
		boolean i = false;
		
		if ((B*B) < X)
		{
			i = true;
		}
		
		
		if (i==true)
		{
			return Double.toString(-B/(2*A)) + " + " + Double.toString(Math.sqrt(-1*((B*B)-X))/2*A) + "i";
		}
		
		else
		{
			return Double.toString((-B+Math.sqrt((B*B)-X))/(2*A));
		}
	}
	public String getans2()
	{
		double X = (4*A*C);
		boolean i = false;
		
		if ((B*B) < X)
		{
			i = true;
		}
		
		
		if (i==true)
		{
			return Double.toString(-B/(2*A)) + " - " + Double.toString(Math.sqrt(-1*((B*B)-X))/2*A) + "i";
		}
		
		else
		{
			return Double.toString((-B-Math.sqrt((B*B)-X))/(2*A));
		}
		
		
		
	}
	
	public void setA(double a)
	{
		A = a;
	}
	
	public void setB(double b)
	{
		B = b;
	}
	
	public void setC(double c)
	{
		C = c;
	}

}
