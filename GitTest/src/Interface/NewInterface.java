package Interface;

public interface NewInterface {

	
	 static void staticMethod()
	    {
	        System.out.println("Hello");
	    }
	  
	 
	 
	    void overrideMethod(String str);
	    
	    default void turnAlarmOn() {
	        System.out.println("Hello, default Method is Here");
	    }
}
