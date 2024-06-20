package Task_2;

 abstract class SmartPhone {
	 
  abstract int call(int seconds);
  
  abstract void sendMessage();
  
  abstract void receiveMessage();
  
  void browse() {
	  System.out.println("Smartphone browsing");
	  
  }
  SmartPhone(){
	  System.out.println("Smartphone under development");
  }
   
}
