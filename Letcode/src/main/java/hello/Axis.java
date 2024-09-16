package hello;

public class Axis implements RBI  {

	public static void main(String[] args) {
		Axis customer = new Axis();
		customer.aadhaarMandatory();
		boolean result =customer.panMandatory();
		System.out.println(result);
		customer.interest();
		System.out.println(Axis.UPIlimit);
		RBI myrbi = new Axis();
		myrbi.houseLoan();
		
	}

	public void interest()
	{
		System.out.println("interest free");
	}
	
	@Override
	public void aadhaarMandatory() {
		System.out.println("aadhaar added");
		
	}

	@Override
	public boolean panMandatory() {
	
		return true;
		
	}

}
