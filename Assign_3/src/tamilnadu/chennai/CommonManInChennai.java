package tamilnadu.chennai;

public class CommonManInChennai implements TrafficRules{

	public static void main(String[] args) {
		CommonManInChennai com = new CommonManInChennai();
		com.goByBicycle();
		com.goByDieselVehicle();
	}

	@Override
	public void goByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println(" 2) Diesel vehicle chennai");
	}

	@Override
	public void goByBicycle() {
		// TODO Auto-generated method stub
		System.out.println("1) Bicycle chennai");
	}
}
