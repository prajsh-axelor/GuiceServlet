import com.axelor.dao.ContactDao;
import com.axelor.db.Contact;
import com.axelor.module.DbModule;
import com.google.inject.Guice;
import com.google.inject.Injector;


public class Main {
	public static void main(String [] args) {
		Injector injector = Guice.createInjector(new DbModule());
		ContactDao contactDao = injector.getInstance(ContactDao.class);
		
		contactDao.saveContact(new Contact("Prajjwal"));
	}

}
