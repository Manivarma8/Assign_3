package Task_2;

 abstract class FactoryDemo2 extends SmartPhone{
	boolean isOriginalPiece = false;
	static int price = 0;
	
   abstract void verifyFingerPrint();
   
   abstract void providePattern();
   
   void browse() {
	   System.out.println("Factory Demo browsing");
   }
}
