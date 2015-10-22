/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Usuario;

/**
 *
 * @author Saraii
 */
public class Security extends Secure.Security {
    
    static boolean autenticar(String username, String password) {
        Usuario usuario = Usuario.find("byEmail", username).first();
        return usuario != null && usuario.password.equals(password);
    }
}
