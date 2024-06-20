package Task_3;

public abstract class India {
 
	abstract void speakLanguage();
	
	abstract void eat();
	
	abstract void dress();
	
	static String capital = "New Delhi";
	
	India(String primeMinister){
		System.out.println("our Prime Minister is" + primeMinister);
	}
}
