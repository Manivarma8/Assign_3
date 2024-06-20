package india.newDelhi;

 class CommonManInDelhi implements TrafficRulesDelhi {

	 public static void main(String[] args) {
		 CommonManInDelhi comm = new CommonManInDelhi();
		 comm.dontGoByDieselVehicle();
		 comm.goByBicycle();
	}
	@Override
	public void dontGoByDieselVehicle() {
		// TODO Auto-generated method stub
		System.out.println(" 1) Diesel vehicle delhi");
	}

	@Override
	public void goByBicycle() {
		System.out.println(" 2) Bicycle delhi");
		// TODO Auto-generated method stub
		
	}

}
