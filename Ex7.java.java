class BaseException extends Exception {}
class Base{
	Base() throws BaseException{
	throw new BaseException();
	}
}
	class Derived extends Base{
		Derived() throws BaseException{
	super();
	// not this way catch withoit try not allowed;
	//catch(BaseException e) {}
	//not this way either because call to super
	//must be first statement in constructor;
	//try{
	//super9;
    // } catch (BaseExvception e) {}
    }
}
	public class Ex7{
	public static void main(String args[]){
	try{
	Derived d = new Derived();
	} catch(BaseException e) {
	System.out.println("BaseException caught in main()");
	}
	}
	}