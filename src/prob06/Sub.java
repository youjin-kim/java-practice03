package prob06;

public class Sub {
	protected int a;
	protected int b;
	
	void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	int calculate()
	{
		return (a - b);
	}

}
