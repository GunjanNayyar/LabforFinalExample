package pack1;
class Division{
	int divide()
	{
		int i=200,j=0,a;
		a=i/j;
		return a;
	}
}
public class FinalExample {

	public static void main(String[] args) {
		try //risky code
		{
			Division d=new Division();
			int ans=d.divide();
			System.out.println(ans);
		}
		catch(Exception e)  //exception handling code
		{
			System.out.println("Exception is fired");
			System.out.println(e);
			//System.out.println(e.printStackTrace());
			System.out.println(e.getMessage());
		}
		finally // cleanup code
		{
			System.out.println("I am in Finally block");
		}
		

	}

}
