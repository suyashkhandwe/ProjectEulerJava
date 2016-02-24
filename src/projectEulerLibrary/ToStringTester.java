package projectEulerLibrary;

public class ToStringTester {
	
	private int testInt;
	
	public int getTestInt()
	{
		return this.testInt;
	}
	
	public void setITestInt(int value)
	{
		this.testInt = value;
	}
	
	public ToStringTester(int testValue) {
		setITestInt(testValue);
		System.out.println("Value is : " + this);
		
		String strLiteral1 = "strLiteral";
		String strLiteral2 = "strLiteral";
		String strLiteral3 = strLiteral2;
		
		String strObj1 = new String("strObj");
		String strObj2 = new String("strObj");
		String strObj3 = strObj2;
		
		if(strLiteral1 == strLiteral2)
		{
			System.out.println("1 == 2");
		}
		
		if(strLiteral1 == strLiteral3)
		{
			System.out.println("1 == 3");
		}
		
		if(strLiteral2 == strLiteral3)
		{
			System.out.println("2 == 3");
		}
				
		if(strLiteral2 == strLiteral3)
		{
			System.out.println("2 == 3");
		}

	}
	
	public String toString()
	{
		return String.format("%d",getTestInt());
		
				
	}
	
}
