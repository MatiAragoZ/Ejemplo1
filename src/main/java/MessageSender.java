import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class MessageSender {
    public static void main(String[] args) {
        try {
            Email email = new SimpleEmail();
            email.setHostName("smtp.gmail.com");
            email.setSmtpPort(587);
            email.setAuthenticator(new DefaultAuthenticator("matiasaravena231@gmail.com", "wdpzuwpdouiataue"));
            email.setStartTLSEnabled(true);
            email.setFrom("matiasaravena231@gmail.com");
            email.setSubject("Prueba de envío de mensaje");
            email.setMsg("Este es un mensaje de prueba enviado desde Java utilizando Maven.");
            email.addTo("matias.aravena@cftsanagustin.cl");
            email.send();
            System.out.println("Mensaje enviado con éxito.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

