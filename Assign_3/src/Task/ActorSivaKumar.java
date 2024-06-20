package Task;

public class ActorSivaKumar implements Actor{
	int age;
	String car;
	
	
	String address= "coimbatore";
	
	public ActorSivaKumar(int age, String car) {
		this.age = age;
		this.car = car;
	}
		// TODO Auto-generated constructor stub
	
	public static void main(String[] args) {
		ActorSivaKumar as = new ActorSivaKumar(65, "Audi car"); 
		Actor ac = new ActorSivaKumar(45,"BMW");
		as.speaking();
		ac.act();
		ac.dance();
		ac.sing("Sivakumar : ");
		
		as.act();
		as.dance();
		as.sing("Suriya : ");
	}
	void speaking() {
		System.out.println("1) He is speaking from "+ address);
}
	public void act() {
		System.out.println("2) His age is " + age);
	}
    public void dance() {
    	if(makeUpRequired) {
	System.out.println("3) He owns a " + car);}
    	else {
    		System.out.println("Not yet");
    	}
}
    public String sing(String no) {
    	System.out.println(no + " His origin is "+ variable);
    	return no;
    }}
