package hello;

public interface RBI {
	
	int UPIlimit =50000;
	
	  void aadhaarMandatory();
	boolean panMandatory();
	default void houseLoan(){
		System.out.println("houseloan");
	}
	
	static void bikeLoan(){
		System.out.println("bikeloan");
	}

}
