package com.the501s.the501s.services;

import com.the501s.the501s.models.Email;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@EnableEncryptableProperties
public class EmailService {

    @Value("${spring.mail.username}")
    private String user;

    @Value("${spring.mail.password}")
    private String password;

    private final String host = "email-smtp.us-east-1.amazonaws.com";
    private Properties props = new Properties();
    protected Session session;


    // Setup
    private void setup() {

        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "25");

        session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });
    }

    public void SendContactFormEmail(Email email) {
        setup();
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("donotreply@the501s.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("501musictx@gmail.com"));
            message.setSubject(
                email.getFirstName() + " " + email.getLastName() +
                " hit us up!!"
            );
            
            String htmlText = "<html><body>" +
                "<h3>Follow up with: " + email.getFirstName() + "</h3>" + 
                "<h4>email:  " + email.getEmail() + "</h4>" +
                "<h4>Dude! they said:  " + email.getMessage() + "</h4>" +
                "</body></html>";
            message.setContent(htmlText, "text/html");
            Transport.send(message);
            System.out.println("Email was sent");
         } catch (MessagingException e) {
             throw new RuntimeException(e);
         }
    }

    public void SendRequestFormEmail(Email email) {
        setup();
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("no-reply@the501s.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("501musictx@gmail.com"));
            message.setSubject(
                email.getName() + " hit us up with a request!"
            );
            String body = "<html><body>" + 
                "<h3>Follow up with: " + email.getName() + "</h3>" +
                "<h4>email: " + email.getEmail() + "</h4>" + 
                "<h4>they requested: " + email.getRequest() + "</h4>" + 
                "</body></html>";
            message.setContent(body, "text/html");
            Transport.send(message);
            System.out.println("Contact request form email sent!");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public void SendVotingFormEmail(Email email) {
        setup();
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("no-reply@the501s.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("501musictx@gmail.com"));
            message.setSubject(
                email.getName() + " voted for us!!"
            );
            String body = "<html><body>" + 
            "<h3>Follow up with: " + email.getName() + "</h3>" + 
            "<h4>email: " + email.getEmail() + " </h4>" + 
            "<h4>they left this comment: " + email.getComment() + "</h4>" + 
            "</body></html>";
            message.setContent(body, "text/html");
            Transport.send(message);
            System.out.println("voting contact form sent!");
        } catch(MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}