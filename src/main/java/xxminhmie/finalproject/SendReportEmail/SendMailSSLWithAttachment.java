package xxminhmie.finalproject.SendReportEmail;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMailSSLWithAttachment {
	public static void main(String[] args) {
		Properties props = new Properties();
		
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "587");

		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "587");
		
		props.put("mail.smtp.starttls.enable", "true");


		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("photoshopcs707@gmail.com", "lehokimMinh2112**");
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("photoshopcs707@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("minhmie2112@gmail.com"));

			message.setSubject("Testing Subject 1");
			BodyPart messageBodyPart1 = new MimeBodyPart();
			messageBodyPart1.setText("This is message body");
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();
			String filename = "test-output/index.html";
			DataSource source = new FileDataSource(filename);			
			messageBodyPart2.setDataHandler(new DataHandler(source));
			messageBodyPart2.setFileName(filename);
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart2);
			multipart.addBodyPart(messageBodyPart1);

			// set the content
			message.setContent(multipart);

			Transport.send(message);
			System.out.println("=====Email Sent=====");
		} catch (MessagingException e) {
			System.out.print(e.getMessage());
			throw new RuntimeException(e);
		}

	}
}