package abstractLog;

public class CustomerManager {
	//referans tuttuğu için base
	BaseDataBaseManager baseDataBaseManager;

	public void getCustomer() {

		baseDataBaseManager.getData();
	}
}
