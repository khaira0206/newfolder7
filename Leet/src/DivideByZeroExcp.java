
			
public class DivideByZeroExcp extends Exception{
	void someMethod ()  {
		try {
		doStuff();
		}
		catch(Exception  me) {
			
			}
		}
	
	public static void main(String args[]) {
		
	  }
		void doStuff() throws DivideByZeroExcp  {
			try {
			throw new DivideByZeroExcp();
			}
			catch(DivideByZeroExcp me) {
			throw me;
			}
			}
}
