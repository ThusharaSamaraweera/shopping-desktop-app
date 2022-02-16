/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shopping.app.admin;

/**
 *
 * @author THUSH
 */
public class Main {
    public static void main(String[] args) {
       String hash = HashPassword.hashPassword("passwo");
       System.out.println(hash);
       
       String hash1 = HashPassword.hashPassword("passwoe");
       System.out.println(hash1);
       
//       System.out.println(HashPassword.isValidPassword("passwor", "$2a$12$cXe.4aE8jfRGw29dRiy3i.yDRmLhk/ok39cp34DmGEITuLeh2/XFG"));
    }
}
