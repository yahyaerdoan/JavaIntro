package abstractLog;

public class CustomerManager {
	//referans tuttu�u i�in base
	BaseDataBaseManager baseDataBaseManager;

	public void getCustomer() {

		baseDataBaseManager.getData();
	}
}
