import javapns.Push;
import javapns.communication.exceptions.CommunicationException;
import javapns.communication.exceptions.KeystoreException;
import junit.framework.TestCase;

public class SendAppleNotification extends TestCase {
	public void testNotification()
	{
		try {
			Push.alert("Boo!", "C:\\iPhoneCert\\SerenaAgilePushDemo.p12", "thisisapassword", false, "39bd946c5c211778819a3acc3dc7a52bab23b91cd9f1882fea5afbc69e590197");
		} catch (CommunicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeystoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}

}