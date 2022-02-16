/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shopping.app.admin;
import java.security.NoSuchAlgorithmException;
import org.springframework.security.crypto.bcrypt.BCrypt;


/**
 *
 * @author THUSH
 */
public class HashPassword {
//    	public static void main(String[] args) throws NoSuchAlgorithmException
//	{
//		String  originalPassword = "password";
//		String generatedSecuredPasswordHash = BCrypt.hashpw(originalPassword, BCrypt.gensalt(12));
//		System.out.println(generatedSecuredPasswordHash);
//
//		boolean matched = BCrypt.checkpw(originalPassword, generatedSecuredPasswordHash);
//		System.out.println(matched);
//	}
    
    public static String hashPassword(String originalPassword){
        String generatedSecuredPasswordHash = BCrypt.hashpw(originalPassword, BCrypt.gensalt(12));
        return generatedSecuredPasswordHash;
    }
    
    public static boolean isValidPassword(String originalPassword, String hash){
        
        boolean matched = BCrypt.checkpw(originalPassword, hash);
        return matched;      
    }
    
}
