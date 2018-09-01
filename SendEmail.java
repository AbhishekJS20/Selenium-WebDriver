
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

@Test
public class SendEmail {
	public void send()
	{
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("abhishek.naik171@gmail.com", "password"));
		email.setSSLOnConnect(true);
		email.setFrom("user@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		//email.addTo("foo@bar.com");
		email.send();
	}
	
}
