package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {
	
	public boolean CheckIfRealPerson(Customer customer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(customer.getNationalId(), customer.getFirstName(), customer.getLastName(),
					customer.dateOfBirth);
		} catch (RemoteException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return false;
	}
}
