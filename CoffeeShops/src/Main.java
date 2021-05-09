



import Abstract.*;
import Adapters.MernisServiceAdapter;
import Concrete.*;
import Entities.*;




public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager =new StarbucksCustomerManager(new MernisServiceAdapter());
		
		
		customerManager.Save(new Customer(1,"Burak","Öztaþ",25031994,24800298092L));
}
}