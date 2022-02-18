/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shopping.app.admin;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import org.springframework.security.crypto.bcrypt.BCrypt;


/**
 *
 * @author THUSH
 */
public class HashPassword {
    
    public static String hashPassword(String originalPassword){
        String generatedSecuredPasswordHash = BCrypt.hashpw(originalPassword, BCrypt.gensalt(12));
        return generatedSecuredPasswordHash;
    }
    
    public static boolean isValidPassword(String password, String hash){
        boolean matched = BCrypt.checkpw(password, hash);
        return matched;      
    }
    
}
