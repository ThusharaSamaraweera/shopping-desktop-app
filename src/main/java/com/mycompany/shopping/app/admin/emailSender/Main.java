/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shopping.app.admin.emailSender;

import com.mycompany.shopping.app.admin.emailSender.gmail.GmailSMTP;

/**
 *
 * @author THUSH
 */
public class Main {
    public static void main(String[] args) {
        GmailSMTP gmailSMTP = new GmailSMTP();
        String email = "thusharamalinda204@gmail.com";
        String generatedPassword = "1234";
        gmailSMTP.sendEmail(email, generatedPassword, "Super admin");
    }
}
