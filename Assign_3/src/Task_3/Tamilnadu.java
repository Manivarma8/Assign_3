package Task_3;

public class Tamilnadu extends SouthIndia{
static String capital = "Chennai";
Tamilnadu(String primeMinister){
	super(primeMinister);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		India Ind = new Tamilnadu(" 1) Modiindia");
		Tamilnadu tamil = new Tamilnadu(" 2) Moditamil");
		SouthIndia si = new Tamilnadu(" 3) Modisouth");
		String India = Ind.capital;
		String Tamil = tamil.capital;
	System.out.println("4) India's Capital is " + India);
	System.out.println("5) Tamilnadu's capital is " + Tamil);
	
	si.speakLanguage();
	si.eat();
	si.dress();
	si.cultivate();
	si.livingStyle();
		

		
	}
@Override 
void speakLanguage() {
	System.out.println("6) In India people speak various languages as for them birth place in "+ capital + " people would speak Tamil");
}

@Override
void eat() {
	System.out.println("7) People love to have different types of foods in india in "+ capital + " idly dosa are special");
}

@Override
void dress() {
	System.out.println("8) In " + capital + " People used to wear western culture");
}

void cultivate() {
	System.out.println("9) Rice and sugarcane Cultivation");
}

void livingStyle() {
	System.out.println("10) Above Average development");
}
}
