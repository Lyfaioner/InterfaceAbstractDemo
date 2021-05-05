package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class MerniceServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		System.out.println("Kontrol edildi");	
		return true;
	}

}
