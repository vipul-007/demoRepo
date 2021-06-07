package Interface;

public interface NewInterface {

	
	 static void staticMethod()
	    {
	        System.out.println("Hello, New Static Method Here");
	    }
	  
	 
	 
	    void overrideMethod(String str);
	    
	    default void turnAlarmOn() {
	        System.out.println("Hello, default Method is Here");
	    }
}
