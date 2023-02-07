package work;

@FunctionalInterface
public interface MyInterface {
	

	/*functional interface having single method only then
	 *  we can use @FunctionalInterface...
	 * Data abstraction is the process of hiding certain details and showing only
	 * essential information to the user
	 */
	public abstract void sayHello();
	// method to use FunctionalInterface
	//1)..by creating separate class =>class MyInterImpl
	//2)...anonymous class for implementing interface
	//3)..using lamda expression
}
