package gameProject.adapters;

import java.rmi.RemoteException;

import gameProject.business.validation.abstracts.UserValidationService;
import gameProject.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceManagerAdapter implements UserValidationService{

	@Override
	public boolean validate(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(
					customer.getIdentityNumber(), 
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth().getYear());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
