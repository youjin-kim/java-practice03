package prob06;

public class Div {
	protected int a;
	protected int b;
	
	void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	int calculate()
	{
		if(b != 0) 
		{
			return (a / b);
		}
		else 
		{
			return 0;
		}
	}

}
