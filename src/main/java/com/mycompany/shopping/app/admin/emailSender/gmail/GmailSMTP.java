/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shopping.app.admin.emailSender.gmail;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;
import java.util.Properties;
/**
 *
 * @author THUSH
 */
public class GmailSMTP {
    public void sendEmail(String Email, String generatedPassword, String type){
        System.out.println(Email);

        final String username = "";
        final String password = "";
        String fromEmail = username;
        String toEmail = Email;

        String host = "smtp.gmail.com";
        String port = "587";
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust","*");

        Session session = Session.getInstance(properties,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.addRecipient(
                    Message.RecipientType.TO,
                    new InternetAddress(toEmail)
            );
            message.setSubject("KINGSMEN Textile shop - Login credentials");
            String htmlCode = 
                    "<img src='https://ik.imagekit.io/lfdg74akzjt/Textile_shop/Textile-shop-header_r-aB5D5U3.jpg?ik-sdk-version=javascript-1.4.3&updatedAt=1645087237617' "
                    + "style='width: 100%;'/><br><br>"
                    + "<h1><strong>We are Kingsmen Textile Shop</strong></h1>"
                    + "<p>These are login details for admin panel of Textile shop.</p>"
                    + "<p>Please note that this email is associated with account."
                    + "<p>You are <b>"+type+ "</b> in Textile shop admin panel.</p>"
                    + "<p>your password is : <b>"+generatedPassword+"</b></p>"
                    + "<p>Use these credentials to log on to application, so keep it safe and don't share it with anyone.</p>"
                    + "<br><p>Thank you</p><br><br>";
            message.setContent(htmlCode, "text/html");
            Transport.send(message);

            System.out.println("Sended email");
            
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
