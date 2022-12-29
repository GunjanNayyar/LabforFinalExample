package pack1;

public class ThrowExample {

	public static void main(String[] args) {
		try
		{
			int i=200, j=0;
			System.out.println(i/j);
		}
		catch(ArithmeticException e) //rethrowing exception
		{
			throw new ArithmeticException("divide by zero exception");
		}
		

	}

}



public class Main {
    public static void main(String[] args) 
    {
       int i=2 ,j=4,a;
       a=i*j;
       if(a<10){
           throw new ArithmeticException("  Value of (a) should be atleast 10");
       }else{
           System.out.println("Value of a is more than  "  +a);
       }

    }
}















