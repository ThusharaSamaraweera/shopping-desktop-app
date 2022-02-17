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
       String hash = HashPassword.hashPassword("passodd");
       System.out.println(hash);
       
       String hash3 = "";
       String password = "passod";
       System.out.println(HashPassword.isValidPassword(password, hash));
    }
}
