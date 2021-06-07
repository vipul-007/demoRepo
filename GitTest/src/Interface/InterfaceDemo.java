package Interface;

public class InterfaceDemo implements NewInterface {

	   public static void main(String[] args)
	    {
	        InterfaceDemo interfaceDemo = new InterfaceDemo();
	  
	        NewInterface.staticMethod();
	  
	        
	        interfaceDemo.overrideMethod("Hello, Override abstract Method here");
	        
	        interfaceDemo.turnAlarmOn();
	      
	        
	    }
	  

	  
	    public void overrideMethod(String str)
	    {
	        System.out.println(str);
	    }
	
	   public void turnAlarmOn()
	    {
	    	   System.out.println("Hello, overridden default Method is Here");
	    }
}
