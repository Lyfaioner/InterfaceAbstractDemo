import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Adapters.MerniceServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {



	public static void main(String[] args) {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MerniceServiceAdapter());
		Customer customer1 = new Customer();
		customer1.setDateOfBirth(2000,1,6);
		customer1.setFirstName("Sinan");
		customer1.setId(1);
		customer1.setLastName("Türk");
		customer1.setNationalityId("12345678910");
		
		customerManager.save(customer1);
		
	}

	
}
